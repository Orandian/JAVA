import java.util.Random;

public class RandomNumber {
    public static  void randomNumber(String[] args){
        Random random = new Random();

        int x = random.nextInt(6);
        double y = random.nextDouble();
        boolean z = random.nextBoolean();

        System.out.println(z);
    }
}
