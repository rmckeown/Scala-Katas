package com.mckeown.bowling

// you may change anything in this class and 
// add additional classes, objects, traits as needed
// this is to just implement some basic tests

class Bowling {
  def score(frames:List[Any]):Int = {0}
}

object BowlingGame {

  def apply() = new Bowling()

  def score(frames:List[Any]):Int = new Bowling().score(frames)
}