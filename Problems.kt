data class Event (
    val title: String,
    val description: String? = null,
    val daypart: DayPart,
    val duration: Int
)

enum class DayPart {
    MORNING, AFTERNOON, EVENING
}

fun main(){
    val event1 = Event(title = "Wake up", description = "Time to get up", daypart = DayPart.MORNING, duration = 0)
    val event2 = Event(title = "Eat breakfast", daypart = DayPart.MORNING, duration = 15)
    val event3 = Event(title = "Learn about Kotlin", daypart = DayPart.AFTERNOON, duration = 30)
    val event4 = Event(title = "Practice Compose", daypart = DayPart.AFTERNOON, duration = 60)
    val event5 = Event(title = "Watch latest DevBytes video", daypart = DayPart.AFTERNOON, duration = 10)
    val event6 = Event(title = "Check out latest Android Jetpack library", daypart = DayPart.EVENING, duration = 45)

    val events = mutableListOf<Event>(event1, event2, event3, event4, event5, event6)
    
    val shortEvents = events.filter{
        it.duration <= 60
    }
    println("You have ${shortEvents.size} short events.")

    val groupedEvents = events.groupBy { it.daypart }
    groupedEvents.forEach { (daypart, events) ->
        println("$daypart: ${events.size} events")
    }
    println("Last event of the day: ${events.last().title}")
}