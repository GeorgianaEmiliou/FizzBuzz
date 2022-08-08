package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    //FizzBuzz - 3 = Buzz, 5 = Fizz

        //Red - write a failing test
        //Green - write enough to pass the test
        //Refactor - without failing previous tests
        //1. Write a test

        @Test
        @DisplayName("Given value is 3 then return buzz")
        void givenValuesIs3ThenReturnBuzz() {
                Assertions.assertEquals("Buzz", FizzBuzz.getValue(3));
        }

        @Test
        @DisplayName("Given value is 5 then return fizz")
        void givenValuesIs5ThenReturnFizz() {
                Assertions.assertEquals("Fizz", FizzBuzz.getValue(5));
        }

        @Test
        @DisplayName("Given value is 15 then return FizzBuzz")
        void givenValueIs15ThenReturnFizzBuzz(){
                Assertions.assertEquals("FizzBuzz", FizzBuzz.getValue(15));
        }

        @Test
        @DisplayName("Given value is 6 then return Buzz")
        void givenValueIs6ThenReturnBuzz(){
                Assertions.assertEquals("Buzz", FizzBuzz.getValue(6));
        }

        @Test
        @DisplayName("Given value is 10 then return fizz")
        void givenValueIs10ThenReturnFizz(){
                Assertions.assertEquals("Fizz", FizzBuzz.getValue(10));
        }

        @Test
        @DisplayName("Given value is 30 then return FizzBuzz")
        void givenValueIs30ThenReturnFizzBuzz(){
                Assertions.assertEquals("FizzBuzz", FizzBuzz.getValue(30));
        }

        @Test
        @DisplayName("Given value is 7 then return 7")
        void givenValueIs7ThenReturn7(){
                Assertions.assertEquals("7", FizzBuzz.getValue(7));
        }

        @Test
        @DisplayName("Given value is -1 then return -1")
        void givenValueIsNegativeThenReturnNegative(){
                Assertions.assertEquals("-1", FizzBuzz.getValue(-1));
        }

        @Test
        @DisplayName("Given value is -3 then return Buzz")
        void NegativeThree(){
                Assertions.assertEquals("Buzz", FizzBuzz.getValue(-3));
        }

        @Test
        @DisplayName("Given value is -5 then return Fizz")
        void NegativeFive(){
                Assertions.assertEquals("Fizz", FizzBuzz.getValue(-5));
        }

        @Test
        @DisplayName("Given value is -15 then return FizzBuzz")
        void NegativeFifteen(){
                Assertions.assertEquals("FizzBuzz", FizzBuzz.getValue(-15));
        }


}

