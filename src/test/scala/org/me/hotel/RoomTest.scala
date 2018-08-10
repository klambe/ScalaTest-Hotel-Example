package org.me.hotel

class RoomTest extends UnitTest("Room") {

  ignore  should "provide info about its occupation" in {
    Room(1).isAvailable() shouldEqual true
    Room(1,None).isAvailable() shouldEqual true
    Room(1,Some(Guest("Bruce"))).isAvailable() shouldEqual false
  }

  it should "allow registering a new guest if room is available" in {
    val occupiedRoom = Room(1).checkin(Guest("James"))
    occupiedRoom.isAvailable shouldEqual false
    occupiedRoom.guest shouldEqual(Option(Guest("James")))
  }

  it should "deny registering a new guest if room is already occupied" in {
    an [IllegalArgumentException] should be thrownBy {
      Room(1,Some(Guest("Barbara"))).checkin(Guest("Bruce"))
    }
  }

  it should "deny checking out if room is already available" in {
    an [IllegalArgumentException] should be thrownBy {
      Room(1).checkout()
    }
  }

  it should "allow checking out if room is occupied by someone" in {
    val room = Room(1,Some(Guest("Carmine")))
    val availableRoom = room.checkout()
    availableRoom.isAvailable shouldEqual true
  }

}