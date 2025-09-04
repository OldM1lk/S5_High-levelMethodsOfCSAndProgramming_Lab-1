fun main(args: Array<String>) {
    // distinct() не работает пришлось делать костыли
    val distinctArgs = mutableListOf<String>()

    args.forEach {
        if (!distinctArgs.contains(it)) {
            distinctArgs.add(it)
        }
    }

    distinctArgs.sort()
    distinctArgs.forEach { println(it) }
}