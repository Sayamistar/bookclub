package assignment;


public class Catalogue {
    private static int currentUnusedBookNo;
    private int maxBooks;
    private int numBooks;
    private Book[] bookList;


    //constructor for catalogue
    public Catalogue(int bookNoSeed, int maxBooks) {
        this.currentUnusedBookNo = bookNoSeed;
        this.maxBooks = maxBooks;
        this.numBooks = 0;
        this.bookList = new Book[maxBooks];
    }


    //method to add book
    public boolean addBook(String title, String mainAuthor, String genre, int year){
        if (numBooks < maxBooks){
            Book temp = new Book(currentUnusedBookNo, title, mainAuthor, genre, year);
            bookList[numBooks] = temp;
            currentUnusedBookNo++;
            numBooks++;
            return true;
        }
        return false;
    }

    
    //method to find book
    private int findBook(int bNum)
    {
        int index;
        for(index = 0; index < numBooks; index++)
        {
            if (bookList[index].getBookNumber() == bNum){
                return index;
            }
        }
        return -1;
    }


    //method to view book details
    public String viewBook(int bNum){
        String notFound = "Sorry! The book does not exist in the system.";
        if (findBook(bNum) != -1){
            return bookList[findBook(bNum)].toString();
        }
    return notFound;
    }


    //method to delete book
    public boolean deleteBook(int bNum)
    {
        for (int i = 0; i < numBooks; i++)
        {
            if (i == findBook(bNum))
            {
                bookList[i] = bookList[numBooks - 1];
                numBooks--;
                return true;
            }
        }
        return false;
    }


    //method to display book list
    public String getBookList() {
        String list = "List of Books:\n";
        for (int i = 0; i < numBooks; i++) {
            list += (i + 1) + ".\t" + bookList[i] + "\n";
        }
        return list;
    }
}
