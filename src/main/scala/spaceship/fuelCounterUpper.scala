package spaceship

object fuelCounterUpper {

  def moduleFuel(moduleMass: Int) : Int = {
    val calculatedMass = divideBy3(moduleMass)
    if(calculatedMass < 2){
      0
    } else {
      calculatedMass - 2

    }
  }


  private def divideBy3(number : Int) : Int = {
    val initialDivision = number / 3

    initialDivision - (initialDivision % 1)
  }
}
