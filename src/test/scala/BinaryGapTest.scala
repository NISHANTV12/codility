import BinaryGap.solution
import org.scalatest.{FunSuite, Matchers}

class BinaryGapTest extends FunSuite with Matchers {
  test("binary gap") {
    solution(129) shouldBe 6
  }

  test("binary gap on large number") {
    solution(129129129) shouldBe 2
  }

  test("binary gap on negative number") {
    solution(-129) shouldBe 1
  }

}
