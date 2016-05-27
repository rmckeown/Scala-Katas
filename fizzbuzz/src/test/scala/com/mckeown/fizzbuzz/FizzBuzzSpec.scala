package com.mckeown.fizzbuzz.test

import org.scalatest.{Matchers,FlatSpec}
import com.mckeown.fizzbuzz.FizzBuzz

class FizzBuzzSpec extends FlatSpec with Matchers{
 
  "FizzBuzz" should "return Fizz if the number is divisible by 3" in {
    FizzBuzz(3) shouldBe "Fizz"
    FizzBuzz(6) shouldBe "Fizz"
  }
 
  it should "return Buzz if the number is divisible by 5" in {
    FizzBuzz(5) shouldBe "Buzz"
    FizzBuzz(10) shouldBe "Buzz"
  }
 
  it should "return fizzbuzz if the number is divisible by 15" in {
    FizzBuzz(15) shouldBe "FizzBuzz"
    FizzBuzz(30) shouldBe "FizzBuzz"
  }
 
  it should "return the same number if previous are not fulfilled" in {
    FizzBuzz(1) shouldBe "1"
    FizzBuzz(2) shouldBe "2"
    FizzBuzz(4) shouldBe "4"
  }
 
}