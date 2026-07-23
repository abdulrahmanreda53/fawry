import java.util.Iterator;

public class LibraryService implements Search {
    private Library library;

    public LibraryService(Library library) {
        this.library = library;
    }

    public void addBook(Book book)
    {
        for(Book b:library.getBooks())
        {
            if(b.getId()==book.getId()) {
                System.out.println("book already exists. ");
                return;
            }
        }
        library.getBooks().add(book);
        System.out.println("book added");
    }

    public void updateBook(Book book){
        for(Book b:library.getBooks()){
            if (b.getId()==book.getId())
            {
                b.setTitle(book.getTitle());
                b.setAuthor(book.getAuthor());
                b.setCategory(book.getCategory());
                b.setAvailableCopies(book.getAvailableCopies());
                System.out.println("Book updated successfully.");
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public void listBooks() {

        for (Book b : library.getBooks()) {
            System.out.println(b);
        }
    }

    public void removeBook(int id)
    {
        Iterator<Book> iterator=library.getBooks().iterator();
        while (iterator.hasNext()) {
            Book b=iterator.next();
            if (b.getId()==id)
            {
                iterator.remove();
                System.out.println("remove book");
                return;
            }
            System.out.println("book not found");
        }
    }

    public void addMember(Member member) {
        if (library.getMembers().containsKey(member.getId())) {
            System.out.println("member already exists");
            return;
        }
        library.getMembers().put(member.getId(), member);
        System.out.println("member added");
    }

    public void listMamber(){
        for(Member member:library.getMembers().values())
            System.out.println(member);
    }

    public void removeMember(int id){
        if(!library.getMembers().containsKey(id)) {
            System.out.println("memeber not found");
            return;
        }
        library.getMembers().remove(id);
        System.out.println("member removed");
    }

    @Override
    public void searchByTitle(String title){
        boolean found = false;
        for (Book b:library.getBooks()){
            if (b.getTitle().equalsIgnoreCase(title)){
                System.out.println(b);
                found= true;
            }
        }
        if(!found){
            System.out.println("not found");
        }
    }

    @Override
    public void searhByAuthor(String author)
    {
        boolean found = false;
        for (Book b:library.getBooks())
        {
            if (b.getAuthor().equalsIgnoreCase(author))
            {
                System.out.println(b);
                found = true;
            }
        }
        if (!found)
            System.out.println("not found");
    }

    @Override
    public void searchByCategory(String category)
    {
        boolean found = false;
        for (Book b:library.getBooks())
        {
            if(b.getCategory().equalsIgnoreCase(category))
            {
                System.out.println(b);
                found=true;
            }
        }
        if (!found)
            System.out.println("not found");
    }

    public void borrowBook(int memberId, int bookId) {

        if (!library.getMembers().containsKey(memberId)) {
            System.out.println("Member not found.");
            return;
        }

        for (Book b : library.getBooks()) {

            if (b.getId() == bookId) {

                if (b.getAvailableCopies() > 0) {

                    b.setAvailableCopies(b.getAvailableCopies() - 1);

                    System.out.println("Book borrowed");
                } else {

                    System.out.println("No copies.");
                }

                return;
            }
        }
        System.out.println("Book not found.");
    }
    public void returnBook(int bookId) {
        for (Book b : library.getBooks()) {
            if (b.getId() == bookId) {
                b.setAvailableCopies(b.getAvailableCopies() + 1);
                System.out.println("Book returned");
                return;
            }
        }
        System.out.println("not found.");
    }
    public void showStatistics() {
        System.out.println("Total books: " + library.getBooks().size());
        System.out.println("Total members: " + library.getMembers().size());
        int available = 0;
        int borrowed = 0;
        for (Book b : library.getBooks()) {
            if (b.getAvailableCopies() > 0) {
                available++;
            } else {
                borrowed++;
            }
        }
        System.out.println("Available books: " + available);
        System.out.println("Borrowed books: " + borrowed);
    }








}

