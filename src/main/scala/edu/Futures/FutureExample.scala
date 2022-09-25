package edu.Futures

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent.Future

object FutureExample extends App {

  println(s"main thread: ${Thread.currentThread().getName}")

  def doubleInFuture(list: List[Int]): Seq[Future[String]] = {
    list.map { value =>
      Future(s"thread: ${Thread.currentThread().getName} ==> has value: $value, doubled value: ${value * 2}")
    }
  }

  val list = List(1, 2, 3, 4, 5)
  Future.sequence(doubleInFuture(list)).map(strList => strList.map(println(_)))

}
