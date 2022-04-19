package restaurantmenu;

public class MenuItem {
    private String name;
    private String description;
    private double price;
    private String category;
    private boolean isNew;

    public MenuItem(String name, String description, double price, String category) {
        this.setName(name);
        this.description = description;
        this.price = price;
        this.category = category;

    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public double getPrice() {
        return this.price;
    }

    public String getCategory() {
        return this.category;
    }

    public void setName(String aName) {
        this.name = aName;
    }

    public void setDescription(String aDescription) {
        this.description = aDescription;
    }

    public void setPrice(double aPrice) {
        this.price = aPrice;
    }

    public void setCategory(String aCategory) {
        this.category = aCategory;
    }


}
