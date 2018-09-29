package verov.rgbsliders;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

import static android.graphics.Color.colorSpace;
import static android.graphics.Color.rgb;

public class MainActivity extends AppCompatActivity {

    private TextView SzovegDoboz1;
    private TextView SzovegDoboz2;
    private TextView SzovegDoboz3;
    private SeekBar Csuszka_R;
    private SeekBar Csuszka_G;
    private SeekBar Csuszka_B;
    private TextView Szoveg;

    int red = 128;
    int green = 128;
    int blue = 128;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //*************
        //inicializálás
        //*************
        init();


        //*****************
        //csuszka-események
        //*****************
        Csuszka_R.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                red = i;
                getWindow().getDecorView().setBackgroundColor(rgb(red, green, blue));
                Szoveg.setTextColor(rgb(255-red, 255-green, 255-blue));
                SzovegDoboz1.setText("Vörös: " + i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        Csuszka_G.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                green = i;
                getWindow().getDecorView().setBackgroundColor(rgb(red, green, blue));
                Szoveg.setTextColor(rgb(255-red, 255-green, 255-blue));
                SzovegDoboz2.setText("Zöld: " + i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        Csuszka_B.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                blue = i;
                getWindow().getDecorView().setBackgroundColor(rgb(red, green, blue));
                Szoveg.setTextColor(rgb(255-red, 255-green, 255-blue));
                SzovegDoboz3.setText("Kék: " + i);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    private void init() {
     SzovegDoboz1 = (TextView) findViewById(R.id.SzovegDoboz1);
     SzovegDoboz2 = (TextView) findViewById(R.id.SzovegDoboz2);
     SzovegDoboz3 = (TextView) findViewById(R.id.SzovegDoboz3);
     Szoveg = (TextView) findViewById(R.id.Szoveg);
     Csuszka_R = (SeekBar) findViewById(R.id.Csuszka_R);
     Csuszka_G = (SeekBar) findViewById(R.id.Csuszka_G);
     Csuszka_B = (SeekBar) findViewById(R.id.Csuszka_B);
     getWindow().getDecorView().setBackgroundColor(rgb(red, green, blue));
     SzovegDoboz1.setBackgroundColor(rgb(192,192,192));
     SzovegDoboz2.setBackgroundColor(rgb(192,192,192));
     SzovegDoboz3.setBackgroundColor(rgb(192,192,192));
     SzovegDoboz1.setTextColor(rgb(255,100,100));
     SzovegDoboz2.setTextColor(rgb(100,255,100));
     SzovegDoboz3.setTextColor(rgb(100,100,255));
    }
}
