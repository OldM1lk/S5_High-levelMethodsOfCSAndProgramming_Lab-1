fun main(args: Array<String>) {
    val distinctArgsCount: Map<String, Int> = if (args.isNotEmpty()) {
        args.groupingBy { it }.eachCount()
    } else {
        val input = readlnOrNull()
        input?.split(" ")?.groupingBy { it }?.eachCount() ?: emptyMap()
    }
    val sortedDistinctArgsCount = distinctArgsCount
        .toList()
        .sortedWith(compareByDescending<Pair<String, Int>> { it.second }
            .thenBy { it.first })
        .toMap()
    sortedDistinctArgsCount.forEach { println(it.key + " " + it.value) }
}