package time_complexity

import org.scalatest.{FunSuite, Matchers}

class PermMissingElemTest extends FunSuite with Matchers {
  test("testSolution") {
    PermMissingElem.solution(Array(1, 2, 3, 5, 6, 7, 8)) shouldBe 4
    PermMissingElem.solution(Array(5, 1, 3, 2, 6, 9, 8, 7)) shouldBe 4
  }
}
