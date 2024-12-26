public class mergeSort {
    public static void main(String[] args) {

    }

    public static void divide (int[] arr) {
        if (arr.length<=1) return;

        int mid = arr.length/2;
        int[] leftArray = new int[mid];
        int[] rightArray = new int[arr.length - mid];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i < mid) leftArray[i] = arr[i];
           else rightArray[j] = arr[i];
           j++;
        }
        divide(leftArray);
        divide(rightArray);
        merge(leftArray, rightArray, arr);


    }

    public static void merge(int[] left, int[] right,int[] arr) {
        int leftSize = arr.length/2;
        int rightSize = arr.length - leftSize;
        int i = 0, l = 0, r = 0;
        while (l < leftSize && r < rightSize ) {
            if (left[l] < right[r]) {
                arr[i] = left[l];
                l++;
                i++;
            } else {
                arr[i] = right[r];
                i++;
                r++;
            }
        }
        while (l < leftSize ) {
            arr[i] = left[l];
            i++;
            l++;
        }
        while (r < rightSize ) {
            arr[i] = right[r];
            i++;
            r++;
        }
    }



}
