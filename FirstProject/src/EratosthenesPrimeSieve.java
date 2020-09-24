import java.util.LinkedList;

public class EratosthenesPrimeSieve implements PrimeSieve {

    public int obergrenze;

    public EratosthenesPrimeSieve(int obergrenze) {
        this.obergrenze = obergrenze;
    }

    @Override
    public boolean isPrime(int p) {

        if (p <= 1) {
            return false;
        }

        for (int i = 2; i < p; i++)
            if (p % i == 0)
                return false;

        return true;
    }

    @Override
    public void printPrimes() {
        for (int i = 2; i <= obergrenze; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    public void primeAlgorithm() {
        LinkedList<Integer> Nlist = new LinkedList<>();
        for (int i = 2; i <= obergrenze; i++) {
            if (!isPrime(i)) {
                Nlist.add(i);
            }
        }

        LinkedList<Integer> Plist = new LinkedList<>();
        for (int i = 2; i <= obergrenze; i++) {
            if (isPrime(i)) {
                Plist.add(i);
            }
        }


        for (int e :Nlist) {
            for (int f :Plist) {
                for (int g:Plist) {
                    System.out.println(e + "Summe: " + e +" = " + f + " + " + g);
                    break;
                }
            }
        }
    }
}
