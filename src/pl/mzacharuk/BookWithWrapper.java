package pl.mzacharuk;

public class BookWithWrapper extends BookDecorator {
    private String wrapper = "Z obwolutą";

    public BookWithWrapper(Publication decoratedPublication) {
        super(decoratedPublication);
    }

    @Override
    public String getInfoAboutBook() {

        if(this.decoratedPublication.getInfoAboutBook().contains(wrapper)){
            return decoratedPublication.getInfoAboutBook()+" \t Ta ksiazka posiada juz okladke";
        }else if(!this.decoratedPublication.getInfoAboutBook().contains("okładka")){
            return  decoratedPublication.getInfoAboutBook()+"\t Nie można obłożyć obwolutą książki, która nie posiada okładki";
        }else{
            return decoratedPublication.getInfoAboutBook()+" | "+wrapper;
        }
    }
}
