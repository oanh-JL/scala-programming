object FCF {
    def distance(x:Int,y:Int): Double = x*x+y*y

    def compare(x:Int, y:Int):Double = if(x>y) distance(x,y) else x*y

    def main(args:Array[String]) {
        println(distance(3,4))
        println(compare(4,5))
    }

}