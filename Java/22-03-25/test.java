import java.util.Scanner;

public class test{


    //  static, instance, local variables
    // local always under the funtion, instance in the class out the mthod
    //  static also out and declear as static we can access instnce wit object

    public static void main(String[] args){

        System.out.println("hello world");


        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();

        System.out.println(a+"success");

    }
}