package yaros.com.roleplaygame.staticClasses;

import android.content.res.Resources;

public class Item {

    private final String name;

    private final Resources icon;

    private final int price;

    public Item(String name, Resources icon, int price){
        this.name = name;
        this.icon = icon;
        this.price = price;
    }

    public Resources getIcon(){
        return icon;
    }

}
