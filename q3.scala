object main extends App{
    def toUpper(str : String): String = {
        str.toUpperCase()
    }
    def tolower(str: String): String = {
        str.toLowerCase()
    }
    def formatNames(name: String, opp: Int): String = {
        if(opp == 1){
            toUpper(name)
        }
        else if(opp == 2){
            tolower(name)
        }
        else{
            "Invalid Type"
        }
    }
    println("1 ->> ToUpper")
    println("2 ->> ToLower")
    val a = scala.io.StdIn.readLine()
    val b = scala.io.StdIn.readInt()
    print(formatNames(a, b))
}