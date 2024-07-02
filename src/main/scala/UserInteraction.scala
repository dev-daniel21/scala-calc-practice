import scala.io.StdIn.readLine

object UserInteraction {
  def acquireUserName(): Unit = {
    val name: String = readLine("Please enter your name: ")
    val age: Int = readLine("Please enter your age: ").toInt

    println(s"Hello, $name !")
    println(s"Your age is $age !")
  }

  def acquireInputNumbers(): Unit = {
    val firstNumber: Int = readLine("Please enter first number: ").toInt
    val secondNumber: Int = readLine("Please enter second number: ").toInt
    val typeOfCalculation: String = readLine("Please enter type of calculation: ")

    val result = typeOfCalculation match {
      case "addition" => firstNumber + secondNumber
      case "subtraction" => firstNumber - secondNumber
      case "multiplication" => firstNumber * secondNumber
      case "division" => (firstNumber / secondNumber).toFloat
      case _ => "cannot be calculated"
    }

    println(s"You entered numbers: $firstNumber and $secondNumber")
    println(s"Result: $result")
  }


}
