import models.Customer;
import models.Items;
import models.Orders;

import java.util.ArrayList;

    public class Main {
        public static void main(String[] args) {

            Items i1 = new Items("Protein", "Non-veg","Chicken MO:MO");
            Items i2 = new Items("Organic", "Vegetarian",".");

            Items i3 = new Items("Carbohydrates", "Rice", "Fried Rice");
            Items i4 = new Items("Fat", "healthy_fats", "Cheese");

            ArrayList<Items> Items1 = new ArrayList<>();
            Items1.add(i1);
            Items1.add(i2);

            ArrayList<Items> Items2 = new ArrayList<>();
            Items2.add(i3);
            Items2.add(i4);


            Orders ord1 = new Orders("person1", Items1);
            Orders ord2 = new Orders("person2",  Items2);

            ArrayList<Orders> customer1order = new ArrayList<>();
            customer1order.add(ord1);

            ArrayList<Orders> customer2order = new ArrayList<>();
            customer2order.add(ord2);

            Customer c1 = new Customer("person1", customer1order, 200);
            Customer c2 = new Customer("person2", customer2order, 120);

            i1.getItemDetails();
            c1.getBill(500.35);
        }
    }
