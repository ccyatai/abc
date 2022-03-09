object Test extends App {
  println("abc Test extends App")
}

case class AAA()

object reader1 extends App {

//  reader2
  println("abc")
  println("scala.io.Source.fromFile(\"data\").mkString")
  val tree = scala.io.Source.fromFile("src/main/resources/data").mkString
  println(tree)

  println("getClass.getClassLoader.getResourceAsStream(\"data\")")
  val ip = getClass.getClassLoader.getResourceAsStream("data")
  val arr: Array[Byte] = new Array(256)
  //  ip.read(arr)
  println(scala.io.Source.fromInputStream(ip).getLines().toSeq.head)

  println("getClass.getResourceAsStream(\"data\")")
  val ip2 = getClass.getResourceAsStream("/data")
  println(scala.io.Source.fromInputStream(ip2).getLines().toSeq.head)
}