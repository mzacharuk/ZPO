package pl.mzacharuk;

public class BookWithWrapper extends BookDecorator {
    public BookWithWrapper(Publication decoratedPublication) {
        super(decoratedPublication);
    }

    @Override
    public String getInfoAboutBook() {
        return null;
    }
}
