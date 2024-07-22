import kotlin.random.Random

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
suspend fun main() {
    //TODO 1.	Написать класс Person с полями в конструкторе name и age, класс.
    // Создать список persons, в который включить несколько объектов этого класса.
    // Написать класс Weather с полями city, description, temp, создать список из
    // нескольких объектов этого класса. Создать список случайных чисел в диапазоне
    // от 1 до 100 из 10 элементов. Представим, что эти три списка мы планируем
    // загрузить с сервера. Необходимо написать обобщенную suspend – функцию,
    // принимающую на вход список параметра T и в результат возвращающую скачанный
    // этот же список. Она будет имитировать скачивание данных. Внутри функции с
    // задержкой в 1000L выводить скачанные данные. В главной функции нужно вызвать
    // функции загрузки трех имеющихся списков: personList, weatherList, randoms.
    // Мы будем наблюдать, как идет процесс загрузки (элементы в функции выводятся).
    // Главный поток при их загрузке останавливается. Когда загрузка заканчивается в
    // консоль выходит фраза «Данные загружены» и выводятся все три списка. В
    // завершении выходит фраза «Программа завершена».
    println("1. Задание")

    val personList = listOf(
        Person("Александр", 39),
        Person("Валентина", 27),
        Person("Григорий", 17),
        Person("Ирина",45),
        Person("Сергей",50),
        Person("Игорь", 39)
    )

    val weatherList = listOf(
        Weather("Москва","Жарко и безветренно", 35),
        Weather("Котовск","Жарко и безветренно", 32),
        Weather("Ноябрьск","Прохладно, дожди, ветер", 15),
        Weather("Новый Уренгой","Прохладно, дожди, снег", 0),
        Weather("Пермь","Тепло, солнечно, небольшой ветер", 26),
        Weather("Казань","Тепло, солнечно, небольшой ветер", 27),
    )

    val randoms = List(10) { Random.nextInt(0, 100) }

    val resultPersonDownload = download(personList)
    val resultWeatherDownload = download(weatherList)
    val resultRandomDownload = download(randoms)

    println("Данные загружены\n")
    println(resultPersonDownload)
    println(resultWeatherDownload)
    println(resultRandomDownload)
    println("\nПрограмма завершена")

    getLine("^")
}