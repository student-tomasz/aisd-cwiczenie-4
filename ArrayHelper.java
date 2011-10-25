import java.lang.reflect.Array;
import java.util.Random;

public class ArrayHelper {

  public static double[] generate(int length) {
    double[] array = new double[length];
    Random generator = new Random();

    for (int i = 0; i < length; i++) {
      array[i] = generator.nextDouble() * Double.MAX_VALUE;
    }

    return array;
  }

  public static void print(double[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.format("%.3f ", array[i]);
    }
    System.out.format("%n");
  }

}
