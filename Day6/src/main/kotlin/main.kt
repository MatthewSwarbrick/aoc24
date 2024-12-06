data class Coord (val x: Int, val y: Int)
enum class GridItem {
    GUARD, EMPTY_SPACE, OBSTACLE
}
enum class Direction {
    NORTH, EAST, SOUTH, WEST
}

fun main() {
    val part1 = input
        .toGrid()
        .toTravelledPath(Direction.NORTH)
        .count()

    println("Part 1: $part1")
}

private fun List<String>.toGrid(): Map<Coord, GridItem> =
    this.mapIndexed { y, row ->
        row.mapIndexed { x, gridItem ->
            val item = when(gridItem) {
                '.' -> GridItem.EMPTY_SPACE
                '#' -> GridItem.OBSTACLE
                '^' -> GridItem.GUARD
                else -> GridItem.EMPTY_SPACE
            }

            Coord(x, y) to item
        }
    }
        .flatten()
        .toMap()

private fun Map<Coord, GridItem>.toTravelledPath(directionOfTravel: Direction, currentPath: List<Coord> = emptyList()): Set<Coord> {
    val currentPosition = this.entries.first { it.value == GridItem.GUARD }.key
    val nextPosition = currentPosition.toNextPosition(directionOfTravel)

    when {
        this.containsKey(nextPosition) && this[nextPosition] == GridItem.EMPTY_SPACE -> {
            val updatedGrid = this.updateGuardPosition(currentPosition, nextPosition)
            return updatedGrid.toTravelledPath(directionOfTravel, currentPath.plus(currentPosition))
        }
        this.containsKey(nextPosition) && this[nextPosition] == GridItem.OBSTACLE -> {
            val newDirection = directionOfTravel.turnRight()
            return this.toTravelledPath(newDirection, currentPath)
        }
        else -> return currentPath.plus(currentPosition).toSet()
    }
}

private fun Map<Coord, GridItem>.updateGuardPosition(currentPosition: Coord, nextPosition: Coord): Map<Coord, GridItem> =
    this.map { (coord, item) ->
        when(coord) {
            currentPosition -> coord to GridItem.EMPTY_SPACE
            nextPosition -> coord to GridItem.GUARD
            else -> coord to item
        }
    }.toMap()

private fun Coord.toNextPosition(direction: Direction): Coord =
    when(direction) {
        Direction.NORTH -> this.copy(y = this.y - 1)
        Direction.EAST -> this.copy(x = this.x + 1)
        Direction.SOUTH -> this.copy(y = this.y + 1)
        Direction.WEST -> this.copy(x = this.x - 1)
    }

private fun Direction.turnRight(): Direction =
    when(this) {
        Direction.NORTH -> Direction.EAST
        Direction.EAST -> Direction.SOUTH
        Direction.SOUTH -> Direction.WEST
        Direction.WEST -> Direction.NORTH
    }