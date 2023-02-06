package org.example;

import java.util.ArrayList;
import java.util.List;

class Customer {
    String fullName = "";
    double totalCost = 0;
    double interest = 0;
    double years = 0;

    double payMonth = 0;
};

class CreatorCustomer{
    CreatorCustomer(){}
    double pow(double num, double p){
        if(p == 0.0) return num;
        return num*pow(num, p-1);
    }
    Customer createCustomer(String[] data){
        Customer customer = new Customer();
        customer.fullName = data[0];
        customer.totalCost = Double.parseDouble(data[1]);
        customer.interest = Double.parseDouble(data[2])/100;
        customer.years = Double.parseDouble(data[3]);
        double f1 = pow(1 + customer.interest, customer.years*12);
        customer.payMonth = customer.totalCost*((customer.interest*f1)/(f1-1));
        return customer;
    }
}
public class Main {
    public static void main(String[] args) {
        Reader reader = new Reader();
        List<String> dataFromTxt = reader.readDataFromTxt("data.txt");
        List<String[]> data = new ArrayList<>();
        for(String str: dataFromTxt){
            String[] line = str.split(",");
            data.add(line);
        }
        List<Customer> customers = new ArrayList<>();
        CreatorCustomer creatorCustomer = new CreatorCustomer();
        for (int i = 1; i < data.size(); i++) {
            Customer customer = creatorCustomer.createCustomer(data.get(i));
            customers.add(customer);
        }
        for(int i = 0; i <customers.size();i++){
            System.out.println("Full name " + customers.get(i).fullName);
            System.out.println("\tPay of Month " + customers.get(i).payMonth);
            System.out.println("\n");
        }
    }


}