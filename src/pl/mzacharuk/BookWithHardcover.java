package pl.mzacharuk;

public class BookWithHardcover extends BookDecorator {

    private String cover = "Twarda okładka";
    private boolean hasCover = false;

    public BookWithHardcover(Publication decoratedPublication) {
        super(decoratedPublication);
    }

    @Override
    public String getInfoAboutBook() {
        if(this.decoratedPublication.getInfoAboutBook().contains("okładka")){
            return decoratedPublication.getInfoAboutBook() + " \t Ta ksiazka posiada juz okladke";
        }else{
            return decoratedPublication.getInfoAboutBook()+" | "+cover;
        }
    }
}
