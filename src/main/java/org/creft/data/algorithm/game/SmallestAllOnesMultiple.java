package org.creft.data.algorithm.game;

public class SmallestAllOnesMultiple {
    public static int findSmallestN(int M) {
        if (M % 10 != 3) {
            throw new IllegalArgumentException("The number must end in 3.");
        }

        int remainder = 1 % M;
        int N = 1;

        System.out.println("Step " + N + ": remainder = " + remainder);  // Debug print

        while (remainder != 0) {
            remainder = (remainder * 10 + 1) % M;
            N++;
            System.out.println("Step " + N + ": remainder = " + remainder);  // Debug print
        }

        return N;
    }
}
