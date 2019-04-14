package pl.mzacharuk;

public class BookWithHardcover extends BookDecorator {

    private String cover = "Twarda okładka";
    private boolean hasCover = false;

    public BookWithHardcover(Publication decoratedPublication) {
        super(decoratedPublication);
        //hasCover = true;
    }

    @Override
    public String getInfoAboutBook() {
        return decoratedPublication.getInfoAboutBook()+" | "+cover;
    }
}
