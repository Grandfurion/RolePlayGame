package yaros.com.roleplaygame.staticClasses;

import android.content.res.Resources;

public class Weapon extends Item {

    private final int damage;

    public Weapon(String name, Resources icon, int price, int damage){
        super(name, icon, price);
        this.damage = damage;
    }

}
