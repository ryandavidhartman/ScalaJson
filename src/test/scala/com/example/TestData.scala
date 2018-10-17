package com.example

import com.example._

object TestData {

  val testJsonString =
  """
    |{
    |  "firstName": "John",
    |  "lastName": "Smith",
    |  "isAlive": true,
    |  "age": 27,
    |  "address": {
    |    "streetAddress": "21 2nd Street",
    |    "city": "New York",
    |    "state": "NY",
    |    "postalCode": "10021-3100"
    |  },
    |  "phoneNumbers": [
    |    {
    |      "type": "home",
    |      "number": "212 555-1234"
    |    },
    |    {
    |      "type": "office",
    |      "number": "646 555-4567"
    |    },
    |    {
    |      "type": "mobile",
    |      "number": "123 456-7890"
    |    }
    |  ],
    |  "children": [],
    |  "spouse": null
    |}
  """.stripMargin

  val testJsonObj = JObj(
    Map( "firstName" -> JString("John"),
         "lastName" -> JString("Smith"),
         "isAlive" -> JBool(true),
         "age" -> JNum(27),
         "address" -> JObj(Map( "streetAddress" -> JString("21 2nd Street"),
           "city" -> JString("New York"),
           "state" -> JString("NY"),
           "postalCode" -> JString("10021-3100")
           )
         ),
         "phoneNumbers" -> JSeq(
          List( JObj(Map( "type" -> JString("home"), "number" -> JString("212 555-1234") )),
                JObj(Map( "type" -> JString("office"), "number" -> JString("646 555-4567") )),
                JObj(Map( "type" -> JString("mobile"), "number" -> JString("123 456-7890" )))
          )
        ),
        "children" -> JSeq(Seq.empty),
        "spouse" -> JNull
      )
  )

}
