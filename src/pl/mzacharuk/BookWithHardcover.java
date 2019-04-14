package pl.mzacharuk;

public class BookWithHardcover extends BookDecorator {
    public BookWithHardcover(Publication decoratedPublication) {
        super(decoratedPublication);
    }

    @Override
    public String getInfoAboutBook() {
        return null;
    }
}
