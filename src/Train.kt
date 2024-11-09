import kotlin.random.Random
import kotlin.random.nextInt

open class Train(people: Int, vagonNum : Int):CashDesk(people) {
    open var vagonNum=0

    init {
        while(people>0)
        {
            vagonNum++
            val places  = Random.nextInt(5..25)
            var freeplaces=people-places
            println("В вагоне номер "+vagonNum+" вместимость "+places+" пассажиров")
        }
    }

}
