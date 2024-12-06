object Acronym {
  fun generate(phrase: String) : String {
    val sanitized = phrase.replace("[^a-zA-Z -]".toRegex(), "")
    val splited = sanitized.split("[ -]+".toRegex())
    return splited.map { it[0] }.joinToString("").uppercase()
  }
}
