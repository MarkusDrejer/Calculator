import java.util.Scanner;
public class Pizza {

    String name;
    int price;
    String filling;
    boolean isFamily = false;

    public Pizza(String name, int price, String filling){
        this.name = name;
        this.price = price;
        this.filling = filling;
    }

    public Pizza(){}

    public void sizeUp(int priceUp){
        isFamily = !isFamily;
        price = priceUp;
    }

    public void show(){
        System.out.println("Information about the Pizza");
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Filling: " + filling);

        if(isFamily){
            System.out.println("Family Sized");
        }
        else{
            System.out.println("Not family sized");
        }
    }





    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String confirm;
        int familyPrice = 0;

        Pizza pizzaOrder = new Pizza();

        Pizza p1 = new Pizza("Margherita", 47, "Double cheese, oregano");
        Pizza p2 = new Pizza("Vesuvio", 55, "Ham");


        do {

            System.out.println("Menu: ");
            System.out.println("Number 35 - Margherita");
            System.out.println("Number 37 - Vesuvio");
            System.out.print("Your choice: ");
                int input = sc.nextInt() ;


            switch (input) {

                case 35:
                    p1.show();
                    pizzaOrder = p1;
                    familyPrice = 100;
                    break;

                case 37:
                    p2.show();
                    pizzaOrder = p2;
                    familyPrice = 150;
                    break;


            }

            System.out.println("Do you want the pizza in a different size? (yes or no)");
            sc.nextLine();
            confirm = sc.nextLine();

            if(confirm.equals("yes")){
                pizzaOrder.sizeUp(familyPrice);
            }

            System.out.println("Your current order: ");
            pizzaOrder.show();


            System.out.println("Are you sure of your choice? (yes or no)");
            confirm = sc.nextLine();

            if(confirm.equals("yes")){
                System.out.println("Thank you for your order!");
            }

        }while(confirm.equals("no"));

    }
}
