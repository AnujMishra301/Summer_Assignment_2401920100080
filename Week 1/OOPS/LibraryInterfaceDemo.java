import java.util.Scanner;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        KidUser kid = new KidUser();

        System.out.println("Enter your age: ");
        kid.age=sc.nextInt();

        System.out.println("Enter book type: ");
        kid.bookType=sc.next();

        kid.registerAccount();
        kid.requestBook();
    }
}