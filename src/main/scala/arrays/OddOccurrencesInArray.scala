package arrays

object OddOccurrencesInArray {

  private def isOddNumberOfElements(a: Array[Int]): Boolean = if (a.length % 2 == 1) true else false

  private def isElementsInValidRange(a: Array[Int]): Boolean = a.forall(elem ⇒ 1 <= elem && elem <= 1000000000)

  def solution(a: Array[Int]): Int = {
    if (isOddNumberOfElements(a) && isElementsInValidRange(a) && a.length <= 1000000)
      a.fold(0)((x, y) ⇒ x ^ y)
    else -1
  }
}
