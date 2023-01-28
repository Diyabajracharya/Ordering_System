package models;

import java.util.ArrayList;

    public class Customer {
        String customer_name;
        ArrayList<Orders> orders;
        double price;

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public String getCustomer_name() {
            return customer_name;
        }

        public void setCustomer_id(String customer_name) {
            this.customer_name = customer_name;
        }

        public ArrayList<Orders> getOrders() {
            return orders;
        }

        public void setOrder(ArrayList<Orders> orders) {
            this.orders = orders;
        }


        public Customer(String customer_name, ArrayList<Orders> orders, double price) {
            this.customer_name = customer_name;
            this.orders = orders;
            this.price = price;
        }

        public void getBill(double spent_money) {
            System.out.println("\n");
            System.out.println("Your total bill is " + (spent_money + this.getPrice()));
        }

    }
