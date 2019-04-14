package pl.mzacharuk;

public class Book implements Publication {

    private String authorName;
    private String titleName;
    private int pageCountValue;
    private String infoAboutBook;

    public Book() {
    }

    public Book(String authorName, String titleName, int pageCountValue) {
        setAuthorName(authorName);
        setTitleName(titleName);
        setPageCountValue(pageCountValue);
    }

    @Override
    public String getInfoAboutBook() {
        infoAboutBook = this.getAuthorName()+" | "+this.getTitleName()+" | "+this.getPageCountValue();
        return infoAboutBook;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public int getPageCountValue() {
        return pageCountValue;
    }

    public void setPageCountValue(int pageCountValue) {
        this.pageCountValue = pageCountValue;
    }

}
