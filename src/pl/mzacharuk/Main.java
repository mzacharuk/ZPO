package pl.mzacharuk;

public class Main {

    public static void main(String[] args) {
        Publication book1 = new Book("Adam Mickiewicz","Pan Tadeusz",350);
        System.out.println(book1.getInfoAboutBook());

        Publication book2 = new Book("Michal Zacharuk","Java for dummies",100);
        System.out.println(book2.getInfoAboutBook());

        Publication bkk1 = new BookWithStandardCover(book1);
        System.out.println(bkk1.getInfoAboutBook());

        Publication bkkk1 = new BookWithStandardCover(bkk1);
        System.out.println(bkkk1.getInfoAboutBook());

    }
}
