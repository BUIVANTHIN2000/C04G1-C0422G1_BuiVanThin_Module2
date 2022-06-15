package ss7_AbstractClass.thuc_hanh.bai_1;
import ss7_AbstractClass.thuc_hanh.bai_1.Animal;
import ss7_AbstractClass.thuc_hanh.bai_1.Chicken;
import ss7_AbstractClass.thuc_hanh.bai_1.Tiger;
import ss7_AbstractClass.thuc_hanh.bai_1.Edible;
import ss7_AbstractClass.thuc_hanh.bai_1.Fruit;
import ss7_AbstractClass.thuc_hanh.bai_1.Orange;
import ss7_AbstractClass.thuc_hanh.bai_1.Apple;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            Fruit[] fruits = new Fruit[2];
            fruits[0] = new Orange();
            fruits[1] = new Apple();
            for (Fruit fruit : fruits) {
                System.out.println(fruit.howToEat());
            }
        }
    }
}