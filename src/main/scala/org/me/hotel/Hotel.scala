package org.me.hotel

case class Hotel(
                  rooms: List[Room] = (1 to 10).map(n => Room(number=n)).toList){

  def checkin(personName: String): Hotel = ???

}