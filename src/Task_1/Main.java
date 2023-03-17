package Task_1;

import java.util.ArrayList;

public class Main {
   static ArrayList<Customer> Customers = new ArrayList<Customer>();
    public static void main(String[] args) {
        Customer customer1 = new Customer("Anders","Jensen","Darkdrinker",1);
        Customer customer2 = new Customer("Noah", "Kirkebjerg", "kirkebakken", 2);

        Customers.add(customer1);
        Customers.add(customer2);

        printCustomers();
    }
    public static void printCustomers(){
        for(Customer customer: Customers){
            System.out.println(customer.toString());
        }
    }
}