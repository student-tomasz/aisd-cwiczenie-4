class Sorter {

  public static long insort(double[] array) {
    long start = System.nanoTime();
    int i, j;
    for (i = 1; i < array.length; i++) {
      double temp = array[i];
      for (j = i-1; j >= 0 && temp <= array[j]; j--) {
        array[j+1] = array[j];
      }
      array[j+1] = temp;
    }
    return System.nanoTime() - start;
  }

  public static long qsort(double[] array) {
    long start = System.nanoTime();
    qsort(array, 0, array.length-1);
    return System.nanoTime() - start;
  }

  private static void qsort(double[] array, int left, int right) {
    if (left >= right) {
      return;
    }

    int new_pivot = qsort_partition(array, left, right, left+(right-left)/2);
    qsort(array, left, new_pivot-1);
    qsort(array, new_pivot+1, right);
  }

  private static int qsort_partition(double[] array, int left, int right, int pivot) {
    double pivot_value = array[pivot];
    swap(array, pivot, right);

    int i, last;
    for (i = left, last = left; i < right; i++) {
      if (array[i] < pivot_value) {
        swap(array, i, last);
        last += 1;
      }
    }

    swap(array, last, right);
    return last;
  }

  private static void swap(double[] array, int left, int right) {
    double tmp = array[left];
    array[left] = array[right];
    array[right] = tmp;
  }

}
