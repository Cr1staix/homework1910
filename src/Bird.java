/**
 * Создает объект класса Bird. Класс является наследником суперкласса Animal
 */
public class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, boolean canFly) {
        super(name);
        this.canFly = canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    /**
     * Метод для воспроизведения звука, который издает птица
     */
    @Override
    public void makeSound() {
        System.out.print("Чирик Чирик! ");
    }

    /**
     * Метод описывает вкусовые предпочтения птицы
     */
    @Override
    public void eat() {
        System.out.println("Есть шо по пшену?");
    }

    @Override
    public String toString() {
        return "Мой тип - " + getClass() + "! Меня зовут - " + getName();
    }
}