package com.example.lesson18capostone.Time
import java.time.ZoneId
import scala.collection.mutable
import scala.jdk.CollectionConverters._


class GetTime(input: String) {
    // Retrieve available timezones
    private def getZones: mutable.Set[String] = ZoneId.getAvailableZoneIds.asScala
    // Matching function to find if there is a match
    private def doesMatch(zoneId: String, input: String): Boolean = zoneId.contains(input)

    def findZone(location: String): ZoneId = ZoneId.of(location)
    // Get the timezone based on the match, not perfect and prone to errors, but will do for now
    def getLocation: Option[String] = getZones.find(zoneId => doesMatch(zoneId, input))
}
