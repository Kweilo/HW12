public class Book {
    private String title;
    private int year;
    private Author author;

    public Book(String title, int year, Author author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public int getYear() {
        return this.year;
    }

    public Author getAuthor() {
        return this.author;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Название " + this.title + ", год издания  " + this.year + "автор " + this.author.toString();
    }
    @Override
    public boolean equals(Object book) {
        if (this.getClass() != book.getClass()) {
            return false;
        }
        Book a2 = (Book) book;
        return this.year==a2.year && this.author.equals(a2.author) && this.title.equals(a2.title);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(title);
    }
}
