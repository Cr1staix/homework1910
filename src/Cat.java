/**
 * Создает объект класса Cat. Класс является наследником суперкласса Animal
 */
public final class Cat extends Animal implements Pet {
    public Cat(String name) {
        super(name);
    }

    /**
     * Метод для воспроизведения звука, который издает кот.
     */
    @Override
    public void makeSound() {
        System.out.print("Мяу Мяу! ");
    }

    /**
     * Метод описывает вкусовые предпочтения кота.
     */
    @Override
    public void eat() {
        System.out.println("Ваша киска купила бы вискас");
    }
    /**
     * Метод описывает способ передвижения кота.
     */
    @Override
    public void move() {
        System.out.println("Кошки передвигаются иноходью - то есть сначала левые ноги, потом правые ноги");
    }



    @Override
    public String toString() {
        return "Мой тип - " + getClass() + "! Меня зовут - " + getName();
    }

    @Override
    public void play() {
        System.out.println("Играем с кошкой мышкой-погремушкой ");
    }

    @Override
    public void beFriendly() {
        System.out.println("Кошка дружелюбна к человеку, но когда у неё есть настроение");
    }
}