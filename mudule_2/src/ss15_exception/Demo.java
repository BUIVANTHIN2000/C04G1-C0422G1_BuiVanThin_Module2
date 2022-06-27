//package ss15_exception;
//
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.sql.SQLDataException;
//import java.util.Scanner;
//
//public class Demo {
//    public static void main(String[] args) {
//        System.out.println("start-----------------");
//        String pathFile ="cusmomer.csv";// không có file
//         method1();
//        try {
//            System.out.println(checkAge(-34));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        System.out.println("end--------------------");
//    }
//    public static void method1(){
//        int[] arr ={10,20,30};
//        int index;
//        int element=0;
//        // nhập vào vị trí pt cần in ra
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Nhập vào vị trí pt cần in ra");
//        try{
//            String str =scanner.nextLine();
//            index =Integer.parseInt(str);
//            element= arr[index];
//            return;
//        }catch (ArrayIndexOutOfBoundsException e){
////            System.out.println(e.getMessage());
//            System.out.println("lôi do truy cập ngoài pt của mảng");
//             element =arr[arr.length-1];
//        }catch (NumberFormatException e){
//            System.out.println("Lỗi nhập số");
//           element=arr[0];
//        }catch (Exception e){
//            System.out.println("lỗi chưa biết");
//            e.printStackTrace();
//        }finally {
//            System.out.println("khối finally luôn chạy");
//        }
//        System.out.println("chương trình chạy tiếp");
//        System.out.println("Phần tử: " + element);
//    }
//    public static void method2()  {
//        try {
//            FileReader fileReader = new FileReader("src\\ss15_exception\\student.csv");
//        }catch (FileNotFoundException e){
//            System.out.println("lôi do đọc file");
//            e.printStackTrace();
//        }
//    }
//    public static void method3(String pathFile) throws FileNotFoundException, SQLDataException {
//        FileReader fileReader = new FileReader(pathFile);
//        throw new SQLDataException();
//
//    }
//    public static boolean checkAge(int age) throws ss15_exception.AgeCheckExeption {
//        if (age<0||age>300){
//            throw new ss15_exception.AgeCheckExeption("Tuổi không đúng");
//        }
//        return true;
//    }
//}
