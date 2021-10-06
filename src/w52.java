import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class w52 {
    public static void main(String[] args) {
        ArrayList<Integer> f = new ArrayList<>();
        System.out.println(System.currentTimeMillis());
        for(int i=0;i<1000000;i++){
            f.add(new Random().nextInt(1000000));

        }
        System.out.println(System.currentTimeMillis());
        BigInteger b = new BigInteger(String.valueOf(0));
        for (int fd : f){
           b= b.add(new BigInteger(String.valueOf(fd)));
        }
        System.out.println(System.currentTimeMillis());
        System.out.println(b.toString());
    }
}
