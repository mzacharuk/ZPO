package pl.mzacharuk;

public abstract class BookDecorator implements Publication{

    protected Publication decoratedPublication;

    public BookDecorator(Publication decoratedPublication){

        super();
        this.decoratedPublication = decoratedPublication;
        
    }

}
