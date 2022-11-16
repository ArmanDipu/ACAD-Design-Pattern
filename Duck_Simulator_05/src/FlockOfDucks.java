public class FlockOfDucks implements Quackable{
    private Quackable[] ducks;

    public FlockOfDucks(Quackable[] ducks){
        this.ducks = ducks;
    }
    @Override
    public void quack() {
        Iterator duckIterator = new DuckIterator(ducks);
        while (duckIterator.hasNext()){
            Quackable duck = (Quackable) duckIterator.next();
            duck.quack();
        }
    }
}
