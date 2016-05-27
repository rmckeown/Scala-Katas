package com.mckeown.bowling

// you may change anything in this class and 
// add additional classes, objects, traits as needed
// this is to just implement some basic tests

class Bowling {
  def score(frames:List[Any]):Int = {0}
}

// This is a companion object which will help us not have to keep
// creating new Bowling() everytime we want to use it
object BowlingGame {

  def apply() = new Bowling()

  // this just allows for writing easier test functions
  def score(frames:List[Any]):Int = new Bowling().score(frames)
}