import org.scalatest.{FunSuite, Matchers}

class CyclicRotationTest extends FunSuite with Matchers {
  test("testSolution") {
    CyclicRotation.solution(Array(3, 8, 9, 7, 6), 3) shouldBe List(9, 7, 6, 3, 8)
  }
}
