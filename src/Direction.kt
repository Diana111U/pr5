open class Direction( randomCity1 : String, randomCity2 : String) {
    val directions1 = listOf(
        "Самара",
        "Воронеж",
        "Пермь",
        "Краснодар",
        "Астана",
        "Нижний Новгород",
        "Санкт-Петербург",
        "Москва",
        "Рязань",
        "Тула",
        "Саратов",
        "Саранск",
        "Уфа",
        "Новосибирск",
        "Екатеринбург"
    )
    val directions2 = listOf(
        "Сочи",
        "Якутск",
        "Магнитогорск",
        "Пятигорск",
        "Калуга",
        "Нижний Тагил",
        "Архангельск",
        "Владикавказ",
        "Химки",
        "Таганрог",
        "Люберцы",
        "Тамбов",
        "Благовещенск",
        "Петрозаводск",
        "Братск"
    )
    open val randomCity1 = directions1.random()
    open val randomCity2 = directions2.random()
    init {


        println("Поезд следует по направлению "+ randomCity1+" - "+ randomCity2)
    }


}