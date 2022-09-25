package edu.AkkaActor.Example1

import akka.actor.{ActorSystem, Props}

object Driver extends App {

  val actorSystem = ActorSystem("firstActorSystem")
  println("Actor System name: " + actorSystem.name)

  val actor = actorSystem.actorOf(Props[Calculator], "Calculator")

  actor ! Add(5, 6) // on other thread
  println("---------  Running from main thread")
  actor ! Subtract(8, 6)
  println("---------  Running from main thread again")
  actor ! Divide(54, 6) // it does not wait for any computations on other threads
  actor ! Add(3, 4)
  actor ! Add(15, 65)

}
