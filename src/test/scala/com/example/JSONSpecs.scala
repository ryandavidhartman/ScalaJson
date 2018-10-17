package com.example

import org.scalatest.FlatSpec

class JSONSpecs extends FlatSpec {

  import TestData._

  "The JSON converterter" should "do basic conversions" in {
    assert(testJsonString === JSON.toString(testJsonObj))
  }


}

