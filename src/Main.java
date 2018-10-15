import java.util.Scanner;

    /* This class is used to execute the program via the Java main method, it also has a public scanner declared,
       * so that all the other classes can make use of this and it incorporates properly into the program, this
       * scanner is also declared as being static, so that no run-time errors occur in the main method, since
        * non-static objects cannot be referenced in a static method, but also so the scanner can be used in the other
        * classes without creating an instance of this class.
        *
         * The actual code run in this Main class is fairly short as described in the Menus class, it does most of the work
          * Therefore this class just creates an instance of the Menus class and calls the method that starts the menu system
           * of the program, since the start method in the Menus class links to the rest of the program, this is the only thing
            * that needs to be executed in the Main method. */

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        Menus menu = new Menus();

    menu.start();

    }
}