package my_class;

import java.util.Scanner;

public class Root {

    static Dish[] dishs = new Dish[10];

    public static void main(final String[] args) {
        for (int i = 0; i < 10; i++) {
            
            final Scanner scanner = new Scanner(System.in); 
            final String name = scanner.nextLine(); 
            final String type = scanner.nextLine(); 
            final String description = scanner.nextLine(); 
            final float price = scanner.nextFloat();
            dishs[i] = new Dish(name, type, description, price);
        }
        for(Dish dish: dishs){
            if(dish.getType().toLowerCase().equals("Desserts".toLowerCase())){
                System.out.println(dish);
            }
        }
    }

}