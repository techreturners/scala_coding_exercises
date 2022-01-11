package com.techreturners.exercise004

import org.scalatest.flatspec.AnyFlatSpec

import java.time.{LocalDate, LocalDateTime, Month}

class Exercise004Test extends AnyFlatSpec{

  "A correct date time" should "be returned when constructed with a date" in {

    // Try un-commenting the code in this test
    // it will fail to compile because the Exercise004 constructor takes a LocalDateTime
    // Have a look in Exercise004 and see if you can un-comment and get this test passing
    // val exercise004 = new Exercise004(LocalDate.of(2021, Month.JULY, 19))
    // assert(exercise004.getDateTimeWithGigaSecond == LocalDateTime.of(2053, Month.MARCH, 27, 1, 46, 40))
  }

  it should "be returned when constructed with a date and time" in {
    val exercise004 = new Exercise004(LocalDateTime.of(2021, Month.MARCH, 4, 23, 22, 0, 0))
    assert(exercise004.getDateTimeWithGigaSecond == LocalDateTime.of(2052, Month.NOVEMBER, 11, 1, 8, 40))
  }

  it should "be returned when constructed with a date and time with day roll over" in {
    val exercise004 = new Exercise004(LocalDateTime.of(2021, Month.JANUARY, 24, 23, 59, 59, 0))
    assert(exercise004.getDateTimeWithGigaSecond == LocalDateTime.of(2052, Month.OCTOBER, 3, 1, 46, 39))
  }
}
