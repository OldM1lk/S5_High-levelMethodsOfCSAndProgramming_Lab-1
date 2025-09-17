fun main(args: Array<String>) {
    val words = getWords(args)
    val stats = processWords(words)
    printStats(stats)
}

fun getWords(args: Array<String>): List<String> =
    if (args.isNotEmpty()) {
        args.toList()
    } else {
        val input = readlnOrNull().orEmpty()
        input.split("\\s+".toRegex()).filter { it.isNotBlank() }
    }

fun processWords(words: List<String>): List<Pair<String, Int>> =
    words
        .sorted()
        .groupingBy { it }
        .eachCount()
        .toList()
        .sortedByDescending { it.second }

fun printStats(stats: List<Pair<String, Int>>) =
    stats.forEach { (word, count) -> println("$word $count") }
