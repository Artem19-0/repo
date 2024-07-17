import java.util.Objects;

public class Dog {
    private int age;
    private String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}



 class Animal {

    protected int name;
    void sound() {
        System.out.println("animal can make a sound");
    }
}

class Dog2 extends Animal {
    @Override
    void sound() {
        System.out.println("Woof " + name);
    }
}

class Duck extends Animal {
    //@Override
    void sound() {
        System.out.println("кря-кря");
    }
}

class TestPolymorphism {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Animal myDog = new Dog2();
        Animal myCat = new Duck();

//        myAnimal.sound();
//        myDog.sound();
//        myCat.sound();

        // faeture
    }
}


