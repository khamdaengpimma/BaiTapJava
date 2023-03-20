package fraction;

public class Fraction {
    private int numerator,denominator;

    public Fraction(int n, int d)throws TellError {
        if(d==0){
            throw new TellError("sua lai");}
            numerator = n;
            denominator=d;
    }
}
