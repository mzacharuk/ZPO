package pl.mzacharuk;

public class BookWithAuthograph extends BookDecorator {
    public BookWithAuthograph(Publication decoratedPublication) {
        super(decoratedPublication);
    }

    @Override
    public String getInfoAboutBook() {
        return null;
    }
}
