public class Menus {

    /* This class is used to setup the entire menu system of this program, which enables the user to navigate between
     * the areas of calculating and also simplifies what needs to run in the Main class, as this class can handle all
      * the path-finding by calling methods from the calculation classes and use them in the switches.
      *
      * The class starts by creating instances of the calculation classes in order for the methods that is going to
      * calculate can be called and that they don't have to be static methods. */

    Sum s1;
    Square s;
    Circle c;
    Triangle t;
    Quadratic q;

    public Menus(){
        s1 = new Sum();
        s = new Square();
        c = new Circle();
        t = new Triangle();
        q = new Quadratic();
    }

    /* This is the first in a series of do-whiles and switches which all act to create a menu structure that lets the
     * user navigate via simple number inputs and keeps them in the menu if the number entered is not valid.
      * It makes use of a local variable called 'choice1' which uses the scanner of the main class to read user input
       * and thereafter uses this input to determine where to send the user. */

    public void start(){
        int choice1;
    do {
        System.out.println("1 - Sum");
        System.out.println("2 - Square");
        System.out.println("3 - Circle");
        System.out.println("4 - Triangle");
        System.out.println("5 - Quadratic");
        System.out.println("0 - Exit");
            choice1 = Main.sc.nextInt();
        System.out.println();

        switch(choice1){
            case 1:
                s1.calcSum();
                break;

            case 2:
                sSwitch();
                break;

            case 3:
                c.calcCircle();
                break;

            case 4:
                tSwitch();
                break;

            case 5:
                qSwitch();
                break;
        }

    }while (choice1 != 0);

}

        /* This method acts as the choice of the square calculation functions, and uses its own local variable called
         * 'choice2' to determine where to send the user, the reason why a local variable is used for the choice in all
         * the methods is because, if a single class variable is used everywhere, the previous result for the input is
         * saved and will make the next do-while loop terminate when the same exit command is used, in this case 0.
         *
         * If a class variable was used across multiple of these methods, the exit command would have to be different. */

    public void sSwitch(){
        int choice2;
        do {
            System.out.println("1 - Standard Square");
            System.out.println("2 - Parallelogram");
            System.out.println("0 - Back");
                choice2 = Main.sc.nextInt();
            System.out.println();

            switch (choice2){

                case 1:
                    s.sSquare();
                    break;

                case 2:
                    s.para();
                    break;
            }

        }while (choice2 != 0);
    }

    /* This method works just like the previous choice methods and works for the Triangle calculation part of the program,
     * with its own choice variable. */

    public void tSwitch(){
        int choice3;
        do {
            System.out.println("1 - Arbitrary Triangle");
            System.out.println("2 - Right angled Triangle (Pythagoras)");
            System.out.println("3 - Cosine");
            System.out.println("0 - Back");
             choice3= Main.sc.nextInt();
            System.out.println();

            switch (choice3){

                case 1:
                    t.arbitrary();
                    break;

                case 2:
                    t.pythagoras();
                    break;

                case 3:
                    t.cosine();
                    break;
            }

        }while (choice3 != 0);
    }

    /* This method works just like the previous choice methods and works for the Quadratic calculation part of the program,
     * with its own choice variable. */

    public void qSwitch(){
        int choice4;
        do {
            System.out.println("1 - Solve Function");
            System.out.println("2 - Vertex");
            System.out.println("0 - Back");
                choice4 = Main.sc.nextInt();
            System.out.println();

            switch (choice4){

                case 1:
                    q.calcFunction();
                    break;

                case 2:
                    q.calcVertex();
                    break;
            }

        }while (choice4 != 0);
    }
}
