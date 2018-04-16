object TapeEquilibrium extends App {
  def solution(a: Array[Int]): Int = {
    val i     = diffTwoParts(a, a.length / 2)
    val tuple = a.splitAt(i)
    Math.abs(tuple._1.sum - tuple._2.sum)
  }

  private def diffTwoParts(a: Array[Int], splitPoint: Int): Int = {
    def loop(a: Array[Int], previousSplitPoint: Int, currentSplitPoint: Int): Int = {
      println(previousSplitPoint + " " + currentSplitPoint)
      if (currentSplitPoint == previousSplitPoint)
        currentSplitPoint
      else {
        val parts = a.splitAt(currentSplitPoint)
        println(parts._1.mkString(",") + ":" + parts._2.mkString(","))
        println()
        if (parts._1.sum > parts._2.sum)
          loop(a, currentSplitPoint, a.length / 2 - parts._1.length / 2)
        else
          loop(a, currentSplitPoint, a.length / 2 + parts._2.length / 2)
      }
    }
    loop(a, 0, splitPoint)
  }

  println(solution(Array(3, 1, 2, 4, 3, 6, 1000)))
}
