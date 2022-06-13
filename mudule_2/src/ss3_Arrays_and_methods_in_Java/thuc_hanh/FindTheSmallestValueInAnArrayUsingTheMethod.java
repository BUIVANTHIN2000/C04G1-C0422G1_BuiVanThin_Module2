package ss3_Arrays_and_methods_in_Java.thuc_hanh;

public class FindTheSmallestValueInAnArrayUsingTheMethod {
    public FindTheSmallestValueInAnArrayUsingTheMethod() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 12, 7, 8, 1, 6, 9};
        int index = minValue(arr);
        System.out.println("The smallest element in the array is: " + arr[index]);
    }

    public static int minValue(int[] array) {
        int index = 0;

        for(int i = 1; i < array.length; ++i) {
            if (array[i] < array[index]) {
                index = i;
            }
        }

        return index;
    }
}