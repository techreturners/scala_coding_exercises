package com.techreturners.exercise001

import org.scalatest.flatspec.AnyFlatSpec

class Exercise001Test extends AnyFlatSpec {

  val exercise001 = new Exercise001

  "A string with one word" should "have first letter capitalised" in {
    assert(exercise001.capitalizeWord("hello") == "Hello")
  }

  "A string with multiple words" should "only have first letter capitalised" in {
    assert(exercise001.capitalizeWord("the quick fox") == "The quick fox")
  }

  "A string with punctuation" should "only have first letter capitalised" in {
    assert(exercise001.capitalizeWord("oh no, bears!!!") == "Oh no, bears!!!")
  }

  "A persons name" should "be reduced to initials" in {
    assert(exercise001.generateInitials("Frederic", "Bonneville") == "F.B")
    assert(exercise001.generateInitials("Karl", "Marx") == "K.M")
  }

  "VAT rate" should "be added to whole number" in {
    assert(exercise001.addVat(100, 20) == 120)
  }

  it should "be allowed to change and still get added" in {
    assert(exercise001.addVat(40, 17.5) == 47)
  }

  it should "be added to decimal numbers" in {
    assert(exercise001.addVat(33.5, 17.5) == 39.36)
  }

  it should "not be added when rate is zero" in {
    assert(exercise001.addVat(25, 0) == 25)
  }

  "Any given sentence" should "be reversed" in {
    assert(exercise001.reverse("foo") == "oof")
    assert(exercise001.reverse("why would you even want to do this?") == "?siht od ot tnaw neve uoy dluow yhw")
  }

  "Linux user counting" should "return the correct amount of linux users" in {

    val users = Seq(
      User("Heather", "Windows 10", "Windows"),
      User("Paul", "Windows 95", "Windows"),
      User("Sheila", "CentOS 7", "Linux"),
      User("Pedro", "Ubuntu 18.04", "Linux")
    )

    assert(exercise001.countLinuxUsers(users) == 2)
  }

  it should "return the correct amount of linux users when the collection is empty" in {
    val users = Seq()
    assert(exercise001.countLinuxUsers(users) == 0)
  }

  it should "return the correct amount of linux users when the collection is not defined" in {
    assert(exercise001.countLinuxUsers(null) == 0)
  }

}
