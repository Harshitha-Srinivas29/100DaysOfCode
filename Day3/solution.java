import java.util.*;

public class solution {

    public static void sieveOfErantosthenes(int n) {
        boolean[] primes = new boolean[n+1];

        primes[0] = false;
        primes[1] = false;

        for(int i=2; i<n; i++) {
            primes[n+1] = true;
        }

        for(int i=2; i*i <= Math.sqrt(n); i++) {
            if(primes[i] == true) {
                for(int j=2; i*j <= n; j++) {
                    primes[i*j] = false;
                }
            }

        }

        for(int i=2; i<n; i++) {
            if(primes[i] == true)
                System.out.println(i);
        }


    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        sieveOfErantosthenes(n);
    }
}
