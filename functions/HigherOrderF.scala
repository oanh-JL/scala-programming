object HigherOrderF {

    def reverser(s:String) :String = s.reverse

    def excuteString(s: String, f: String => String) {
        f(s) 
    }

    def main(args:Array[String]) {
        println(excuteString("abs", reverser))
    }
}