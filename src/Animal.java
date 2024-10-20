/**
 * Создает объект класса Animal. Класс является суперклассом для всех видов животных
 */
public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Метод для воспроизведения звука, который издает животное
     */
    public void makeSound() {
        System.out.println("Животное издает звук");
    }

    /**
     * Метод описывает вкусовые предпочтения животного
     */
    public void eat() {
        System.out.println("Что-то ест");
    }

    @Override
    public String toString() {
        return "Меня зовут " + name;
    }
}