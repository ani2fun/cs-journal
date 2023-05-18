import org.scalatest.funsuite.AnyFunSuite
import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class SimpleTestSuite extends AnyFunSuite {
  test("Greetings from Scala") {
    assert("Hello, Scala!" == "Hello, Scala!")
  }

  test("Greetings from Scala2") {
    assert("Hello, Kotlin!" != "Hello, Scala!")
  }
}
