package arrays

import org.scalatest.{FunSuite, Matchers}

class CyclicRotationTest extends FunSuite with Matchers {
  test("test Cyclic Rotation") {
    CyclicRotation.solution(Array(3, 8, 9, 7, 6), 3) shouldBe List(9, 7, 6, 3, 8)
  }

  test("test Cyclic Rotation with negative numbers") {
    CyclicRotation.solution(Array(-3, 8, 9, -7, 6), 3) shouldBe List(9, -7, 6, -3, 8)
  }

  test("test Cyclic Rotation with duplicate numbers") {
    CyclicRotation.solution(Array(-3, 8, 9, -7, 6, 8, 1), 4) shouldBe List(-7, 6, 8, 1, -3, 8, 9)
  }

}
