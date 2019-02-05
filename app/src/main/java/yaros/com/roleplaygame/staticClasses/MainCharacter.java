package yaros.com.roleplaygame.staticClasses;

import java.util.ArrayList;

public class MainCharacter extends Character {

    private static ArrayList<Item> inventory = new ArrayList<>(8);

     public static ArrayList getInventory(){
        return inventory;
    }


}
