import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        ArrayList <String> names=new ArrayList<>();
        int choice;
        do {

            System.out.println("1-add name");
            System.out.println("2-remove name");
            System.out.println("3-exists");
            System.out.println("4-print");
            System.out.println("5-exit");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("enter name: ");
                    String addName=input.next();
                    names.add(addName);
                    break;
                case 2:
                    System.out.println("enter name: ");
                    String remove = input.next();
                    names.remove(remove);
                    break;
                case 3:
                    System.out.println("enter name: ");
                    String existsNAME=input.next();
                    System.out.println(names.contains(existsNAME));
                    break;
                case 4:
                    System.out.println(names);
                    break;
                case 5:
                    break;

            }
        }while (choice!=5);

    }
}
