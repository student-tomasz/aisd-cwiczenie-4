import java.util.Arrays;

public class SorterTest {

  private final static int MAX_POWER = 4;

  public static void main(String[] args) {
    double[] array = ArrayHelper.generate((int) Math.pow(10, SorterTest.MAX_POWER));

    for (int i = 1; i <= SorterTest.MAX_POWER; i++) {
      int length = (int) Math.pow(10, i);

      double[] array_for_qsort = Arrays.copyOf(array, length);
      double[] array_for_insort = Arrays.copyOf(array, length);

      long[] estimates = new long[2];
      
      // System.out.println("before sort:");
      // ArrayHelper.print(array);
      
      estimates[0] = Sorter.qsort(array_for_qsort);
      // System.out.println("after qsort():");
      // ArrayHelper.print(array_for_qsort);
      
      estimates[1] = Sorter.insort(array_for_insort);
      // System.out.println("after insort():");
      // ArrayHelper.print(array_for_insort);

      System.out.format("sorting %d doubles took:%n", length);
      System.out.format("* qsort:  %16d [ns]%n", estimates[0]);
      System.out.format("* insort: %16d [ns]%n", estimates[1]);
    }
  }

}
