public interface AbstractDuckFactory {
    public Quackable createDuck(String duckType);
    public Quackable createCountingDuck(String duckType);
}
