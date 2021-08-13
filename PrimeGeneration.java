import java.util.*;

public class PrimeGeneration {
    public static void main(String[] args) {
    	int n = 51;
    	boolean[] primes;
    	primes = new boolean[n];
    	for (int i = 0;i < n ;i++ ) {
    		primes[i] = true;
    	}
    	for (int i = 2;i*i < n ;i++ ) {
    		if (primes[i] == true) {
    			for (int p = i*i; p < n ; p += i ) {
    				primes[p] = false;
    			}
    		}
    	}
    	for (int i = 2;i < n ;i++ ) {
    		if(primes[i] != false){
    			System.out.println(i);
    		}
    	}

    }
}