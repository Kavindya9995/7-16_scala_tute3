package Demo2

object Q3 {
def main(args: Array[String]): Unit ={

  var radius:Int = 5
  print("Volume = " + Volume_of_a_sphere(radius))

}

  def Volume_of_a_sphere(r:Int): Double ={
    return (4/3)*math.Pi*r*r*r
  }
}
