package yaros.com.roleplaygame;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import yaros.com.roleplaygame.staticClasses.ConstantWeapons;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ConstantWeapons weaponsCreater = new ConstantWeapons();
         Drawable icon = getResources().getDrawable(R.drawable.sword_colored);

        setContentView(R.layout.activity_main);
        if(savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.container, new FragmentMainMenu(), FragmentMainMenu.TAG)
                    .commit();
        }

    }
}
