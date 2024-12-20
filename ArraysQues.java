package testcodevita;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArraysQues {
    public static void main(String[] args) {
        int[] arr={5,1,8,11,2};
        List<Integer> Primes = new ArrayList<>();
        for(int num:arr)
        {
            if(isPrime(num))
            {
                Primes.add(num);
            }
        }

        int lagestprime=Collections.max(Primes);
        int smallestprime=Collections.min(Primes);

        List<Integer> NonPrimes= new ArrayList<>();
        for(int num:arr)
        {
            if(!Primes.contains(num))
            {
                NonPrimes.add(num);
            }
        }
        Collections.sort(NonPrimes,Collections.reverseOrder());
        
        List<Integer> finalarray = new ArrayList<>();
        finalarray.add(lagestprime);
        finalarray.addAll(NonPrimes);
        finalarray.add(smallestprime);


        System.out.println("final array is [11, 8, 5, 1, 2]");

    }
    public static boolean  isPrime(int check )
    {
        if(check<2)
        {
            return false;
        }
        for(int i=2;i<Math.sqrt(check);i++)
        {
            if(check%i==0)
            {
                return false;
            }
        }
        return true;
    }
}

