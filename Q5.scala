package Demo2

object Q5 {
  def main(args: Array[String]): Unit = {

    easyPhase_running_time(2)
  }


  def easyPhase_running_time(d1: Int): Double = {
    var t1: Double = d * 8
    return t1
  }

  def tempoPhase_running_time(d2: Int): Double = {
    var t2: Double = d2 * 7
    return t2
  }

  def total_running_time(d3: Int): Double = {
    print(easyPhase_running_time(2)+ tempoPhase_running_time(3)+easyPhase_running_time(2))
  }




}

