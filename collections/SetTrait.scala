import scala.collection.immutable
object SetTrait {
    def main(args:Array[String]) {
        var names = immutable.Set("Oanh")
        names += "Hieu"
        println(names)
        // val grade = Array("a","b","c")
        // grade.foreach(println)
        // grade.apply(1)
        // grade.foreach(println)

    }
}