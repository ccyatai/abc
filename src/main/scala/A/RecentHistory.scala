package A

trait PO {
  println("trait PO abc 2.0-SNAPSHOT")
}

object PO {
  println("object PO abc 2.0-SNAPSHOT")
  case class V1() extends PO
  case class V2() extends PO
}

trait Click {
  println("trait Click abc 2.0-SNAPSHOT")
  def po: PO
}

object Click {
  println("object Click abc 2.0-SNAPSHOT")
  case class V1(po: PO.V1) extends Click
}

trait RecentHistory {
  println("trait RecentHistory abc 2.0-SNAPSHOT")
  def clicks: Map[String, Click]
}

object RecentHistory {
  println("object RecentHistory abc 2.0-SNAPSHOT")
  case class V1(clicks: Map[String, Click.V1]) extends RecentHistory
}
