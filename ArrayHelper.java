import java.lang.reflect.Array;
import java.util.Random;

public class ArrayHelper {

  public static double[] generate(int length) {
    double[] array = new double[length];
    Random generator = new Random();

    for (int i = 0; i < length; i++) {
      array[i] = (generator.nextDouble() + 0.5) * 123;
    }

    return array;
  }

  public static void print(double[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.print("\n");
  }

}
