package Test;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(binarySearch(arr,10));
    }

    public static int binarySearch(int[] arr, int x) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == x) {
                return mid;
            }else if (arr[mid] > x) {
                right =mid -1;
            }else {
                left = mid +1;
            }
        }
        return -1;
    }
}






