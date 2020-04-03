package spaceship

import spaceship.main.weights


object main extends App {
  val weights = modules.moduleWeights

  def dayOneOne: Int ={

    weights.map(f => fuelCounterUpper.moduleFuel(f)).sum[Int]
  }

  def dayOneTwo: Int ={
    weightOfWeights(weights)
  }

  private def weightOfWeights(weights: Seq[Int]): Int = {
    val calculatedWeights = weights.map(f => fuelCounterUpper.moduleFuel(f))
    val sumOfWeights = calculatedWeights.sum[Int]
    println(calculatedWeights)
    sumOfWeights match {
      case 0 => 0
      case _ => sumOfWeights + weightOfWeights(calculatedWeights)
    }
  }

  println(s"Day 1 part 1: $dayOneOne")

  println(s"Day 1 part 2: $dayOneTwo")


}
