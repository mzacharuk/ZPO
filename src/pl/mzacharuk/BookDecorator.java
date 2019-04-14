package pl.mzacharuk;

public abstract class BookDecorator implements Publication{

    protected Publication decoratedPublication;
    protected boolean hasCover=false;

    public BookDecorator(Publication decoratedPublication){

        super();
        /*
        TODO: FLAG IF BOOK WAS ALREADY DECOREATED
         */
        if(!hasCover){
            this.decoratedPublication = decoratedPublication;
        }else{
            System.out.println("Ta ksiazka posiada juz okladke");
        }

        hasCover = true;
    }

}
