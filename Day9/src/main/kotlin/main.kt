data class FileBlockPart(val value: String)

fun main() {
    val part1 = input
        .toExpandedFileParts()
        .moveFileBlocksToFreeSpace()
        .toChecksum()

    println("Part 1: $part1")
}

private fun String.toExpandedFileParts(): List<List<FileBlockPart>> =
    this.mapIndexed { index, char ->
        val fileBlockLength = char.digitToInt()
        val isFile = index % 2 == 0
        val fileId = index / 2

        val filePart = if(isFile) {
            FileBlockPart("$fileId")
        } else {
            FileBlockPart(".")
        }

        (1..fileBlockLength).map {
            filePart
        }
    }
        .filter { it.isNotEmpty() }

private fun List<List<FileBlockPart>>.moveFileBlocksToFreeSpace(): List<List<FileBlockPart>> {
    val fileBlocks = this.toMutableList()

    while (true) {
        val indexOfFirstFreeSpaceBlock = fileBlocks.indexOfFirst { block -> block.any { it.value == "." } }
        val indexOfLastFileBlock = fileBlocks.indexOfLast { block -> block.any { it.value != "." } }

        if (indexOfFirstFreeSpaceBlock >= indexOfLastFileBlock) {
            break
        }

        val lastFileBlock = fileBlocks[indexOfLastFileBlock]
        val fileIndexFromLastFileBlock = lastFileBlock.indexOfLast { it.value != "." }
        val fileToMove = lastFileBlock[fileIndexFromLastFileBlock]

        val updatedLastFileBlock = lastFileBlock
            .mapIndexed { index, block ->
                if (index == fileIndexFromLastFileBlock) {
                    FileBlockPart(".")
                } else {
                    block
                }
            }
        fileBlocks[indexOfLastFileBlock] = updatedLastFileBlock

        val firstFreeSpaceBlock = fileBlocks[indexOfFirstFreeSpaceBlock]
        val freeSpaceIndex = firstFreeSpaceBlock.indexOfFirst { it.value == "." }
        val updatedFirstFreeSpaceBlock = firstFreeSpaceBlock
            .mapIndexed { index, block ->
                if (index == freeSpaceIndex) {
                    fileToMove
                } else {
                    block
                }
            }
        fileBlocks[indexOfFirstFreeSpaceBlock] = updatedFirstFreeSpaceBlock
    }

    return fileBlocks
}

private fun List<List<FileBlockPart>>.toChecksum(): Long =
    this.flatten()
        .filter { it.value != "." }
        .foldIndexed(0L) { index, acc, block ->
            acc + (block.value.toInt() * index)
        }