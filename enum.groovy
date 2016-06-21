enum Day {
   SUNDAY, MONDAY, TUESDAY, WEDNESDAY,THURSDAY, FRIDAY, SATURDAY
}

def today = Day.SATURDAY

switch (today) {
   //Saturday or Sunday
   case [Day.SATURDAY, Day.SUNDAY]:
      println "Weekends are cool"
      break
   //a day between Monday and Friday
   case Day.MONDAY..Day.FRIDAY:
      println "Boring work day"
      break
   default:
      println "Are you sure this is a valid day?"
}