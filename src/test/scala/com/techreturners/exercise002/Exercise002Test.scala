package com.techreturners.exercise002

import org.scalatest.flatspec.AnyFlatSpec

class Exercise002Test extends AnyFlatSpec {

  val exercise002 = new Exercise002

  "A person" should "be correctly identified as being from Manchester" in {
    //val person = Person("Peter", "Smith", "Manchester", 23)

    assert(exercise002.isFromManchester(/* person */))
  }

  it should "be correctly identified as residing in somewhere other than Manchester" in {
    //val person = Person("Susan", "Farmer", "Leeds", 23)

    assert(!exercise002.isFromManchester(/* person */))
  }

  "A person" should "be correctly identified as being able to watch an over 18 film" in {
    //val person = Person("Peter", "Smith", "Manchester", 23)

    assert(exercise002.canWatchFilm(/* person, 18 */))
  }

  it should "be correctly rejected from watching an over 16 film" in {
    //val person = Person("Peter", "Smith", "Manchester", 15)

    assert(!exercise002.canWatchFilm(/* person, 16 */))
  }

}
