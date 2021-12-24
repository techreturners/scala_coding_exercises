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

}
