public class EratosthenesPrimeSieve implements PrimeSieve{

    public int obergrenze;

    public EratosthenesPrimeSieve(int obergrenze) {
        this.obergrenze = obergrenze;
    }

    @Override
    public boolean isPrime(int p) {
        if(p%2 != 0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void printPrimes() {

    }
}
