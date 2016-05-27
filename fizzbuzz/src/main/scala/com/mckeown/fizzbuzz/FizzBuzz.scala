package com.mckeown.fizzbuzz

object FizzBuzz{
  
  def convertToFizzBuzz(input:Int):String = {""}

  // There are 2 apply methods which will us to either calculate FizzBuzz
  // for a single integer or for a list of integers
  // FizzBuzz(3) or FizzBuzz(List(1,3,4,5,30))
  def apply(input:Int):String = convertToFizzBuzz(input)
  def apply(input:List[Int]):List[String] = input.map(convertToFizzBuzz)
}