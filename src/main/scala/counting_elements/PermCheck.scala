package counting_elements

object PermCheck {
  def solution(a: Array[Int]): Int = {
    def loop(a: Array[Int], index: Int): Int = {
      if (index == a.length - 1) 1
      else if (a(index) != index + 1) 0
      else loop(a, index + 1)
    }
    val arr = Array.ofDim[Int](a.length + 1)
    val hasNumberGreaterThanLength: Boolean =
      a.indices.exists(index ⇒ {
        if (a(index) > a.length) true
        else {
          arr(a(index) - 1) = a(index)
          false
        }
      })

    if (hasNumberGreaterThanLength) 0
    else loop(arr, 0)
  }
}
