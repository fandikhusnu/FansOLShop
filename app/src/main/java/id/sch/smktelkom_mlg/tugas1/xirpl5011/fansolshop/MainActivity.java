package id.sch.smktelkom_mlg.tugas1.xirpl5011.fansolshop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvPesan, tvData, tvNH, tvTH, tvPH, tvKH, tvAH;
    EditText etNama, etTelp, etAL;
    Spinner spProv, spKota;
    RadioButton rbH1, rbH2, rbH3, rbH4, rbP1, rbP2, rbP3, rbP4, rbREG, rbYES;
    CheckBox cb1, cb2, cb3, cb4;
    Button bOK;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
