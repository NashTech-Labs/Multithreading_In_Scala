package edu.AkkaActor.Example2

import akka.actor.Actor

class MultiThreadSystem extends Actor {

  override def receive: Receive = {
    case message: String => processString(message)
    case number: Int => processInt(number)
    case _ => println(s"[threadSystem] I didn't understand")
  }

  def processString(message: String) = {
    println(s"Message Received : $message")
    "message" + message
  }

  def processInt(num: Int): Int = {
    println(s"Message Received : $num")
    num * num
  }
}
