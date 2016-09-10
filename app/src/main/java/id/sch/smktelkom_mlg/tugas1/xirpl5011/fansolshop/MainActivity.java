package id.sch.smktelkom_mlg.tugas1.xirpl5011.fansolshop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
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

        tvPesan = (TextView) findViewById(R.id.textViewPB);
        tvData = (TextView) findViewById(R.id.textViewDP);
        tvNH = (TextView) findViewById(R.id.textViewNH);
        tvTH = (TextView) findViewById(R.id.textViewTH);
        tvPH = (TextView) findViewById(R.id.textViewPH);
        tvKH = (TextView) findViewById(R.id.textViewKH);
        tvAH = (TextView) findViewById(R.id.textViewAH);

        etAL = (EditText) findViewById(R.id.editTextA);
        etNama = (EditText) findViewById(R.id.editTextN);
        etTelp = (EditText) findViewById(R.id.editTextT);
        spProv = (Spinner) findViewById(R.id.spinnerP);
        spKota = (Spinner) findViewById(R.id.spinnerK);

        rbH1 = (RadioButton) findViewById(R.id.radioButtonH1);
        rbH2 = (RadioButton) findViewById(R.id.radioButtonH2);
        rbH3 = (RadioButton) findViewById(R.id.radioButtonH3);
        rbH4 = (RadioButton) findViewById(R.id.radioButtonH4);
        rbP1 = (RadioButton) findViewById(R.id.radioButtonP1);
        rbP2 = (RadioButton) findViewById(R.id.radioButtonP2);
        rbP3 = (RadioButton) findViewById(R.id.radioButtonP3);
        rbP4 = (RadioButton) findViewById(R.id.radioButtonP4);
        rbREG = (RadioButton) findViewById(R.id.radioButtonREG);
        rbYES = (RadioButton) findViewById(R.id.radioButtonYES);

        cb1 = (CheckBox) findViewById(R.id.checkBox1);
        cb2 = (CheckBox) findViewById(R.id.checkBox2);
        cb3 = (CheckBox) findViewById(R.id.checkBox3);
        cb4 = (CheckBox) findViewById(R.id.checkBox4);

        bOK = (Button) findViewById(R.id.buttonOK);


        findViewById(R.id.textViewDP).setVisibility(View.GONE);
        findViewById(R.id.textViewPB).setVisibility(View.GONE);

        findViewById(R.id.buttonOK).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doClick();
            }
        });
    }

    private void doClick() {
        String nama = etNama.getText().toString();
        String telp = etNama.getText().toString();
        String alamat = etNama.getText().toString();
        String prov = etNama.getText().toString();
        String kota = etNama.getText().toString();

    }
}
