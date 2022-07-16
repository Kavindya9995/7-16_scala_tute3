package Demo2

object Q1 {
def main(args: Array[String]): Unit ={

  var radius:Int = 5
  print("Area = " + Area_of_a_disk(radius))
}

  def Area_of_a_disk(r:Int): Double ={
    return math.Pi*r*r
  }
}
