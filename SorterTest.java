import java.util.Arrays;

public class SorterTest {

  public static void main(String[] args) {
   double[] array = ArrayHelper.generate(10);
   double[] array_for_insort = Arrays.copyOf(array, array.length);
   double[] array_for_qsort = Arrays.copyOf(array, array.length);
    
    System.out.println("before sort:");
    ArrayHelper.print(array);

    long qsort_estimate, insort_estimate;
    
    System.out.println("after insort():");
    insort_estimate = Sorter.insort(array_for_insort);
    ArrayHelper.print(array_for_insort);
    
    System.out.println("after qsort():");
    Sorter.qsort(array_for_qsort);
    ArrayHelper.print(array_for_qsort);
  }

}
