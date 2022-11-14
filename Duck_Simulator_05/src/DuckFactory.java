public class DuckFactory implements AbstractFactory{
    @Override
    public Duck createDuck(String duckType){
        if (duckType == "Alabio"){
            AlabioDuck alabioDuck = new AlabioDuck();
            return alabioDuck;
        }
        else if(duckType == "Mallard"){
            MallardDuck mallardDuck = new MallardDuck();
            return mallardDuck;
        }
        else return null;
    }
}
