package my_class;

import java.util.Arrays;


public class Menu {
    private String restaurant;
    private Dish[] menuList;

    /**
     * @param menuList the menuList to set
     */
    public void setMenuList(Dish[] menuList) {
        this.menuList = menuList;
    }

    /**
     * @param restaurant the restaurant to set
     */
    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    /**
     * @return the menuList
     */
    public Dish[] getMenuList() {
        return menuList;
    }

    /**
     * @return the restaurant
     */
    public String getRestaurant() {
        return restaurant;
    }

    Menu(String restaurant, Dish[] menuList) {
        this.restaurant = restaurant;
        this.menuList = menuList;
    }

    void sort(){
        Arrays.sort(menuList, (a,b)-> a.getType().compareTo(b.getType()));
       
    }
    void display(){
        for (Dish dish : menuList) {
            System.out.println(dish);
        }
    }
}