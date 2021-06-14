package assignment;

public class Book {
    private int bookNumber;
    private String title;
    private String mainAuthor;
    private String genre;
    private int year;
    
    //constructor for book
    public Book(int bn, String title, String author, String genre, int year){
        this.bookNumber = bn;
        this.title = title;
        this.mainAuthor = author;
        this.genre = genre;
        this.year = year;
    }

    public int getBookNumber() {
        return bookNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getMainAuthor() {
        return mainAuthor;
    }

    public String getGenre() {
        return genre;
    }

    //display book details
    @Override
    public String toString() {
        return "Book No.: " + bookNumber + 
                "\n\tTitle: " + title + "\n\tMain Author: " + mainAuthor + "\n\tGenre: " + genre + "\n\tYear: " + year + "\n";
    }
}
