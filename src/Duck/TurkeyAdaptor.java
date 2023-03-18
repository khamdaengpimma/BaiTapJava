package Duck;

public class TurkeyAdaptor implements Ducklike{
    public Turkeylike turkeylike;
    public void TurkeyAdaptor(Turkeylike tk){
        this.turkeylike = tk;
    }
    @Override
    public void quack() {
        turkeylike.gobble();
    }
    @Override
    public void fly() {
        turkeylike.fly();
    }
}
