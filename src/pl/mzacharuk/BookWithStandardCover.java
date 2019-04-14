package pl.mzacharuk;

public class BookWithStandardCover extends BookDecorator {

    public BookWithStandardCover(Publication decoratedPublication) {
        super(decoratedPublication);
    }

    @Override
    public String getInfoAboutBook() {
        return null;
    }
}
