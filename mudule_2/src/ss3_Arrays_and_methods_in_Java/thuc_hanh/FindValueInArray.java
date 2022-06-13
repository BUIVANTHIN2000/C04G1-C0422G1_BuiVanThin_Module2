package ss3_Arrays_and_methods_in_Java.thuc_hanh;

import java.util.Scanner;

public class FindValueInArray {
    public FindValueInArray() {
    }

    public static void main(String[] args) {
        String[] students = new String[]{"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a name's student :");
        String input_name = scanner.nextLine();
        boolean isExitst = false;

        for(int i = 0; i < students.length; ++i) {
            if (students[i].equals(input_name)) {
                System.out.println("Position of the students in the list " + input_name + " is: " + i);
                isExitst = true;
                break;
            }
        }

        if (!isExitst) {
            System.out.println("not found" + input_name + "in the list");
        }

    }
}
