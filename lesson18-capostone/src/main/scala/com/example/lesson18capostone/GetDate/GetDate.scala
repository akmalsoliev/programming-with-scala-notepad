package com.example.lesson18capostone.GetDate

//import scala.io.StdIn
import java.time.ZoneId
import java.{util => ju}


object GetDate {
//    val userInput:String = StdIn.readLine("Input the location: ")
    val userInput:String = "UTC"

    private def getZones: ju.Set[String] = ZoneId.getAvailableZoneIds

    def main(args:Array[String]): Unit = {
        getZones.forEach{
            tz =>
                if (tz.contains(userInput)) println(tz)
                else println("Not found ")
        }
    }
}