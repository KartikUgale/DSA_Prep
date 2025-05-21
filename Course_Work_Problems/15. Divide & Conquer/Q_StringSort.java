public class Q_StringSort {
    public static void sort(String[] str) {
        int si = 0;
        int ei = str.length - 1;
        mergeSort(str, si, ei);
    }

    public static void mergeSort(String[] str, int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei - si) / 2;
        mergeSort(str, si, mid);
        mergeSort(str, mid + 1, ei);
        merge(str, si, mid, ei);
    }

    public static void merge(String[] str, int si, int mid, int ei) {
        String[] tempArr = new String[ei - si + 1];
        int i = si;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= ei) {
            if (str[i].compareTo(str[j]) <= 0) {
                tempArr[k++] = str[i++];
            } else {
                tempArr[k++] = str[j++];
            }
        }
        while (i <= mid) {
            tempArr[k++] = str[i++];
        }
        while (j <= ei) {
            tempArr[k++] = str[j++];
        }

        for (i = si, k = 0; k < tempArr.length; i++, k++) {
            str[i] = tempArr[k];
        }
    }

    public static void main(String[] args) {
        String[] str = { "sun", "earth", "mars", "mercury" };
        sort(str);
        for (String s : str) {
            System.out.print(s + " ");
        }
    }
}
