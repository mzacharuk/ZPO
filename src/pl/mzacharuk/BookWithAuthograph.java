package pl.mzacharuk;

public class BookWithAuthograph extends BookDecorator {
    private String autograph;

    public BookWithAuthograph(Publication decoratedPublication, String autograph) {
        super(decoratedPublication);
        this.autograph = autograph;
    }

    @Override
    public String getInfoAboutBook() {
        if(this.decoratedPublication.getInfoAboutBook().contains(autograph)){
            return decoratedPublication.getInfoAboutBook() + "\t Ta ksiazka posiada juz autograf";
        }else{
            return decoratedPublication.getInfoAboutBook()+" | "+autograph;
        }
    }
}
