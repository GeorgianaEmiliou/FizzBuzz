package org.example;

public class FizzBuzz {

    public static String getValue(int number){
        String answer = "";

        if(number%15 == 0){
            answer = "FizzBuzz";
        }
        else if(number%5 == 0){
            answer = "Fizz";
        }
        else if(number%3 == 0){
            answer = "Buzz";
        }
        else{
            answer = String.valueOf(number);
        }

        return answer;
    }
}
