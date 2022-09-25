# About this Tech hub

In this Techhub we will discuss about *Ways to achieve Multithreading in Scala* using:
- `Future`
- `AkkaActors`
# What is Multithreading ?

Multithreading is a model of program execution that allows for multiple threads to be created within a process, executing independently but concurrently sharing process resources. Depending on the hardware, threads can run fully parallel if they are distributed to their own CPU core.

## Thread
A thread is an independent unit of execution created within the context of a process. When multiple threads are executing in a process at the same time, we get the term “multithreading.”

## Futures

“A Future represents a value which may or may not currently be available, but will be available at some point, or an exception if that value could not be made available.”
Future is a curried function which has a body and an Execution Context.


## Akka Actors

- Akka Actor provides higher level of abstraction for writing concurrent and distributed system
- They interact only through asynchronous messages and never through direct method calls.
- Actors can only change their state by receiving a message.
- Messages are simple, immutable data structure that can be send to the mailbox of another actor through network

![App Screenshot](https://i.stack.imgur.com/YPfY3.jpg)
