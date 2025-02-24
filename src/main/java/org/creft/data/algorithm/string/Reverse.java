package org.creft.data.algorithm.string;

public class Reverse {

    public static String reverseSentence(String sentence){
        if(sentence == null || sentence.length() < 2) return sentence;

        String[] words = sentence.split(" ");

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = words.length -1; i > -1; i--){
            stringBuilder.append(words[i]);

            if(i > 0) stringBuilder.append(" ");
        }

        return stringBuilder.toString();
    }

}
