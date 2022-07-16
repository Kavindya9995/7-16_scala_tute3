package Demo2

object Q2 {
  def main(args: Array[String]) {
    print("Input a celsius temperature: ")
    var Celsius = scala.io.StdIn.readInt()

    print("Temperature in fahrenheit = ")
    print(celsiusToFahrenheit(Celsius))

  }

  def celsiusToFahrenheit(C:Double) :Double={
    var Fahrenheit = (1.8000 * C) + 32
  }
}
