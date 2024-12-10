data class Coord(val x: Int, val y: Int)
data class TrailPath(val path: List<TopologyItem>)
abstract class TopologyItem(val position: Coord, val height: Int)
class Trailhead(position: Coord): TopologyItem(position, 0)
class TrailPathRegion(position: Coord, height: Int): TopologyItem(position, height)

fun main() {
    val part1 = input
        .toTopology()
        .toTrailheadPaths()
        .toTrailheadScore()
        .values.sum()

    println("Part 1: $part1")

    val part2 = input
        .toTopology()
        .toTrailheadPaths()
        .toTrailheadRating()
        .values.sum()

    println("Part 2: $part2")
}

private fun List<String>.toTopology(): Map<Coord, TopologyItem> =
    this.mapIndexed { y, row ->
        row.mapIndexed { x, c ->
            val position = Coord(x, y)
            position to when(val height = c.digitToInt()) {
                0 -> Trailhead(position)
                else -> TrailPathRegion(position, height)
            }
        }
    }.flatten().toMap()

private fun Map<Coord, TopologyItem>.toTrailheadPaths(): List<TrailPath> =
    this.filter { it.value is Trailhead }.values
    .flatMap { trailhead ->
        this.toTrailheadPath(trailhead)
    }

private fun Map<Coord, TopologyItem>.toTrailheadPath(topologyItem: TopologyItem): List<TrailPath> {
    if(topologyItem.height == 9) {
        return listOf(TrailPath(listOf(topologyItem)))
    }

    return this
        .toNextTopologyItems(topologyItem)
        .flatMap { nextItemInPath ->
            val paths = this.toTrailheadPath(nextItemInPath)
            paths.map {
                TrailPath(listOf(topologyItem).plus(it.path))
            }
                .filter { completedPath -> completedPath.path.any { it.height == 9 } }
        }
}

private fun Map<Coord, TopologyItem>.toNextTopologyItems(topologyItem: TopologyItem): List<TopologyItem> {
    val nextHeight = topologyItem.height + 1
    val up = topologyItem.position.copy(y = topologyItem.position.y - 1)
    val right = topologyItem.position.copy(x = topologyItem.position.x + 1)
    val down = topologyItem.position.copy(y = topologyItem.position.y + 1)
    val left = topologyItem.position.copy(x = topologyItem.position.x - 1)
    return listOfNotNull(this[up], this[right], this[down], this[left])
        .filter { it.height == nextHeight }
}

private fun List<TrailPath>.toTrailheadScore(): Map<Trailhead, Int> =
    this.groupBy { it.path.first() as Trailhead }
        .mapValues { (_, paths) ->
            paths.distinctBy { it.path.last() }.count()
        }

private fun List<TrailPath>.toTrailheadRating(): Map<Trailhead, Int> =
    this.groupBy { it.path.first() as Trailhead }
        .mapValues { (_, paths) ->
            paths.count()
        }