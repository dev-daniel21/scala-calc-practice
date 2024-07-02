import UserInteraction._

import scala.sys.exit

object MainCalc extends App {
  println("Welcome to basic calculator")

  acquireUserName()
  acquireInputNumbers()

  exit(0)
}
