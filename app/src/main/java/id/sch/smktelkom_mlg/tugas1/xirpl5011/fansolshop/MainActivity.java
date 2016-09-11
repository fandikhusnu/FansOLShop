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

    TextView tvPesan, tvData, tvNH, tvTH, tvPH, tvKH, tvAH, tvBH, tvLW;
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
        tvBH = (TextView) findViewById(R.id.textViewBH);
        tvLW = (TextView) findViewById(R.id.textViewLW);

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
        if (isValid()) {
            String nama = etNama.getText().toString();
            String telp = etTelp.getText().toString();
            String alamat = etAL.getText().toString();
            String barang1 = cb1.getText().toString();
            String barang2 = cb2.getText().toString();
            String barang3 = cb3.getText().toString();
            String barang4 = cb4.getText().toString();
            String lewat1 = rbREG.getText().toString();
            String lewat2 = rbYES.getText().toString();

            tvNH.setText("Nama : " + nama);
            tvTH.setText("Telepon : " + telp);
            tvAH.setText("Alamat : " + alamat);
            tvPH.setText("Provinsi Kiriman : " + spProv.getSelectedItem().toString());
            tvKH.setText("Kota Kiriman : " + spKota.getSelectedItem().toString());
            if (cb1.isSelected()) tvBH.setText("Barang Yang Dibeli : " + barang1);
            if (cb2.isSelected()) tvBH.setText("Barang Yang Dibeli : " + barang2);
            if (cb3.isSelected()) tvBH.setText("Barang Yang Dibeli : " + barang3);
            if (cb4.isSelected()) tvBH.setText("Barang Yang Dibeli : " + barang4);
            if (rbREG.isSelected()) tvLW.setText("Kirim Lewat : " + rbREG);
            if (rbYES.isSelected()) tvLW.setText("Kirim Lewat : " + rbYES);


            findViewById(R.id.textViewDP).setVisibility(View.VISIBLE);
            findViewById(R.id.textViewPB).setVisibility(View.VISIBLE);
        }
    }

    private boolean isValid() {
        String nama = etNama.getText().toString();
        String telp = etTelp.getText().toString();
        String alamat = etAL.getText().toString();
        boolean valid = true;
        if (nama.isEmpty()) {
            etNama.setError("Nama belum diisi");
        } else if (nama.length() < 3) {
            etNama.setError("Nama minimal 3 karakter");
        } else {
            etNama.setError(null);
        }

        if (telp.isEmpty()) {
            etTelp.setError("No telepon belum diisi");
        } else if (telp.length() <= 10 || telp.length() >= 12) {
            etTelp.setError("Format No telepon tidak valid(10-12 karakter)");
        } else {
            etTelp.setError(null);
        }

        if (alamat.isEmpty()) {
            etAL.setError("Alamat belum diisi");
        } else {
            etAL.setError(null);
        }

        if (cb1.isChecked()) {
            cb4.setError(null);
        } else if (cb2.isChecked()) {
            cb4.setError(null);
        } else if (cb3.isChecked()) {
            cb4.setError(null);
        } else if (cb4.isChecked()) {
            cb4.setError(null);
        } else {
            cb4.setError("Jasa Pengiriman");
        }

        if (rbREG.isChecked()) {
            rbYES.setError(null);
        } else if (rbYES.isChecked()) {
            rbYES.setError(null);
        } else {
            rbYES.setError("Jasa Pengiriman");
        }

        return valid;
    }
}
