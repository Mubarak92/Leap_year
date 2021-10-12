fun main() {

    val year = 1401

    if (year >=1582){
        if (year%4 == 0)
            println("leap year")
        else
            println("not leap")

    }
    else if  (year <1582 ) {
         if (year % 400 == 0)
            println("leap year")
        else if (year % 100 == 0)
            println("not leap year")
        else if (year % 4 == 0)
        println("leap year")

        else
             println("not leap")
    }
}