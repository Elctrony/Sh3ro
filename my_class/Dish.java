/**
 * hello
 */
package my_class;

public class Dish {
    private String name;
    private String type;
    private String description;
    private float price;

    Dish(String name, String type, String description, float price) {
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    
    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }


    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + ", Type: " + this.type + ", Description: " + this.description + ", Price "
                + this.price;
    }


}