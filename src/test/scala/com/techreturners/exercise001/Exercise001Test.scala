package com.techreturners.exercise001

import org.scalatest.flatspec.AnyFlatSpec

class Exercise001Test extends AnyFlatSpec {

  "An empty Set" should "have size 0" in {
    assert(Set.empty.size == 0)
  }
}
