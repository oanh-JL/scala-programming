import java.io._

class Point( val xc:Int, val yc: Int) {

    var x:Int =  xc
    var y:Int =  yc

    def move(dx: Int, dy: Int) {
        x = x + dx
        y = y + dy
        println("Point location : ("+x+ ","+y)
    }
}

class SubClass(xc:Int, yc:Int) extends Point(xc, yc) {
}
    object ExtendingClass {
        def main(args:Array[String]) {
            val A = new SubClass(1,2)
            A.move(1,1)
            var arr = Nil
             arr = 1::arr
            val x = List(1,2,3)
            var arr2 = arr:::x
            for(i <- arr) {
                println(i)
            }
        }
    }