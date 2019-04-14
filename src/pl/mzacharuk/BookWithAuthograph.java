package pl.mzacharuk;

public class BookWithAuthograph extends BookDecorator {
    private String autograph;

    public BookWithAuthograph(Publication decoratedPublication, String autograph) {
        super(decoratedPublication);
        this.autograph = autograph;
    }

    @Override
    public String getInfoAboutBook() {
        return decoratedPublication.getInfoAboutBook()+" | "+autograph;
    }
}
