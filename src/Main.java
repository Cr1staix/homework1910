//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Dog("Шарик"),
                new Cat("Мурзик"),
                new Bird("Кеша", true)
        };

        for (Animal animal : animals) {
            animal.makeSound();
            animal.eat();
        }

        Dog dog1 = new Dog("Аркадий");
        dog1.makeSound();
        System.out.println(dog1);
        Dog dog2 = new Dog("Пушок");
        dog2.makeSound();
        System.out.println(dog2);
        Cat cat1 = new Cat("Барсик");
        cat1.makeSound();
        System.out.println(cat1);
        Cat cat2 = new Cat("Васька");
        cat2.makeSound();
        System.out.println(cat2);
        Bird bird1 = new Bird("Гоша", true);
        bird1.makeSound();
        System.out.println(bird1);
        Bird bird2 = new Bird("Ряба", false);
        bird2.makeSound();
        System.out.println(bird2);
    }
}