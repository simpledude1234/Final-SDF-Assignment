/*
 * Author: John Ojerahi.
 * Date: 05/05/2021
 * Program: RestaurantApp.java
 */
package restaurantapp;

import java.util.Scanner;

public class RestaurantApp {

 /*Write a test Restaurant application named RestaurantApp that demonstrates class Restaurant.
  The restaurant is serving two major kinds of food dishes, Veg and NonVeg to single customers.
  The user can select any one option, while Vegetarian dish (type String) can be salad or fruits with a price of 14.50 Euros,
  Non-Vegetarian dish (String) can be fish or chicken or beef with a price of 19.25 Euros. The dessert is optional, and it depends on
  the choice of the customers and Its price is 6.50 Euros. The application should ask to the waiter in the restaurant to enter
  the values of veg or non-veg dishes, dessert and calculate the total bill including VAT. Store the data for five customers along
  with their order details using the arrays.*/

    //Declaration of variables for customerID
    public static void customerID(String[] customerID, Restaurant[] order, int queue) {

        Scanner input = new Scanner(System.in);

        //Declaration and Initialisation of variable
        int queueNo = 0;
        String cust_id;

        System.out.println("Enter Customer ID");                    //Ask waiter to input Customer Id
        cust_id = input.next();                                     //Reads and Stores waiter's input

        for (int i = 0; i < customerID.length; i++) {
            if (customerID[0] == null) {                            //Reads and check if queue is empty
                queueNo = 1;
                customerID[queue] = cust_id;                        //Reads and set queue Number
                break;
            } else {
                queueNo = 1;
                customerID[queue] = cust_id;                        //Reads and set queue Number
                break;
            }
        }

        System.out.println("Total Bill for Customer ID " + customerID[queue] + " vat inclusive is: " + "€"
                + order[queue].getBill());                                           //Displays customer total Bill
        input.nextLine();
        System.out.println("Thank you for your patronage. Hope to see you again!");  //Displays Paradise Thank you message to customer
        System.out.println("--------------------------------------------------------------");

    }

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner input = new Scanner(System.in);
        Restaurant[] order = new Restaurant[5];                                    //Array to store the customer's order
        String[] customerID = new String[5];                                       //Array to store the customer's id


        //Declaration and initialisation of variables
        int orderNo = 0;
        String option;

        System.out.println("-----Welcome to Paradise Restuarant-----");             //Displays paradise welcome message to customer
        System.out.println("We have Veg and Non-Veg dishes on our menu");           //Displays menu types to customer

        do {                                                                        //Use a do-while loop to run through the array until it's complete

            //DISPLAYS TYPES OF MENU AND ASK'S USER TO MAKE AN OPTION
            System.out.println("-------Paradise Menu---------");
            System.out.println("Enter 1 for Veg-Dishes");
            System.out.println("Enter 2 for Non Veg-Dishes");
            System.out.println("-------------------------------");
            option = input.next();                                                          //Stores and reads customer's input

            switch (option) {                                                               //Displays VEG-DISH OPTIONS if customer's choice is VEG-DISH
                case "1":

               //DISPLAYS ONLY VEG DISH MENU
               System.out.println("Enter 1 for Fruit");
               System.out.println("Enter 2 for Salad");
               option = input.next();                                                                //Stores and reads customer's input

               switch (option) {
               case "1":
               System.out.println("Would you like to get dessert with your meal? Enter yes or no.");         //Gives customer option of taking dessert with Fruit
               option = input.next();
               if (option.matches("[yY][eE][sS]|[yY]")) {                                          //If Option is yes, this is executed
               order[orderNo] = new Restaurant();
               order[orderNo].veg = "Fruit";
               order[orderNo].dessert = "Yes";
               customerID(customerID, order, orderNo);                                               //Invokes the customer ID method
               orderNo++;

               } else if (option.matches("[nN][oO]|[nN]")) {                                       //If Option is No, this is executed
               order[orderNo] = new Restaurant();
               order[orderNo].veg = "Fruit";
               order[orderNo].dessert = "No";
               customerID(customerID, order, orderNo);                                               //Invokes the customer ID method
               orderNo++;
               } else {
               System.out.println("Thank you");
               }
               break;

               case "2":
               System.out.println("Would you like to get dessert with your meal? Enter yes or no.");        //Gives customer option of taking dessert with Salad
               option = input.next();
               if (option.matches("[yY][eE][sS]|[yY]")) {                                          //If Option is yes, this is executed
               order[orderNo] = new Restaurant();
               order[orderNo].veg = "Salad";
               order[orderNo].dessert = "Yes";
               customerID(customerID, order, orderNo);                                                //Invokes the customer ID method
               orderNo++;
               } else {
               option.matches("[nN][oO]|[nN]");                                                    // if User do not wants to add dessert
               order[orderNo] = new Restaurant();
               order[orderNo].veg = "Salad";
               order[orderNo].dessert = "No";
               customerID(customerID, order, orderNo);                                                //Invokes the customer ID method
               orderNo++;
               }

               }

               break;
               case "2":                                                                      //Displays VEG-DISH OPTIONS if customer's choice is VEG-DISH

               //DISPLAYS ONLY NON-VEG DISH MENU
               System.out.println("Enter 1 for Fish");
               System.out.println("Enter 2 for Chicken");
               System.out.println("Enter 3 for Beef");
               option = input.next();                                                              //Stores and reads customer's input

               switch (option) {
               case "1":
               System.out.println("Would you like to get dessert with your meal? Enter yes or no.");    //Gives the customer option of taking dessert with the Fish
               option = input.next();
               if (option.matches("[yY][eE][sS]|[yY]")) {                                         //If Option is yes, this is executed
               order[orderNo] = new Restaurant();
               order[orderNo].non_veg = "Fish";
               order[orderNo].dessert = "Yes";
               customerID(customerID, order, orderNo);                                                //Invokes and executes the customer ID method
               orderNo++;

               } else {
               option.matches("[nN][oO]|[nN]");                                                     //If Option is No, this is executed
               order[orderNo] = new Restaurant();
               order[orderNo].non_veg = "Fish";
               order[orderNo].dessert = "No";
               customerID(customerID, order, orderNo);                                                //Invokes the customer ID method
               orderNo++;

               }

               break;
               case "2":
               System.out.println("Would you like to get dessert with your meal? Enter yes or no.");        //Gives customer option of taking dessert with Chicken
               option = input.next();
               if (option.matches("[yY][eE][sS]|[yY]")) {                                          //If Option is yes, this is executed
               order[orderNo] = new Restaurant();
               order[orderNo].non_veg = "Chicken";
               order[orderNo].dessert = "Yes";
               customerID(customerID, order, orderNo);                                               //Invokes the customer ID method
               orderNo++;

               } else {
               option.matches("[nN][oO]|[nN]");                                                    //If Option is No, this is executed
               order[orderNo] = new Restaurant();
               order[orderNo].non_veg = "Chicken";
               order[orderNo].dessert = "No";
               customerID(customerID, order, orderNo);                                                //Invokes the customer ID method
               }

               break;
               case "3":
               System.out.println("Would you like to get dessert with your meal? Enter yes or no.");  //Gives customer option of taking dessert with the Beef
               option = input.next();
               if (option.matches("[yY][eE][sS]|[yY]")) {                                         //If Option is yes, this is executed
               order[orderNo] = new Restaurant();
               order[orderNo].non_veg = "Beef";
               order[orderNo].dessert = "Yes";
               customerID(customerID, order, orderNo);                                                //Invokes the customer ID method
               orderNo++;

               } else {
               option.matches("[nN][oO]|[nN]");                                                     //If Option is No, this is executed
               order[orderNo] = new Restaurant();
               order[orderNo].non_veg = "Beef";
               order[orderNo].dessert = "No";
               customerID(customerID, order, orderNo);                                                //Invokes the customer ID method
               orderNo++;

               }
               }
            }

            } while (orderNo < customerID.length);
             orderNo++;
            input.nextLine();

    }

}
