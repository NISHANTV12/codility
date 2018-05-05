package time_complexity

import org.scalatest.{FunSuite, Matchers}

class FrogJmpTest extends FunSuite with Matchers {
  test("testSolution") {
    FrogJmp.solution(10, 85, 30) shouldBe 3
  }

}
