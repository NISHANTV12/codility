package time_complexity

object PermMissingElem {
  def solution(a: Array[Int]): Int = {
    def loop(a: Array[Int], index: Int): Int = {
      if (a(index) != index + 1) index + 1
      else loop(a, index + 1)
    }
    val arr = Array.ofDim[Int](a.length + 1)
    a.indices.foreach(index ⇒ arr(a(index) - 1) = a(index))
    loop(arr, 0)
  }
}
