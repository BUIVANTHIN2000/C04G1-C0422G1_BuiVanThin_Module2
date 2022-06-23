package test;

import model.CouterModel;

public class test {
    public static void main(String[] args) {
        CouterModel ct = new CouterModel();
        ct.increment();
        ct.increment();
        ct.increment();
        System.out.println(ct.getValue());
        ct.decrement();
        System.out.println(ct.getValue());
    }
}
