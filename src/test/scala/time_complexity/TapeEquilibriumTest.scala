package time_complexity

import org.scalatest.{FunSuite, Matchers}

class TapeEquilibriumTest extends FunSuite with Matchers {
  test("test Tape Equilibrium") {
    TapeEquilibrium.solution(Array(3, 1, 2, 4, 3, 6, 7)) shouldBe 0
  }

  test("test Tape Equilibrium with negative numbers") {
    TapeEquilibrium.solution(Array(3, 1, 2, 4, -3)) shouldBe 1
  }

  test("test Tape Equilibrium with very high values at edge") {
    TapeEquilibrium.solution(Array(3, 1, 2, 4, 3, 6, 1000)) shouldBe 981
    TapeEquilibrium.solution(Array(3000, 1, 2, 4, 3, 6, 1)) shouldBe 2985
  }

  test("test Tape Equilibrium with uniform increasing and decreasing numbers") {
    TapeEquilibrium.solution(Array(1, 2, 3, 4, 5, 4, 3, 2, 1)) shouldBe 5
    TapeEquilibrium.solution(Array(1, 2, 3, 4, 5)) shouldBe 3
    TapeEquilibrium.solution(Array(5, 4, 3, 2, 1)) shouldBe 3
  }

}
