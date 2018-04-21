import org.scalatest.{FunSuite, Matchers}

class TapeEquilibriumTest extends FunSuite with Matchers {
  test("testSolution") {
    TapeEquilibrium.solution(Array(3, 1, 2, 4, 3, 6, 1000)) shouldBe 981
    TapeEquilibrium.solution(Array(1, 2, 3, 4, 5, 4, 3, 2, 1)) shouldBe 5
    TapeEquilibrium.solution(Array(3, 1, 2, 4, 3)) shouldBe 1
  }

}
