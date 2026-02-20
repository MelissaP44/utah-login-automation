package utils

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

class DateTimeUtil {

    static String now(String pattern = "yyyy-MM-dd_HH-mm-ss") {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(pattern))
    }
}