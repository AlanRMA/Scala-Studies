object Script {

    val functionList = List((x:Int)=>x+1,(x:Int)=> x*x,(x:Int)=> if x % 2 ==0 then true else false)
    def main(args: Array[String]): Unit = {
    println(functionList(2)(6))
}
}