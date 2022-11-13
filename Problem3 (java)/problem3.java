import java.math.*;

public class problem3 {
    public static void main(String[] args){
        BigInteger n = new BigInteger("600851475143");
        BigInteger two = new BigInteger("2");
        BigInteger i = two;
        while(n.compareTo(i.multiply(i)) >= 0){
            if(n.mod(i) == BigInteger.ZERO){
                n = n.divide(i);
            }else{
                i = i.add(BigInteger.ONE);
            }
        }
        System.out.println(n);
    }
}
