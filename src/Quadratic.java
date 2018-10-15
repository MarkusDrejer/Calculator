    /* This class is responsible for calculating various things based on quadratic functions*/

public class Quadratic {

    public Quadratic(){
    }

    /* This method calculates the given functions Discriminant and the 0-2 x results  via the given mathmatical formulas,
    * it makes use of an if-else to determine based in the Discriminant whether the function has 0,1 or 2 results and
    * calculate accordingly. */

    private double a;
    private double b;
    private double c;

    public void calcFunction(){

        System.out.println("Please enter the variables of the function:");

        functionSet();

        System.out.println();
        System.out.println("The Discriminant is: " + disc());

        if(disc() > 0){
            double res1 = ((-b) + Math.sqrt(disc()))/(2*a);
                System.out.println("Result 1: " + res1);
        }
        if(disc() >= 0){
            double res2 = ((-b) - Math.sqrt(disc()))/(2*a);
            System.out.println("Result 2: " + res2);
        }
        else System.out.println("The function has no solutions");

        System.out.println();
    }

    /* This method calculates the two coordinates of the functions top/low point aka the Vertex, it does so by using the
    * corresponding mathmatical formulas. */

    public void calcVertex(){

        System.out.println("Please enter the variables of the function:");

        functionSet();

            double x = (-b)/(2*a);
        System.out.println("The vertex x-coordinate is: " + x);
            double y = (-(disc()))/(4*a);
        System.out.println("The vertex y-coordinate is: " + y);

        System.out.println();
    }

    /* This small private function is to avoid duplication by calculating the Discriminant as this is useful across
    * several of the other methods. */

    private double disc(){
        double d = Math.pow(b, 2) - (4*a*c);
            return d;
    }

    /* This private function is used to set the class variables for the quadratic function, so as to avoid
    duplication in the other methods. */

    private void functionSet(){
        System.out.print("a: ");
            a = Main.sc.nextDouble();
        System.out.print("b: ");
            b = Main.sc.nextDouble();
        System.out.print("c: ");
            c = Main.sc.nextDouble();
        System.out.println();
    }
}
