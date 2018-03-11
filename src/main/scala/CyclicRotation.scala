object CyclicRotation extends App {
  def solution(a: Array[Int], k: Int): Array[Int] = {
    def rotate(list: List[Int], count: Int): List[Int] = {
      count match {
        case 0 ⇒ list
        case _ ⇒ rotate(list.last :: list.init, count - 1)
      }
    }
    if (a.isEmpty)
      a
    else
      rotate(a.toList, k).toArray
  }

  private val ints: Array[Int] = solution(Array(3, 8, 9, 7, 6), 3)
  println(ints.toList)
}
