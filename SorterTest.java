import java.util.Arrays;

public class SorterTest {

  public static void main(String[] args) {
   double[] array = ArrayHelper.generate(100000);
   double[] array_for_qsort = Arrays.copyOf(array, array.length);
   double[] array_for_insort = Arrays.copyOf(array, array.length);

    long[] estimates = new long[2];
    double[] miliseconds = new double[2];
    
    // System.out.println("before sort:");
    // ArrayHelper.print(array);
    
    estimates[0] = Sorter.qsort(array_for_qsort);
    // System.out.println("after qsort():");
    // ArrayHelper.print(array_for_qsort);
    
    estimates[1] = Sorter.insort(array_for_insort);
    // System.out.println("after insort():");
    // ArrayHelper.print(array_for_insort);

    for(int i = 0; i < estimates.length; i++) {
      miliseconds[i] = estimates[i] / Math.pow(10, 6);
    }

    System.out.format("qsort:  %10.3f [ms]%n", miliseconds[0]);
    System.out.format("insort: %10.3f [ms]%n", miliseconds[1]);
  }

}
