package assignment;
//Sudeep Manandhar
//101212195

import java.util.*;


public class Assignment {
    
    //generating the menu
    private static void showMenu() {
        System.out.println("\nMenu");
        //menu options
        System.out.println("1. Add Book");
        System.out.println("2. Delete Book");
        System.out.println("3. View All Books");
        System.out.println("4. View Book Details");
        System.out.println("5. Exit");
        
        //requesting for input selection
        System.out.print("\nPlease make a selection (1-5): ");
    }


    public static void main(String[] args) {

        // initializing
        System.out.println("-----------------------------------------");
        System.out.println(" Welcome to the CASUAL WRITERS BOOK CLUB ");
        System.out.println("-----------------------------------------");

        // setting the parameters for the catalogue
        int bookNoSeed = 10000;
        int maxBooks = 7;

        //taking input for the library catalogue
        Scanner input = new Scanner(System.in);

        // generating a new catalogue
        Catalogue cwbc = new Catalogue(bookNoSeed, maxBooks);
        
        //calling the class show menu
        showMenu();

        //taking the input selection
        int choice = input.nextInt();


        //processing the input selection
        do{
            //add book
            if (choice == 1){
                input.nextLine();

                //taking inputs for book details
                System.out.print("Please enter the title of the book: ");
                String title = input.nextLine();
                
                System.out.print("Please enter the name of the main author: ");
                String mainAuthor = input.nextLine();

                System.out.print("Please enter the genre of the book: ");
                String genre = input.nextLine();

                System.out.print("Please enter the year of publication: ");
                int year = input.nextInt();

                //attempting the add and informing the user
                if (cwbc.addBook(title, mainAuthor, genre, year)){
                    System.out.println("\nSuccess! The book \"" + title + "\" was added to the catalogue.");
                }
                else {
                   System.out.println("\nSorry! The book could not be added.");
                }
                
                //ending the add book and back to main menu
                System.out.print("\nPress enter to continue...");
                input.nextLine();
                input.nextLine();
            }

            //delete book
            if (choice == 2){
                //displaying the book list
                System.out.print(cwbc.getBookList());
                
                //taking input for deletion
                System.out.print("Please enter the book number: ");
                int bNum = input.nextInt();
                
                //attempting the delete and informing the user
                if (cwbc.deleteBook(bNum)){
                    System.out.println("\nThe book no. " + bNum + " was deleted.");
                }
                else {
                    System.out.println("\nSorry! The book could not be deleted.");
                }

                //ending the delete book and back to main menu
                System.out.print("\nPress enter to continue...");
                input.nextLine();
                input.nextLine();
            }
            
            //get book list
            else if (choice == 3){
                //getting the book list and informing the user
                System.out.print(cwbc.getBookList());

                //ending the get book list and back to main menu
                System.out.print("\nPress enter to continue...");
                input.nextLine();
                input.nextLine();
            }
            
            //view book details
            else if (choice == 4){
                //taking input for book number
                System.out.print("Please enter the book number: ");
                int bNum = input.nextInt();

                //viewing the book details
                System.out.println("\t" + cwbc.viewBook(bNum));
                
                //ending the view book details and back to main menu
                System.out.print("\nPress enter to continue...");
                input.nextLine();
                input.nextLine();
            }
            
            showMenu();
            choice = input.nextInt();
        }
        while (choice != 5);
        
        //exiting the program
        System.out.println("\nThank you for using this program. Goodbye!");
    }
}
