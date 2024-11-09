import kotlin.random.Random
import kotlin.random.nextInt

open class CashDesk(people: Int) {
    open val people  = Random.nextInt(5..201)
    init {
        println("Количество пассажиров, купивших билет: "+people.toString())
    }
}