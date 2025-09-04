fun main(args: Array<String>) {
    val distinctArgsCount: Map<String, Int> = args.groupingBy { it }.eachCount()
    val sortedDistinctArgsCount = distinctArgsCount
        .toList()
        .sortedWith(compareByDescending<Pair<String, Int>> { it.second }
            .thenBy { it.first })
        .toMap()
    sortedDistinctArgsCount.forEach { println(it.key + " " + it.value) }
}