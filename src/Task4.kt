fun main(args: Array<String>) {
    args.sort()
    val distinctArgsCount: Map<String, Int> = args.groupingBy { it }.eachCount()
    distinctArgsCount.forEach { println(it.key + " " + it.value) }
}