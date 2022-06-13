package ss5_Access_modifier.bai_tap;

public class Test {
    public Test() {
    }

    public static void main(String[] args) {
        Student std1 = new Student();
        std1.setName("thin");
        std1.setClasses("C04");
        System.out.println(std1.getName());
        System.out.println(std1.getClasses());
    }
}
