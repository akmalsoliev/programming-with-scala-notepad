package com.example.lesson18capostone.GetDate

//import scala.io.StdIn
import java.time.ZoneId
import scala.collection.mutable
import scala.jdk.CollectionConverters._


object GetDate {
//    val userInput:String = StdIn.readLine("Input the location: ")
    val userInput: String = "Beijing"

    class GetDT(input: String) {
        // Retrieve available timezones
        private def getZones: mutable.Set[String] = ZoneId.getAvailableZoneIds.asScala
        // Matching function to find if there is a match
        private def doesMatch(zoneId: String, input: String): Boolean = zoneId.contains(input)

        private def findZone(location: String): ZoneId = ZoneId.of(location)
        // Get the timezone based on the match, not perfect and prone to errors, but will do for now
        private def getLocation: Option[String] = getZones.find(zoneId => doesMatch(zoneId, input))
        def getHead: Any = try {
            val zoneLocation: ZoneId = findZone(getLocation.head)
            java.time.LocalDateTime.now(zoneLocation)
        } catch {
            case _: NoSuchElementException => s"$input is an invalid timezone"
        }

        // Current datetime
//        val currentDateTime: java.time.LocalDateTime = java.time.LocalDateTime.now(findZone)

    }



    def main(args:Array[String]): Unit = {
        println(new GetDT(userInput).getHead)
    }
}