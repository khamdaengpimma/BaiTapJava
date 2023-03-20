package Duck;

public class DuckAdaptor implements Turkeylike{
    public Duck duck;
    @Override
    public void gobble() {
    }
    public void DuckAdaptor(Duck Ducklike){
        this.duck=Ducklike;
    }

    @Override
    public void fly() {
            duck.fly();
    }
}
