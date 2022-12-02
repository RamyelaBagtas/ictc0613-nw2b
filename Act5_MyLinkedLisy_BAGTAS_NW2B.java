package act5_mylinkedlisy_bagtas_nw2b;
import java.util.LinkedList;
import java.util.Scanner;
/**
 *
 * @author ramyela anne bagtas
 */
public class Act5_MyLinkedLisy_BAGTAS_NW2B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner i = new Scanner(System.in);
    LinkedList<String> members = new LinkedList<>();
        System.out.println("How many members' information will be entered?");
        String value = i.nextLine();
        System.out.print("Enter First Name : ");
        String name = i.nextLine();
        System.out.print("Enter Middle Name : ");
        String middle = i.nextLine();
        System.out.print("Enter Last Name : ");
        String surname = i.nextLine();
        System.out.print("Enter Area Code : ");
        String area = i.nextLine();
        System.out.print("Enter Telephone Number : ");
        String telephone = i.nextLine();
        System.out.print("Enter Gender : ");
        String gender = i.nextLine();
        System.out.print("Enter Age : ");
        String age = i.nextLine();
        
        System.out.println("");
        System.out.println("");
        
        System.out.print("Enter First Name : ");
        String name1 = i.nextLine();
        System.out.print("Enter Middle Name : ");
        String middle1 = i.nextLine();
        System.out.print("Enter Last Name : ");
        String surname1 = i.nextLine();
        System.out.print("Enter Area Code : ");
        String area1 = i.nextLine();
        System.out.print("Enter Telephone Number : ");
        String telephone1 = i.nextLine();
        System.out.print("Enter Gender : ");
        String gender1 = i.nextLine();
        System.out.print("Enter Age : ");
        String age1 = i.nextLine();
        
        System.out.println("");
        System.out.println("");

        System.out.println("Welcome to the club " + name + " " + middle + " " +  surname + "!");
        System.out.println("Your area code and telephone number is " + "(" + area + ")" + telephone + "." );
        System.out.println("You are a " + gender + " member and your age is " + age + ".");
        
        
        System.out.println("");
        System.out.println("");
        
        System.out.println("Welcome to the club " + name1 + " " + middle1 + " " +  surname1 + "!");
        System.out.println("Your area code and telephone number is " + "(" + area1 + ")" + telephone1 + "." );
        System.out.println("You are a " + gender1 + " member and your age is " + age1 + ".");
        
        
    }
    
}
