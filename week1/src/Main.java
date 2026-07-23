import java.util.*;

public class Main {
   public static void main(String[] args){
       Scanner input = new Scanner(System.in);

       ArrayList<Book> books = new ArrayList<>();
       HashMap<Integer, Member> members = new HashMap<>();
       HashSet<String> categories = new HashSet<>();

       Library library = new Library(books, members, categories);
       LibraryService service = new LibraryService(library);
       int choice=-1;
       do {
           System.out.println("1.Add book");
           System.out.println("2.Remove book");
           System.out.println("3.Update book");
           System.out.println("4.Add member");
           System.out.println("5.Remove member");
           System.out.println("6.Borrow book");
           System.out.println("7.Return book");
           System.out.println("8.List books");
           System.out.println("9.List members");
           System.out.println("10.Search by title");
           System.out.println("11.Search by author");
           System.out.println("12.Search by category");
           System.out.println("13.Show statistics");
           System.out.println("14.Exit");

           System.out.print("Enter your choice: ");
           try {
           choice = input.nextInt();
           switch (choice) {
               case 1:
                   System.out.println("Enter id book");
                   int id = input.nextInt();
                   input.nextLine();
                   System.out.println("Enter title book");
                   String title = input.nextLine();
                   System.out.println("Enter author");
                   String author = input.nextLine();
                   System.out.println("Enter category");
                   String category = input.nextLine();
                   System.out.println("enter availableCopies");
                   int copies = input.nextInt();

                   Book book = new Book(id, title, author, category, copies);
                   service.addBook(book);
                   break;
               case 2:
                   System.out.println("Enter book id ");
                   id = input.nextInt();
                   service.removeBook(id);
                   break;
               case 3:
                   System.out.println("Enter id book");
                   id = input.nextInt();
                   input.nextLine();
                   System.out.println("Enter new title book");
                   title = input.nextLine();
                   System.out.println("Enter new author");
                   author = input.nextLine();
                   System.out.println("Enter new category");
                   category = input.nextLine();
                   System.out.println("enter new availableCopies");
                   copies = input.nextInt();

                   Book updatedBook = new Book(id, title, author, category, copies);
                   service.addBook(updatedBook);
                   break;
               case 4:
                   System.out.println("enter member id");
                   int memeberId = input.nextInt();
                   input.nextLine();
                   System.out.println("enter name ");
                   String name = input.nextLine();
                   System.out.println("enter email");
                   String email = input.nextLine();
                   Member memeber = new Member(memeberId, name, email);
                   service.addMember(memeber);
                   break;
               case 5:
                   System.out.println("enter member id");
                   memeberId = input.nextInt();
                   service.removeMember(memeberId);
                   break;
               case 6:
                   System.out.println("Enter member id");
                   memeberId=input.nextInt();
                   System.out.println("enter book id");
                   int bookid=input.nextInt();
                   service.borrowBook(memeberId,bookid);
                   break;
               case 7:
                   System.out.println("enter book id");
                   bookid = input.nextInt();
                   service.returnBook(bookid);
                   break;
               case 8:
                   service.listBooks();
                   break;
               case 9:
                   service.listMamber();
                   break;
               case 10:
                   input.nextLine();
                   System.out.println("enter book title");
                   String titleSearch= input.nextLine();
                   service.searchByTitle(titleSearch);
                   break;
               case 11:
                   input.nextLine();
                   System.out.print("Enter author name ");
                   String authorSearch = input.nextLine();
                   service.searhByAuthor(authorSearch);
                   break;
               case 12:
                   input.nextLine();
                   System.out.print("Enter category ");
                   String categorySearch = input.nextLine();
                   service.searchByCategory(categorySearch);
                   break;
               case 13:
                   service.showStatistics();
                   break;
               case 14:
                   System.out.println("Thank you for using Library Management System.");
                   break;



           }



           }
           catch(InputMismatchException e){

               System.out.println("Invalid Input.");

               input.nextLine();
           }

       }while (choice!=0);

   }
}