public class Goose implements Honkable{
    void swim(){
        System.out.println("Goose is Swimming.");
    }
    void display(){
        System.out.println("This is a Goose.");
    }

    @Override
    public void honk() {
        System.out.println("Goose is Honking.");
    }
}
