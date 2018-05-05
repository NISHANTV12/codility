package time_complexity

import scala.annotation.tailrec

object TapeEquilibrium {

  def solution(a: Array[Int]): Int = {
    @tailrec
    def loop(a: Array[Int], splitPoint: Int, equilibrium: Int): Int = splitPoint match {
      case 0 ⇒ equilibrium
      case _ ⇒
        val tuple = a.splitAt(splitPoint)
        val diff  = Math.abs(tuple._1.sum - tuple._2.sum)
        if (diff < equilibrium)
          loop(a, splitPoint - 1, diff)
        else
          loop(a, splitPoint - 1, equilibrium)
    }
    loop(a, a.length - 1, Int.MaxValue)
  }

}
