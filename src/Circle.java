    /*This class calculates all the basic parameters of a circle given just the radius, this includes the diameter,
    * the perimeter and the area. */

public class Circle {

    public Circle(){
    }

    /* This method is responsible to calculate all the circle parameters it has a do-while and if-else to make sure that
    * the given radius is above 0 and make reprints the commands and asks for the input again if the condition is not met. */

    public void calcCircle(){

        double radius;

        do {
            System.out.println("Please enter the radius:");
            radius = Main.sc.nextDouble();
            System.out.println();

            if(radius > 0) {

                double res = radius * 2;
                System.out.println("The circle's diameter is: " + res);

                res = res * Math.PI;
                System.out.println("The circle's perimeter is: " + res);

                res = radius * radius;
                System.out.println("The circle's area is: " + res);
                System.out.println();

            } else System.out.println("Please choose a value above 0");

        }while(radius <= 0);
    }
}
