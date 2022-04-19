package restaurantmenu;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private Date lastUpdate;
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    public Menu(Date lastUpdate) {
        this.lastUpdate = lastUpdate;

    }
    public ArrayList<MenuItem> getMenuItem(){
        return menuItems;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date aLastUpdate) {
        this.lastUpdate = aLastUpdate;
    }

    public void setMenuItem(ArrayList<MenuItem> aMenuItem) {
        this.menuItems = aMenuItem;
    }
}
