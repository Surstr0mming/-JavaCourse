import java.util.Objects;
class Dog{
    String name;
    String say;
    Dog(String name, String say){
        this.name = name;
        this.say = say;
    }
    void how(){
        System.out.println(say);
    }
    public boolean equals(Dog d){
        return name.equals(d.name);
    }
}
public class CW1_6 {
    public static void main(String[] args) {
        Dog Scruffy = new Dog("Scruffy", "Wurf");
        Dog Ralf = new Dog("Ralf", "Ruff");
        Scruffy.how();
        Ralf.how();
        Dog dog;
        dog = Scruffy;
        dog.how();
        dog = Ralf;
        dog.how();
        dog = new Dog("Ralf", "Ruff");
        if (dog == Ralf){
            System.out.println("Same dog");
        }
        else{
            System.out.println("Different dog");
        }

        if (Ralf.equals(dog)){
            System.out.println("Same dog");
        }
        else{
            System.out.println("Different dog");
        }
    }
}
