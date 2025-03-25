package org.creft.data.algorithm.string;

// Check to see if a string matches a 'truncated' pattern, e.g.:
//  i18n -> internationalization (i + 18 letters + n -> i18n == match)
public class NumericTruncation {

    public static boolean checkPatternMatch(String pattern, String concreteValue){

        if(pattern == null ||concreteValue == null
                || concreteValue.length() < pattern.length()
                || pattern.isEmpty()){
            return false;
        }

        int patternPointer = 0, concreteValuePointer = 0;
        char[] patternChars = pattern.toCharArray();
        char[] concreteChars = concreteValue.toCharArray();

        while(patternPointer < pattern.length() && concreteValuePointer < concreteValue.length()){

            if(Character.isAlphabetic(patternChars[patternPointer])){
                //we have a letter that needs to be matched
                if(patternChars[patternPointer] != concreteChars[concreteValuePointer])
                    return false;

                patternPointer++;
                concreteValuePointer++;
            }
            else{
                //digit case, continue scanning until we have the 'full' digit
                StringBuilder concretePointerAdjustmentAmount = new StringBuilder();
                while(Character.isDigit(patternChars[patternPointer])){
                    concretePointerAdjustmentAmount.append(patternChars[patternPointer]);
                    patternPointer++;
                }

                //now increment the concrete pointer by adjustment amount
                concreteValuePointer += Integer.parseInt(concretePointerAdjustmentAmount.toString());
            }

        }
        return true;
    }
}
