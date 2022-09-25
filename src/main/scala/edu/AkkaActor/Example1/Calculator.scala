package edu.AkkaActor.Example1

import akka.actor.{Actor, Props}

case class Add(num1: Int, num2: Int)
case class Subtract(num1: Int, num2: Int)
case class Divide(num1: Int, num2: Int)

class Calculator extends Actor {

  def receive: Receive = {
    case Add(num1, num2) => context.actorOf(Props[Addition]) ! Add(num1, num2)
    case Subtract(num1, num2) => context.actorOf(Props[Subtraction]) ! Subtract(num1, num2)
    case Divide(num1, num2) => context.actorOf(Props[Division]) ! Divide(num1, num2)
  }
}

class Addition extends Actor {
  def receive: Receive = {
    case Add(num1, num2) => println(s"Sum = ${num1 + num2}")
  }
}

class Subtraction extends Actor {
  def receive: Receive = {
    case Subtract(num1, num2) => println(s"Difference = ${num1 - num2}")
  }
}

class Division extends Actor {
  def receive: Receive = {
    case Divide(num1, num2) => {
      bigComputation()
      println(s"Division = ${num1 / num2}")
    }
  }

  def bigComputation() = Thread.sleep(1000)
}