package pillminder.example.com.menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button contextmenubtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contextmenubtn=findViewById(R.id.ctm);
        registerForContextMenu(contextmenubtn);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.option,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        Toast.makeText(this, "Selected Item", Toast.LENGTH_SHORT).show();
        switch(item.getItemId()){
            case R.id.i1: //code
                return true;
            case R.id.i2: //code
                return true;
            case R.id.i3: //code
                return true;
            case R.id.i4: //code
                return true;
            case R.id.i5: //code
                return true;
            case R.id.i6: //code
                return true;
            case R.id.i7: //code
                return true;
            default: return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        menu.setHeaderTitle("Context Menu");
        menu.add(0,v.getId(),0,"Upload");
        menu.add(0,v.getId(),0,"Search");
        menu.add(0,v.getId(),0,"Bookmark");
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        Toast.makeText(this,"Selected Item:"+item.getTitle(),Toast.LENGTH_LONG).show();
        return true;
    }
}
