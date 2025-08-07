package TeaStall;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<TeaOrder> orders = new ArrayList<>();

        while (true) {
            System.out.println("Enter the number to choose your choice");
            System.out.println("1. Add New Order\n2. Display All Orders\n3. Search Order by Customer Name\n4. Exit");
            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                TeaOrder order = new TeaOrder();

                System.out.println("Enter Order ID: ");
                int orderId = input.nextInt();
                order.setOrderId(orderId);
                input.nextLine();

                System.out.println("Enter Customer Name: ");
                String customerName = input.nextLine();
                order.setCustomerName(customerName);

                System.out.println("Enter Tea Type (Black/Green/Masala/Milk): ");
                String teaType = input.nextLine();
                order.setTeaType(teaType);

                System.out.println("Enter Quantity (in cups): ");
                int quantity = input.nextInt();
                order.setQuantity(quantity);
                input.nextLine();

                System.out.println("Enter Contact Email: ");
                String email = input.nextLine();
                order.setEmail(email);

                orders.add(order);

            } else if (choice == 2) {
                for (TeaOrder o : orders) {
                    System.out.println(o);
                }

            } else if (choice == 3) {
                System.out.println("Enter Customer Name to Search: ");
                String searchName = input.nextLine();
                boolean found = false;

                for (TeaOrder o : orders) {
                    if (o.getCustomerName().equalsIgnoreCase(searchName)) {
                        System.out.println(o);
                        found = true;
                        break;
                    }
                }

                if (!found) {
                    System.out.println("Customer not found.");
                }

            } else if (choice == 4) {
                System.out.println("Exited successfully.");
                System.exit(0);

            } else {
                System.out.println("Invalid Input. Please try again.");
            }
        }
    }
}