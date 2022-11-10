//Реализовать алгоритм сортировки слиянием

package Tasks;
import java.util.Arrays;

public class Task1 {

    private static void SortUnsorted(int[] a, int lo, int hi) {
        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        SortUnsorted(a, lo, mid);
        SortUnsorted(a, mid + 1, hi);
    
        int[] buf = Arrays.copyOf(a, a.length);

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > hi) {
                a[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }
    }

    public static void main(String[] args) {

        int a[] = new int[] {6,5,4,2,3,1};

        SortUnsorted(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }
    
}
