package pl.mzacharuk;

public class Main {

    public static void main(String[] args) {
        Publication book1 = new Book("Adam Mickiewicz", "Pan Tadeusz", 350);
        System.out.println(book1.getInfoAboutBook());

        Publication book2 = new Book("Michal Zacharuk", "Java for dummies", 100);
        System.out.println(book2.getInfoAboutBook());

        Publication bkk1 = new BookWithStandardCover(book1);
        System.out.println(bkk1.getInfoAboutBook());

        Publication bkkk1 = new BookWithStandardCover(bkk1);
        System.out.println(bkkk1.getInfoAboutBook());

        Publication bookWithHardCover = new BookWithHardcover(book2);
        System.out.println(bookWithHardCover.getInfoAboutBook());

        Publication bookWithHardCover2 = new BookWithHardcover(bookWithHardCover);
        System.out.println(bookWithHardCover2.getInfoAboutBook());

        Publication bookWithAuthograph = new BookWithAuthograph(bookWithHardCover,"Dla Michala");
        System.out.println(bookWithAuthograph.getInfoAboutBook());

        Publication bookWithAuthograph2 = new BookWithAuthograph(bookWithAuthograph,"Dla Michala");
        System.out.println(bookWithAuthograph2.getInfoAboutBook());

        Publication bookWithWrapper = new BookWithWrapper(bookWithAuthograph);
        System.out.println(bookWithWrapper.getInfoAboutBook());

        Publication bookWithWrapper2 = new BookWithWrapper(bookWithWrapper);
        System.out.println(bookWithWrapper2.getInfoAboutBook());

        Publication bookWithWrapper3 = new BookWithWrapper(book1);
        System.out.println(bookWithWrapper3.getInfoAboutBook());
        /*
        TODO: handle other classes to not create object with already existing authograph
        TODO: handle wrapper - it should allow create an object only if it has cover
         */

    }
}
