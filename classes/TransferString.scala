object TransferString {
    implicit class run(val s: String) {
    def increament : String = s.map( c => (c+1).toChar) 
    def decreament : String = s.map( c => (c+1).toChar) 
    }
}