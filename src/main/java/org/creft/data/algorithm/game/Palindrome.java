package org.creft.data.algorithm.game;

public class Palindrome {

    public static boolean isPalindrome(String s){
        char[] chars = s.toLowerCase().toCharArray();

        StringBuilder stringBuilder = new StringBuilder();
        for(char c : chars){
            if(Character.isAlphabetic(c) || Character.isDigit(c))
                stringBuilder.append(c);
        }

        String sanitizedString = stringBuilder.toString();
        String reversedString = stringBuilder.reverse().toString();

        return sanitizedString.equals(reversedString);
    }
}
