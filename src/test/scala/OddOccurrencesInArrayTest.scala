import org.scalatest.{FunSuite, Matchers}

class OddOccurrencesInArrayTest extends FunSuite with Matchers {
  test("test Odd occurrences") {
    OddOccurrencesInArray.solution(Array(1, 1, 1, 1, 4)) shouldBe 4
  }

  test("test Odd occurrences with more duplicate numbers") {
    OddOccurrencesInArray.solution(Array(1, 2, 13, 19, 4, 4, 1, 13, 2)) shouldBe 19
  }

  test("test Odd occurrences with single number") {
    OddOccurrencesInArray.solution(Array(1)) shouldBe 1
  }

}
