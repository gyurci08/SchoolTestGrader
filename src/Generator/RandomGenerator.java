package Generator;


import java.util.Random;

public abstract class RandomGenerator {
    private static Random random=new Random();

    public static double generate(double min, double max){
return  random.nextDouble()*(max-min)+min;
    }
}
