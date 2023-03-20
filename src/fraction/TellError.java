package fraction;

public class TellError extends ArithmeticException{
    public TellError() {
        super();
    }

    public TellError(String t){
        super(t);
    }
}
