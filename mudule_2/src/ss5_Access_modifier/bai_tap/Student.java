package ss5_Access_modifier.bai_tap;

public class Student {
    private String name = "john";
    private String classes = "c02";

    public Student() {
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return this.classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
