object BinaryGap {
  def solution(n: Int): Int = {
    def binaryGap(binary: String, currentGap: Int, gaps: List[Int]): List[Int] = {
      if (binary.isEmpty)
        gaps
      else
        binary.head match {
          case '0' ⇒ binaryGap(binary.tail, currentGap + 1, gaps)
          case '1' ⇒ binaryGap(binary.tail, 0, currentGap :: gaps)
        }
    }
    val binaryString = n.toBinaryString
    val str          = binaryString.substring(binaryString.indexOf('1') + 1)
    if (str.nonEmpty) {
      val list = binaryGap(str, 0, List.empty)
      if (list.isEmpty)
        0
      else
        list.max
    } else 0
  }
}
