/**
 * Создает объект класса Dog. Класс является наследником суперкласса Animal
 */
public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    /**
     * Метод для воспроизведения звука, который издает собака
     */
    @Override
    public void makeSound() {
        System.out.print("Гав Гав! ");
    }

    /**
     * Метод описывает вкусовые предпочтения собаки
     */
    @Override
    public void eat() {
        System.out.println("Чаппи не видали?");
    }

    @Override
    public String toString() {
        return "Мой тип - " + getClass() + "! Меня зовут - " + getName();
    }
}