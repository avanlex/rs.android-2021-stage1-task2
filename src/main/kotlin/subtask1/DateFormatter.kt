package subtask1

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        return try {
            val date = LocalDate.of(year.toInt(), month.toInt(), day.toInt())
            val dtf = DateTimeFormatter.ofPattern("dd MMMM, eeee", Locale("ru"))
            dtf.format(date)
        } catch (e: Exception) {
            "Такого дня не существует"
        }
    }
}
