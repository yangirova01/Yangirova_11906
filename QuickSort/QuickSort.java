package QuickSort;
public class QuickSort {
    private int iter = 0;
    public void quickSort(int[] array, int low, int high) {
        iter++;
        int middle = low + (high - low) / 2;
        int opora = array[middle];
        int i = low, j = high;
        while (i <= j) {
            while (array[i] < opora) {
                i++;
            }
            while (array[j] > opora) {
                j--;
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
                j--;
            }
        }
        if (array.length == 0)
            return;
        if (low >= high)
            return;
        
        // вызов рекурсии для сортировки левой и правой части
        if (low < j)
            quickSort(array, low, j);

        if (high > i)
            quickSort(array, i, high);
    }
    long testMilli(int[] arr, int f, int l) {
        long start = System.currentTimeMillis();
        quickSort( arr, f, l);
        long stop = System.currentTimeMillis();
        return stop-start;
    }

    long testNano(int[] arr, int l, int h) {
        long start = System.nanoTime();
        quickSort(arr, l, h);
        long stop = System.nanoTime();
        return stop-start;
    }

    public int getIter() {
        return iter;
    }
}