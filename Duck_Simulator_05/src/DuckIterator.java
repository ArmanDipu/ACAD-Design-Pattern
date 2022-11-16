public class DuckIterator implements Iterator{

    Quackable[] ducks;
    private int position = 0;

    public DuckIterator(Quackable[] ducks){
        this.ducks = ducks;
    }

    @Override
    public boolean hasNext() {
        if(position< ducks.length){
            return true;
        }
        else return false;
    }

    @Override
    public Object next() {
        Quackable duck = ducks[position];
        position++;
        return duck;
    }
}
