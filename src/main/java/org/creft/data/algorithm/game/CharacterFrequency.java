package org.creft.data.algorithm.game;

import java.util.ArrayList;
import java.util.List;

public class CharacterFrequency {

    public static List<Character> findMostFrequent(String line){
        char[] lineCharacters = line.toCharArray();

        int[] frequencyArray = new int[52];

        for(char c: lineCharacters){
            if(c >= 'A' && c <= 'Z')
                frequencyArray[c-'A']++;
            else if(c >= 'a' && c <= 'z')
                frequencyArray[26+ c-'a']++;
        }

        //find max frequency for both lower & upper case characters
        int maxFreq = 0;

        for(int freq : frequencyArray){
            maxFreq = Math.max(maxFreq, freq);
        }

        List<Character> results = new ArrayList<>();

        //capital letters
        for(char c = 'A'; c <= 'Z'; c++){
            if(frequencyArray[c - 'A'] == maxFreq)
                results.add(c);
        }

        //lower-case letters
        for(char c = 'a'; c <= 'z'; c++){
            if(frequencyArray[c - 'a' + 26] == maxFreq)
                results.add(c);
        }

        return results;
    }
}
