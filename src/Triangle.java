/* This class calculates a variety of different triangle parameters and types, i.e the standard triangle &
* using pythagoras on right angled triangles.*/

public class Triangle {

    public Triangle(){
    }

    double a;
    double b;
    double c;

    /**/

    public void arbitrary(){

        double h;
        double bl;

        do {
            System.out.println("Please enter the given data");
            System.out.print("Height: ");
            h = Main.sc.nextDouble();
            System.out.print("Baseline: ");
            bl = Main.sc.nextDouble();

            if(h <= 0 || bl <= 0) System.out.println("Invalid input");

        }while (h <= 0 || bl <= 0);

            double areaSum = 0.5*h*bl;
        System.out.println();
        System.out.println("The area of this triangle is: " + areaSum);
        System.out.println();

    }

    /**/

    public void pythagoras(){

        do {

            setup();

            if((a <= 0 && b <= 0) || (a <= 0 && c <= 0) || (b <= 0 && c <= 0)) {
                System.out.println("Invalid inputs (At least 2 sides need data)");
                System.out.println();
            }

        }while ((a <= 0 && b <= 0) || (a <= 0 && c <= 0) || (b <= 0 && c <= 0));

        if(c > 0 && b > 0){
            double aSum = Math.sqrt(Math.pow(c, 2) - Math.pow(b, 2));
            System.out.println("Side a is: " + aSum);
        }
        if(c > 0 && a > 0){
            double bSum = Math.sqrt(Math.pow(c, 2) - Math.pow(a, 2));
            System.out.println("Side b is: " + bSum);
        }
        if( a > 0 && b > 0){
            double cSum = Math.sqrt(Math.pow(a, 2) - Math.pow(b, 2));
            System.out.println("Side c is: " + cSum);
        }

        System.out.println();

    }

    /**/

    public void cosine(){

        double angleA;
        double angleB;
        double angleC;

        //do {

            setup();
            System.out.print("Angle a: ");
                angleA = Main.sc.nextDouble();
            System.out.print("Angle b: ");
                angleB = Main.sc.nextDouble();
            System.out.print("Angle c: ");
                angleC = Main.sc.nextDouble();
            System.out.println();

           /*if() {
                System.out.println("Invalid inputs");
                System.out.println("");
            }
            if() {
                System.out.println("Invalid inputs");
                System.out.println("");
            }*/

        //}while ();


        double cosA = Math.cos(Math.toRadians(angleA*Math.PI/180));
        double cosB = Math.cos(Math.toRadians(angleB*Math.PI/180));
        double cosC = Math.cos(Math.toRadians(angleC*Math.PI/180));

        if(angleA > 0 && b > 0 && c > 0){
            double s = Math.sqrt((Math.pow(b, 2)+Math.pow(c, 2)) - (2*b*c*cosA));
            System.out.println("Side-length a is: " + s);
        }
        if(angleB > 0 && a > 0 && c > 0){
            double s = Math.sqrt((Math.pow(a, 2)+Math.pow(c, 2)) - (2*a*c*cosB));
            System.out.println("Side-length b is: " + s);
        }
        if(angleC > 0 && a > 0 && b > 0){
            double s = Math.sqrt((Math.pow(a, 2)+Math.pow(b, 2)) - (2*a*b*cosC));
            System.out.println("Side-length c is: " + s);
        }
            System.out.println();


        if(a > 0 && b > 0 && c > 0){
            double temp;
            double sum;

            temp = ((Math.pow(b, 2)+Math.pow(c, 2)-Math.pow(a, 2))/(2*c*b));
            sum = Math.acos(temp) * (180/Math.PI);
            System.out.println("The angle of A is: " + sum);

            temp = ((Math.pow(a, 2)+Math.pow(c, 2)-Math.pow(b, 2))/(2*a*c));
            sum = Math.acos(temp) * (180/Math.PI);
            System.out.println("The angle of B is: " + sum);

            temp = ((Math.pow(a, 2)+Math.pow(b, 2)-Math.pow(c, 2))/(2*a*b));
            sum = Math.acos(temp) * (180/Math.PI);
            System.out.println("The angle of C is: " + sum);
        }

        System.out.println();

    }

    /**/

    private void setup(){

        System.out.println("Please enter relevant data");
        System.out.println("If no data, enter 0");

        System.out.print("Side a: ");
            a = Main.sc.nextDouble();
        System.out.print("Side b: ");
            b = Main.sc.nextDouble();
        System.out.print("Side c: ");
            c = Main.sc.nextDouble();
        System.out.println();
    }
}
