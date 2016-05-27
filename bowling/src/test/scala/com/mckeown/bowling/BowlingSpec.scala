package com.mckeown.bowling.test

import org.scalatest.{Matchers,FlatSpec}

import com.mckeown.bowling.BowlingGame

class BowlingSpec extends FlatSpec with Matchers {

  "Bowling" should "score a completed game of all strikes" in {
    val completed = List.fill(10)(10)
    BowlingGame.score(completed) shouldEqual 300
  }

  it should "score a completed game of all single pins in each throw" in {
    val completed = List.fill(10)((1,1))
    BowlingGame.score(completed) shouldEqual 20
  }

  it should "score a completed game of all spares" in {
    // this can be changed as needed 
    val completed = List.fill(10)((5,5)) ++ List(5)
    BowlingGame.score(completed) shouldEqual 150
  }

  it should "score a completed game of all goose eggs" in {
    val completed = List.fill(10)(0,0)
    BowlingGame.score(completed) shouldEqual 0
  }

  it should "score a partial game" in {
    val partial = List.fill(2)(10) ++ List((5,5)) ++ List((7,1))
    BowlingGame.score(partial) shouldEqual 70
  }

  // add more tests as needed
}