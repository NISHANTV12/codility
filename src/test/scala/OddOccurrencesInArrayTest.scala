import org.scalatest.{FunSuite, Matchers}

class OddOccurrencesInArrayTest extends FunSuite with Matchers {
  test("testSolution") {
    OddOccurrencesInArray.solution(Array(1, 1, 1, 1, 4)) shouldBe 4
  }

}
