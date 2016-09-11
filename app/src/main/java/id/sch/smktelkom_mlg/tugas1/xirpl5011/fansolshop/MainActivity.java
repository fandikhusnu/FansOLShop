package id.sch.smktelkom_mlg.tugas1.xirpl5011.fansolshop;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    TextView tvPesan, tvData, tvNH, tvTH, tvPH, tvKH, tvAH;
    EditText etNama, etTelp, etAL;
    Spinner spProv, spKota;
    RadioButton rbREG, rbYES;
    CheckBox cb1, cb2, cb3, cb4;
    Button bOK;

    String[][] arKota = {{"JakBar", "JakSel", "JakUt", "JakTim", "JakPus"}, {"Bandung",
            "Cirebon", "Bekasi"}, {"Semarang", "Magelang", "Surakarta"}, {"Blitar",
            "Malang", "Surabaya", "Kediri", "Banyuwangi", "Tulungagung"}};
    ArrayList<String> listKota = new ArrayList<>();
    ArrayAdapter<String> adapter;

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

        rbREG = (RadioButton) findViewById(R.id.radioButtonREG);
        rbYES = (RadioButton) findViewById(R.id.radioButtonYES);

        cb1 = (CheckBox) findViewById(R.id.checkBox1);
        cb2 = (CheckBox) findViewById(R.id.checkBox2);
        cb3 = (CheckBox) findViewById(R.id.checkBox3);
        cb4 = (CheckBox) findViewById(R.id.checkBox4);

        bOK = (Button) findViewById(R.id.buttonOK);


        findViewById(R.id.textViewDP).setVisibility(View.GONE);
        findViewById(R.id.textViewPB).setVisibility(View.GONE);

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, listKota);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spKota.setAdapter(adapter);

        spProv.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {
                listKota.clear();
                listKota.addAll(Arrays.asList(arKota[pos]));
                adapter.notifyDataSetChanged();
                spKota.setSelection(0);
            }

            @Override

            public void onNothingSelected(AdapterView<?> adapterView) {

            }

        });

        findViewById(R.id.buttonOK).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doClick();
            }
        });
    }

    private void doClick() {
        String nama = etNama.getText().toString();
        String telp = etTelp.getText().toString();
        String alamat = etAL.getText().toString();

        tvNH.setText("Nama : " + nama);

    }
}
