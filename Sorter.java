class Sorter {

  public static void qsort(double[] array) {
    throw new UnsupportedOperationException();
  }

  public static void insort(double[] array) {
    int i, j;
    for (i = 1; i < array.length; i++) {
      double temp = array[i];
      for (j = i-1; j >= 0 && temp <= array[j]; j--) {
        array[j+1] = array[j];
      }
      array[j+1] = temp;
    }
  }

}
