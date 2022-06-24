import java.time.{LocalDateTime, ZoneId, ZonedDateTime}

object Main {

  object WhatTimeIsIt {
    // Getting the current timezone time
    private def getTime: ZonedDateTime = LocalDateTime.now().atZone(ZoneId.systemDefault)

    // Getting ZoneId
    def setZone(location:String): ZoneId = ZoneId.of(location)

    // Checking if valid timezone
    def getTimeNow(location: String): String = {

      val allZones: Array[AnyRef] = ZoneId.getAvailableZoneIds.toArray()

      if (allZones contains(location)) {
        val currentTime = getTime
        val tzID = setZone(location)
        val locationDateTime = currentTime.withZoneSameInstant(tzID)
        val dtFormatted = java.time.format.DateTimeFormatter.RFC_1123_DATE_TIME
        s"Current time in $location: ${locationDateTime.format(dtFormatted)}"
      }
      else s"$location isn't found"
    }
  }

  def main(args: Array[String]): Unit = {
    val userInput: String = scala.io.StdIn.readLine("Please input desired tz: ")
    println(WhatTimeIsIt.getTimeNow(userInput))