package subtask2

class Abbreviation {

    // TODO: Complete the following function
    fun abbreviationFromA(a: String, b: String): String {
        var result = ""
        for( c in a) {
            val cUp = c.toUpperCase()
            if(cUp in b) result += cUp
        }
        return if (result == b) "YES" else "NO"
    }
}
