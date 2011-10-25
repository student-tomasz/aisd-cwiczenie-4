import java.util.Arrays;
import java.io.*;

public class SorterTest {

  private final static int MAX_POWER = 4;

  public static void main(String[] args) {
    double[] array = ArrayHelper.generate((int) Math.pow(10, SorterTest.MAX_POWER));
    long[][] estimates = new long[SorterTest.MAX_POWER+1][2];

    PrintWriter out = null;
    try {
      out = new PrintWriter("estimates.txt");
    } catch(FileNotFoundException fnfe) {
      System.out.println(fnfe.getMessage());
    }
    if (out == null) {
      System.out.println("error\n");
    }
    String out_format = "";
    out_format += "sorting %d doubles took:%n";
    out_format += "* qsort:  %12d [ns]%n";
    out_format += "* insort: %12d [ns]%n";

    for (int i = 1; i <= SorterTest.MAX_POWER; i++) {
      int length = (int) Math.pow(10, i);

      double[] array_for_qsort = Arrays.copyOf(array, length);
      double[] array_for_insort = Arrays.copyOf(array, length);

      // System.out.println("before sort:");
      // ArrayHelper.print(array);
      
      estimates[i][0] = Sorter.qsort(array_for_qsort);
      // System.out.println("after qsort():");
      // ArrayHelper.print(array_for_qsort);
      
      estimates[i][1] = Sorter.insort(array_for_insort);
      // System.out.println("after insort():");
      // ArrayHelper.print(array_for_insort);

      System.out.format(out_format, length, estimates[i][0], estimates[i][1]);
      out.format(out_format, length, estimates[i][0], estimates[i][1]);
    }

    out.close();
  }

}
