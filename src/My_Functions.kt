import kotlinx.coroutines.delay

suspend fun <T> download (list: List<T>): List<T>{
    var k = 1
    for (element in list){
        delay(1000L)
        println("Загружено #${k++}: $element")
    }
    println("\nСписок загружен")
    getLine("_")
    return list
}