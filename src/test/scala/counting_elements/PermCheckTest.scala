package counting_elements

import org.scalatest.{FunSuite, Matchers}

class PermCheckTest extends FunSuite with Matchers {
  test("testSolution for success") {
    PermCheck.solution(Array(4, 1, 3, 2)) shouldBe 1
  }

  test("testSolution suceess for single element") {
    PermCheck.solution(Array(1)) shouldBe 1
  }

  test("testSolution failure for single element") {
    PermCheck.solution(Array(10)) shouldBe 0
  }

  test("testSolution for missing number") {
    PermCheck.solution(Array(4, 1, 3)) shouldBe 0
  }

  test("testSolution for duplicate number") {
    PermCheck.solution(Array(4, 4, 1, 3)) shouldBe 0
  }

  test("testSolution for large number") {
    PermCheck.solution((1 until 100000).toArray) shouldBe 1
  }

}
