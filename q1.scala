object q1 extends App{
    def calculateinterest(deposit:Int):Double = {
        val inetrestRate = calinterestrate(deposit)
        deposit*inetrestRate
    }
    def calinterestrate(y:Int):Double = y match{
        case x if (y <= 2000) => 0.02
        case x if (y <= 20000) => 0.04
        case x if (y <= 200000) => 0.035
        case _ => 0.065
    }
    

    printf("%.2f",calculateinterest(150000))
}