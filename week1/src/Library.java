import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;

public class Library {
    ArrayList<Book> books;
    HashMap<Integer,Member> members;
    HashSet<String>categories;

    public Library(ArrayList<Book> books, HashMap<Integer, Member> members, HashSet<String> categories) {
        this.books = books;
        this.members = members;
        this.categories = categories;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public HashMap<Integer, Member> getMembers() {
        return members;
    }

    public HashSet<String> getCategories() {
        return categories;
    }
}
