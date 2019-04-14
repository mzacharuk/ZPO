package pl.mzacharuk;

public class BookWithStandardCover extends BookDecorator {

    private String cover = "Standardowa okładka";
    private boolean hasCover = false;

    public BookWithStandardCover(Publication decoratedPublication) {
        super(decoratedPublication);
        //hasCover = true;
    }

    @Override
    public String getInfoAboutBook() {
        return decoratedPublication.getInfoAboutBook()+" | "+cover;
    }
}