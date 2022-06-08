import java.time.{LocalDateTime, ZoneId, ZonedDateTime}

object Main {
//  val userInput: String = scala.io.StdIn.readLine("Please input desired tz: ")

  class WhatTimeIsIt {
    private def getTime: ZonedDateTime = LocalDateTime.now().atZone(ZoneId.systemDefault)

    private def checkLocation(location: String): Any = {
      val allZones: Array[AnyRef] = ZoneId.getAvailableZoneIds.toArray()
      if (allZones contains(location)) Array(location, true)
      else s"$location isn't found"
    }
    // TODO: write this function
    def getTimeIn(location:String) = checkLocation(location)
  }

  def main(args: Array[String]): Unit = {
    WhatTimeIsIt.showThis()
  }
}