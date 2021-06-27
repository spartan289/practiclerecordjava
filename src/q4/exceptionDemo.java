package q4;
import java.util.Scanner;
public class exceptionDemo {
    static void test(int age) throws UnderAge {
        if(age<18)
            throw new UnderAge(age);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        try {
            test(age);
            System.out.print("Test Sucessful");

        } catch (UnderAge e) {
            System.err.println(e.getMessage());
            System.out.println("Test Unsucessful");
        }
        finally {
            sc.close();
        }
    }

}
