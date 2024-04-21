package Algorithms.More_Algorithms;

public class Algorithm {
    /* Euclid Algorithm for GCD (finding gcd) */
    public int GCD(int a, int b) {
        if (b == 0) {
            return a;
        } 

        return GCD(b, a % b);
    }

    /* Sieve of Eratosthenes (Ffinding prime number) */
    public boolean Prime(int nums){
        if(nums < 2){
            return false;
        }

        for(int i = 2; i*i <= nums; i++){
            if(i % 2 == 0){
                return false;
            }
        }
        
        return true;
    }
}
