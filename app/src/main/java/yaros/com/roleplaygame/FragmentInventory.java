package yaros.com.roleplaygame;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.Iterator;

import yaros.com.roleplaygame.staticClasses.Item;
import yaros.com.roleplaygame.staticClasses.MainCharacter;

public class FragmentInventory extends Fragment {

    public static final String TAG = "FragmentInventory";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_inventory, container, false);
    }

    @Override
    public void onResume() {
        ImageView inv1 = getView().findViewById(R.id.inventory_1);
        ImageView inv2 = getView().findViewById(R.id.inventory_2);
        ImageView inv3 = getView().findViewById(R.id.inventory_3);
        ImageView inv4 = getView().findViewById(R.id.inventory_4);
        ImageView inv5 = getView().findViewById(R.id.inventory_5);
        ImageView inv6 = getView().findViewById(R.id.inventory_6);
        ImageView inv7 = getView().findViewById(R.id.inventory_7);
        ImageView inv8 = getView().findViewById(R.id.inventory_8);

        super.onResume();
        Iterator<Item> it = MainCharacter.getInventory().iterator(); //add Iterator
        int i = 1;
        while(it.hasNext()){
            Item item = it.next();
            if(!item.equals(null)){
                switch (i){
                    case 1:
                        inv1.setImageIcon();
                }
            }
        }
    }
}
