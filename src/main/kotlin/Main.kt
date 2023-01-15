val secondMeter = 54321

fun main(){

    when {
        secondMeter in 1..59 -> nowMeter()
        secondMeter > 60 && secondMeter <= 60*60 -> minuteMeter()
        secondMeter > 60*60 && secondMeter <= 24*60*60 -> hourMeter()
        secondMeter > 24*60*60 && secondMeter <= 2*24*60*60 -> todayMeter()
        secondMeter > 2*24*60*60 && secondMeter <= 3*24*60*60 -> yesterdayMeter()
        secondMeter > 3*24*60*60 -> forALongTimeMeter()
    }
}

fun nowMeter(){
    println("был(а) только что")
}

fun minuteMeter(){
    val minute = secondMeter/60
    val lastMinuteFigure = minute%10
    when {
        lastMinuteFigure ==1 &&
                minute != 11 -> println("был(а) в сети $minute минуту назад")
        lastMinuteFigure in 2..4 &&
                minute != 12 &&
                minute != 13 &&
                minute != 14 -> println("был(а) в сети $minute минуты назад")
        else -> println("был(а) в сети $minute минут назад")
    }
}

fun hourMeter(){
    val hour = secondMeter/(60*60)
    val lastHourFigure = hour%10
    when {
        lastHourFigure ==1 &&
                hour != 11 -> println("был(а) в сети $hour час назад")
        lastHourFigure in 2..4 &&
                hour != 12 &&
                hour != 13 &&
                hour != 14 -> println("был(а) в сети $hour часа назад")
        else -> println("был(а) в сети $hour часов назад")
    }
}

fun  todayMeter(){
    println("был(а) в сети сегодня")
}

fun  yesterdayMeter(){
    println("был(а) в сети вчера")
}

fun forALongTimeMeter(){
    println("был(а) в сети давно")
}