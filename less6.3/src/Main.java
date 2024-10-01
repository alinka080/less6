public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();
        Mouse mouse = new Mouse();
        Cow cow = new Cow();
        Frog frog = new Frog();
        Elephant elephant = new Elephant();
        Duck duck = new Duck();
        Fish fish = new Fish();
        Seal seal = new Seal();
        System.out.println("Dog goes " + dog.say());
        System.out.println("Cat goes " + cat.say());
        System.out.println("Bird goes " + bird.say());
        System.out.println("And mouse goes " + mouse.say());
        ... // вызовите переопределённые методы
    }
}

public class Animal {
    public String say() {
        return "I'm an Animal!";
    }
}

// Сделайте так, чтобы классы наследовали от Animal и переопределите в них метод say().


class Dog extends Animal{

}

class Bird extends Animal{

}
class Mouse extends Animal{

}
class Cow extends Animal{

}
class Frog extends Animal{

}
class Elephant extends Animal{

}
class Duck extends Animal{

}
class Fish extends Animal{

}
class Seal extends Animal{

}


