/*
 * Author: John Ojerahi.
 * Date: 05/05/2021
 * Program: Restaurant.java
 */

package restaurantapp;
/*Based on the above scenario, you should develop a JAVA application that should include three instance variables, veg, nonVeg and dessert.
 Write a set and a get method for each instance variable. Additionally, write the methods named, calculateBill and getBill that calculates
 the total amount (Dish ordered along with dessert if ordered) and adding 21% VAT on the total amount calculated.*/

public class Restaurant {

    //Declaration of variables
     String veg;
     String non_veg;
     String dessert;
     double calculateBill;
     double totalBill;


    //Getter & Setter methods

    //Set Method of VegDish
    public void setVeg(String vegMeals) {
        veg = vegMeals;
    }

    //Get Method for VegDish
    public String getVeg() {                    //This method Returns the value of Veg
        return veg;
    }

    //Set Method for NonVeg Dish
    public void setNon_veg(String nonVeg) {       //This method sets the value of non-Veg
        non_veg = nonVeg;
    }

    //Getter for NonVeg Dish
    public String getnonVeg() {                   //This method Returns the value of non-Veg
        return non_veg;
    }

    //Setter for Dessert
    public void setDessert(String desse) {        //This method sets the value of dessert
        dessert = desse;
    }

    //Getter for Dessert
    public String getDessert() {                    //This method Returns the value of dessert
        return dessert;
    }

    //Method to calculateBill
    public double calculateBill() {
        double total = 0;
        if (veg != null) {                           //Execute if customer chooses Veg option
            total = 14.50;

        if (dessert.equals("Yes")) {                //Customer choice to include dessert to Veg Dish

        return total = total + 6.50;                //Includes the price of dessert to total price

       } else if (dessert.equals("No")) {          //Execute this line if customer does not include dessert to Veg Dish

                return total;                      //return total Bill for Veg Dish
            }

        }

        if (non_veg != null) {                    //Execute if customer chooses Non-Veg option
           total = 19.25;
           if (dessert.equals("Yes")) {           //Customer choice to include dessert to Non-Veg Dish

           return total = total + 6.50;           //Includes the price of dessert to total price

           } else if (dessert.equals("No")) {     //Execute this line if customer does not include dessert to Non-Veg Dish

                return total;                     //return total Bill for Non-Veg Dish
            }
        }
        return total;

    }

    //Method to GetBill with vatInclusive
    public double getBill() {

        double totalBill = calculateBill();         //Calls CalculateBill method vat exclusive

        double total_amount = 0;                    //Declaration and initialisation of variable to compute getBill

        double vat = 0.21 * totalBill;               //Computes 21% vat

        total_amount = totalBill + vat;              //Includes vat to total Bill

        return total_amount;                        //return Bill inclusive of Vat
    }

     }
