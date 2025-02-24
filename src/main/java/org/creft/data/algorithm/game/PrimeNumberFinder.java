package org.creft.data.algorithm.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrimeNumberFinder {

    //well-known primes we statically pre-cache
    private static List<Integer> primeCache = new ArrayList<>(Arrays.asList(2, 3, 5, 7));

    private static boolean isPrime(int num){
        if(num < 2) return false;

        int sqrtNum = (int)Math.sqrt(num);
        for(int prime : primeCache) {
            if (prime > sqrtNum) break;
            if (num % prime == 0) return false;
        }
        return true;
    }
    //Finds the nearest prime number > x
    public static int findNextHighestPrime(int x){
        int candidate = x+1;

        while(true){
            if(isPrime(candidate)){
                primeCache.add(candidate);
                return candidate;
            }
            candidate++;
        }
    }
}
