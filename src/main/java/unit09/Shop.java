package unit09;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        Set<Integer> numsNotTaken = new HashSet<>();
        Map<Integer, Sushi> display = new HashMap<>();

        Scanner sc = new Scanner(System.in);

        //create a new display
        for(int i = 0; i < 25; i++) {
            numsNotTaken.add(i);
            display.put(i, new Sushi(i));
        }

        //create sushi order
        Set<Integer> orderNums = new HashSet<>();
        System.out.println("Welcome to Shinji's Sushi Shop!");
        System.out.print("The cashier takes your order: ");
        String[] items = sc.nextLine().split(" ");

        System.out.println(items);
        for(String item : items) {
            int newItem = Integer.parseInt(item);
            if(newItem >= 0 && newItem < 25 && numsNotTaken.contains(newItem)) { //prevents buying double or invalid item
                orderNums.add(newItem);
                numsNotTaken.remove(newItem);
            } else {
                System.out.println("Invalid Item: " + item);
            }
        }
        sc.close();
        //System.out.println(orderNums); //test code
        System.out.println("The cashier prepares your order.");

        Order order = new Order(); //making the order
        for(int num : orderNums) {
            order.add(display.get(num));
        }

        System.out.println("That will be $" + order.getCost() + "."); //total cost
        System.out.println("Here is your order, please come again.");
        System.out.println("Back at your apartment, you take out your sushi and eat it ...");

        //print out individual sushi
        for(Sushi sushi : order.getOrder().values()) {
            System.out.println("Eating " + sushi + " ... yum!");
        }
    }
}
