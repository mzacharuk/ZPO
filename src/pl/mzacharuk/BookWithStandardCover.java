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
        if(this.decoratedPublication.getInfoAboutBook().contains("okładka")){
            return decoratedPublication.getInfoAboutBook()+" \t Ta ksiazka posiada juz okladke";
        }else{
            return decoratedPublication.getInfoAboutBook()+" | "+cover;
        }
    }
}