public class GooseAdapter extends Duck implements Quackable{

    private Goose goose;

    public GooseAdapter(Goose goose){
        this.goose = goose;
    }

    void swim(){
        goose.swim();
    }
    void display(){
        goose.display();
    }
    @Override
    public void quack() {
        goose.honk();
    }
}
