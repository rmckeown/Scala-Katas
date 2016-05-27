package com.mckeown.primes.test

import org.scalatest.{Matchers,FlatSpec}
import com.mckeown.primes.Primes

class PrimesSpec extends FlatSpec with Matchers{
 
  "Primes" should "find the factorization for 6" in {
    Primes(6) shouldBe List(2,3)
  }
 
  it should "find no factorization for 2" in {
    Primes(2) shouldBe List(2)
  }
 
  it should "find no factorization for 0" in {
    Primes(0) shouldBe List(2)
  }

  it should "find the factorization for 210" in {
    Primes(210) shouldBe List(2,3,5,7)
  }

  it should "find the factorization for 187" in {
    Primes(187) shouldBe List(11,17)
  }
}