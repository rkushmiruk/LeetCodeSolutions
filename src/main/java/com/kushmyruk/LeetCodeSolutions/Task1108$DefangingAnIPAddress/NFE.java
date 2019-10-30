package com.kushmyruk.LeetCodeSolutions.Task1108$DefangingAnIPAddress;

import java.math.BigDecimal;
import java.util.Arrays;

public class NFE {

    public static void main(String[] args) {
        sexyprime(34253, 47635);
    }

    public static void sexyprime(int l, int r) {
        // Sieve Of Eratosthenes for generating
        // prime number.
        int count = 0;
        boolean[] prime = new boolean[r + 1];

        // memset(prime, true, sizeof(prime));
        Arrays.fill(prime, true);


        for (int p = 2; p * p <= r; p++) {
            // If prime[p] is not changed,
            // then it is a prime
            if (prime[p] == true) {
                // Update all multiples of p
                for (int i = p * 2; i <= r; i += p)
                    prime[i] = false;
            }
        }

        // From L to R - 6, checking if i,
        // i + 6 are prime or not.

        for (int i = l; i <= r - 6; i++) {
            if (prime[i] && prime[i + 6]) {
                count++;
                System.out.println("(" + i + ", "
                        + (i + 6) + ") ");
            }
        }
        System.out.println(count);
        System.out.println(BigDecimal.valueOf(55).pow(550));

    }
}
