public class Sum {

    /* This class is used to calculate the Sum of numbers from 0 to a user input. */

    public Sum(){
    }

    /* This method is used to calculate the sum of the numbers from 0 to N(user input), it has its own variables
    * that are used to hold on to the user input as well as the result, the user input is put in the variable N and is
    * retrieved via the scanner declared in the Main class.
    *
    * In order to calculate the sum it uses the formula (N+(N*N))/2, it saves this result in the variable sum_N and
    * prints this later. To prevent inputs that are 0 or lower, the method uses a do-while to keep the information
    * and keep accepting inputs from the user till this input is above 0.
    *
    * It also incorporates an if-else inside the do-while, which only sets the sum_N variable to the result if the input is over 0
     * and alternative prints a new line saying that the input is invalid if the input is 0 or less than 0. */

    public void calcSum(){
        int N;
        int sum_N = 0;

        do {
            System.out.println("Please enter a number greater than 0");
            System.out.print("Number: ");
            N = Main.sc.nextInt();

        if(N > 0){
            sum_N = (N+(N*N))/2;
        }
        else {
            System.out.println("Please choose a number over 0");
        }

        }while (N <= 0);

        System.out.println();
        System.out.println("The sum is " + sum_N);
        System.out.println();
    }
}