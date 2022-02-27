import java.math.BigInteger;
public class Q6 {
    public static void main(String[] args){
        BigInteger Num = new BigInteger(String.valueOf(Long.MAX_VALUE));
        BigInteger five = new BigInteger("5");
        BigInteger six = new BigInteger("6");
        BigInteger zero = new BigInteger("0");

        System.out.println("\nFirst ten numbers greater than Long.MAX_VALUE" +  " that are divisible by 5 or 6:");
        for (int i = 0; i < 10; i++) {
            Num = Num.add(new BigInteger("1"));
            if ((Num.remainder(five)).compareTo(zero) == 0 || (Num.remainder(six)).compareTo(zero) == 0) {
                System.out.println(Num);
                i++;
            }
        }
    }
}
