object TapeEquilibrium {
  def solution(a: Array[Int]): Int = {
    val splitPoint = a.length / 2
    val parts      = a.splitAt(splitPoint)

    val equilibrium =
      if (parts._1.sum > parts._2.sum)
        shiftLeft(a, splitPoint)
      else
        shiftRight(a, splitPoint)

    val tuple = a.splitAt(equilibrium)
    Math.abs(tuple._1.sum - tuple._2.sum)
  }

  private def shiftLeft(a: Array[Int], splitPoint: Int): Int =
    shift(a, splitPoint, validateLeftShift, _ - 1)

  private def shiftRight(a: Array[Int], splitPoint: Int): Int =
    shift(a, splitPoint, validateRightShift, _ + 1)

  private def shift(
      a: Array[Int],
      splitPoint: Int,
      condition: (Array[Int], Int) ⇒ Boolean,
      shiftExpression: Int ⇒ Int
  ): Int = {
    if (!condition(a, splitPoint))
      splitPoint
    else
      shift(a, shiftExpression(splitPoint), condition, shiftExpression)
  }

  private def validateRightShift(a: Array[Int], splitPoint: Int) = {
    val parts = a.splitAt(splitPoint + 1)
    parts._1.sum < parts._2.sum && splitPoint + 1 < a.length
  }

  private def validateLeftShift(a: Array[Int], splitPoint: Int) = {
    val parts = a.splitAt(splitPoint - 1)
    parts._1.sum > parts._2.sum && splitPoint - 1 > 0
  }

}
