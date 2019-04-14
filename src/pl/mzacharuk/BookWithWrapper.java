package pl.mzacharuk;

public class BookWithWrapper extends BookDecorator {
    private String wrapper = "Z obwolutą";

    public BookWithWrapper(Publication decoratedPublication) {
        super(decoratedPublication);
    }

    @Override
    public String getInfoAboutBook() {
        return decoratedPublication.getInfoAboutBook()+" | "+wrapper;
    }
}
