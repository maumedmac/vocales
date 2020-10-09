package bo.edu.instecmqsc.vocales;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView av = findViewById(R.id.a);
        av.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vocala =new Intent(MainActivity.this,vocales.class);
                vocala.putExtra("valor",0);
                startActivity(vocala);
            }
        });

        ImageView ev = findViewById(R.id.e);
        ev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vocale =new Intent(MainActivity.this,vocales.class);
                vocale.putExtra("valor",1);
                startActivity(vocale);
            }
        });

        ImageView iv = findViewById(R.id.i);
        iv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vocali =new Intent(MainActivity.this,vocales.class);
                vocali.putExtra("valor",2);
                startActivity(vocali);
            }
        });


        ImageView ov = findViewById(R.id.o);
        ov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vocalo =new Intent(MainActivity.this,vocales.class);
                vocalo.putExtra("valor",3);
                startActivity(vocalo);
            }
        });


        ImageView uv = findViewById(R.id.u);
        uv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent vocalu =new Intent(MainActivity.this,vocales.class);
                vocalu.putExtra("valor",4);
                startActivity(vocalu);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.game_menu, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle item selection
        switch (item.getItemId()) {
            case R.id.about:
                Toast.makeText(this,"HECHO POR MAURICIO\nMEDRANO MACHICADO\nPARA PDM-205 ITMQSC",Toast.LENGTH_LONG).show();
                return true;
            case R.id.exit:
                System.exit(0);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }



}