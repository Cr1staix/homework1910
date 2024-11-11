/**
 * Создает объект класса Dog. Класс является наследником суперкласса Animal
 */
public final class Dog extends Animal implements Pet{
    public Dog(String name) {
        super(name);
    }

    /**
     * Метод для воспроизведения звука, который издает собака.
     */
    @Override
    public void makeSound() {
        System.out.print("Гав Гав! ");
    }

    /**
     * Метод описывает вкусовые предпочтения собаки.
     */
    @Override
    public void eat() {
        System.out.println("Чаппи не видали?");
    }

    /**
     * Метод описывает способ передвижения собаки.
     */
    @Override
    public void move() {
        System.out.println("Импульс движения у собаки идет от задних конечностей");
    }


    @Override
    public String toString() {
        return "Мой тип - " + getClass() + "! Меня зовут - " + getName();
    }

    @Override
    public void play() {
        System.out.println("Играем с собакой в мячик");
    }

    @Override
    public void beFriendly() {
        System.out.println("Собака всегда дружелюбна к человеку");
    }
}