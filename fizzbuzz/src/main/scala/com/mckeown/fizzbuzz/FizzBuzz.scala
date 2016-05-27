package com.mckeown.fizzbuzz

object FizzBuzz{
  
  def convertToFizzBuzz(input:Int):String = {""}

  def apply(input:Int):String = convertToFizzBuzz(input)

  def apply(input:List[Int]):List[String] = input.map(convertToFizzBuzz)
}