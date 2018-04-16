import BinaryGap.solution
import org.scalatest.{FunSuite, Matchers}

class BinaryGapTest extends FunSuite with Matchers {
  test("binary gap") {
    solution(129) shouldBe 6
  }
}
