/**
 * Абстрактный класс Animal. Класс является суперклассом для всех видов животных
 */
public abstract class  Animal {
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
     * Абстрактный метод для реализации воспроизведения звуков животных.
     */
    public abstract void makeSound();


    /**
     * Абстрактный метод для описания вкусовых предпочтений животных.
     */
    public abstract void eat();

    /**
     * Абстрактный метод для реализации передвижения животных.
     */
    public abstract void move();


    @Override
    public String toString() {
        return "Меня зовут " + name;
    }
}