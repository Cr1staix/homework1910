/**
 * Создает объект класса Cat. Класс является наследником суперкласса Animal
 */
public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    /**
     * Метод для воспроизведения звука, который издает кот
     */
    @Override
    public void makeSound() {
        System.out.print("Мяу Мяу! ");
    }

    /**
     * Метод описывает вкусовые предпочтения кота
     */
    @Override
    public void eat() {
        System.out.println("Ваша киска купила бы вискас");
    }

    @Override
    public String toString() {
        return "Мой тип - " + getClass() + "! Меня зовут - " + getName();
    }
}