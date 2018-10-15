import static java.lang.StrictMath.sqrt;

    /* This class is used to calculate everything related to squares in the program all the public methods that calculates
      * are called from the Menus class to incorporate them into the menu system and so when one calculation is finished
       * the user gets returned to the menu*/

public class Square {


    public Square(){
    }

    /* This method calculates the area and the perimeter of a standard square i.e a rectangle and a square with
    * equal side lengths.
    * The method collects two user inputs in the variables x and y and makes use of a variable called 'Sum' which is
    * used to perform several calculations by simply just overriding whatever is already present with a new result after
    * having printed the previous result. */

    public void sSquare(){
        System.out.println("Please enter Length and Width");
        System.out.print("Length: ");
            double x = Main.sc.nextDouble();
        System.out.print("Width: ");
            double y = Main.sc.nextDouble();


            double Sum = x * y;
        System.out.println();
        System.out.println("The area of this square is: " + Sum);

        perimeter(x, y);

            Sum = sqrt((x*x) + (y*y));
        System.out.println("The diagonals of this square are: " + Sum);
        System.out.println();
    }

    /* This method calculates the area and perimeter on a Parallelogram, in order to do this several inputs are needed,
    * in total four possible inputs are present, 2 which needs to be filled and at least 1 of the last 2.
    * In order to have enough information from the user to calculate some checks are in place.
    *
    * First the menu and inputs are encased in a do-while, which makes sure that no values are below 0 and that the
    * 2 mandatory fields are not set to 0, in addition to this an if prints an error message if any of the previous
    * mentioned parameters are not met.
    *
    * At the start of the method a line saying that the user should input 0 in one of the last 2 inputs if
    * they have no information as this can be the case, and only one of these are needed to finish the calculations.
    * So at the end of the method it checks which of the 2 last parameters are set to 0 and calculates accordingly*/

    public void para(){

        double x;
        double y;
        double z;
        double h;
        double Sum = 0;

        do {
        System.out.println("Please enter Length, Width & Angle or Height");
        System.out.println("If no information enter 0");
        System.out.print("Length: ");
            x = Main.sc.nextDouble();
        System.out.print("Width: ");
            y = Main.sc.nextDouble();
        System.out.print("Angle: ");
            z = Main.sc.nextDouble();
        System.out.print("Height: ");
            h = Main.sc.nextDouble();

            if((x <= 0 || y <= 0 || z < 0 || h < 0) || (z == 0 && h == 0)){
                System.out.println("One or more inputs are invalid");
            }
        }while ((x <= 0 || y <= 0 || z < 0 || h < 0) || (z == 0 && h == 0));


            if((z == 0 && h > 0) || (z > 0 && h > 0)) {
                Sum = x * h;
            }
            else if(h == 0 && z > 0){
                Sum = y * x * Math.sin(Math.toRadians(z));
            }
        System.out.println();
        System.out.println("The area of the Parallelogram is: " + Sum);

            perimeter(x, y);
        System.out.println();

    }

    /* This small method is used to calculate the perimeter of a square, since this formula is true for all squares
    * it makes sense to have a small method that can be called from the other big calculating methods in order to avoid
    * duplication in the rest of the class, this method is also private since only the squares need to use it. */

    private void perimeter(double x, double y){
        double pSum = (x*2) + (y*2);
            System.out.println("The perimeter of this square is: " + pSum);
    }
}