package ss16_IOTextFile.Bai_tap.Bai_1;

import java.util.Scanner;

public class RunTest {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi cho source file ");
        String sourceFile = scanner.nextLine();
        WriteFile1.writeFile1(sourceFile,true);
        ReadAndWrite.writeFile2(ReadAndWrite.readFile1(),true);
    }
}