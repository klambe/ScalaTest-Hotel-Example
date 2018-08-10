package org.me.hotel

import org.scalatest.Suites
/*
* This can be used to run the command testOnly org.me.hotel.MySuites
* This will only run tests for listed members currently GuestTest, RoomTest
* */
class MySuites extends Suites(
  new GuestTest,
  new RoomTest)