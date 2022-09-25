package edu.AkkaActor.Example2

import akka.actor.{ActorSystem, Props}

object AkkaActorApp extends App {

  // actor system
  val actorSystem = ActorSystem("firstActorSystem")
  println("Actor System name: " + actorSystem.name)

  // instantiate actor
  val threadSystem = actorSystem.actorOf(Props[MultiThreadSystem], "threadSystem")

  // communicate
  threadSystem ! "hello"
  threadSystem ! 15
  threadSystem ! "Scala"
  threadSystem ! "Welcome to the"
  threadSystem ! 2
  threadSystem ! 1
  threadSystem ! "knolx"
  threadSystem ! "session"
  threadSystem ! "scala is awesome"
  threadSystem ! 8

}
