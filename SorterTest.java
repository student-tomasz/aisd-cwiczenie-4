import java.util.Arrays;

public class SorterTest {

  public static void main(String[] args) {
   double[] array = new double[]{10, 6, -1, 6, 7, 8, 5, 9, 3, 1};
   double[] array_for_insort = Arrays.copyOf(array, array.length);
   double[] array_for_qsort = Arrays.copyOf(array, array.length);
    
    System.out.println("before sort:");
    ArrayHelper.print(array);
    
    System.out.println("after insort():");
    Sorter.insort(array_for_insort);
    ArrayHelper.print(array_for_insort);
    
    // System.out.println("after qsort():");
    // Sorter.insort(array_for_qsort);
    // ArrayHelper.print(array_for_qsort);
  }

}
