package main;

public class ReverseInteger {
    public int reverse(int x) {

        //remember direction
        int multiplier = x < 0 ? -1 : 1;

        //absolute value
        int y = x < 0 ? -x : x;

        String z = String.valueOf(y);

        if (z.length() == 1) {
            return x;
        }

        
        int lastDigit = y % 10;

        long reversed = multiplier * (lastDigit * (long) Math.pow(10, (z.length() - 1)) + reverse(y / 10));

        if (reversed < -Math.pow(2, 31) || reversed > Math.pow(2, 31) - 1) {
            return 0;
        } else {
            return (int) reversed;
        }

    }
}


//7. Reverse Integer
//
//Given a signed 32-bit integer x, return x with its digits reversed.
// If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
//
//Example 1:
//
//Input: x = 123
//Output: 321
//Example 2:
//
//Input: x = -123
//Output: -321
//Example 3:
//
//Input: x = 120
//Output: 21