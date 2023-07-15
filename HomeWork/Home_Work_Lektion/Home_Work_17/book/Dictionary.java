package Home_Work_17.book;

public class Dictionary extends Book {
    private String language;
    private int pageCount;



    public Dictionary(long isbn,String title, String author, int yearOfPublishing, String language, int pageCount) {
        super(isbn,title, author, yearOfPublishing);
        this.language = language;
        this.pageCount = pageCount;
    }


    public void display() {
        super.display();
        System.out.println("Language: " + language);
        System.out.println("Page Count: " + pageCount);
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
