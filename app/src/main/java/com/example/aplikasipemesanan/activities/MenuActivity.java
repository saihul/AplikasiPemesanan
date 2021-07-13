package com.example.aplikasipemesanan.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import com.example.aplikasipemesanan.MainActivity;
import com.example.aplikasipemesanan.R;
import com.example.aplikasipemesanan.model.DataHistoryModel;
import com.example.aplikasipemesanan.model.DataHistoryViewModel;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        if (getSupportActionBar() !=null) {
            getSupportActionBar().setTitle("Menu Spanduk");
        }

        EditText edtPanjang = findViewById(R.id.edtPanjang);
        EditText edtLebar = findViewById(R.id.edtLebar);
        EditText edtQuantity = findViewById(R.id.edtQuantity);

        final Button btnKirim = findViewById(R.id.btnKirim);
        btnKirim.setOnClickListener(view -> {
            DataHistoryModel dataHistoryModel;

            String panjang = edtPanjang.getText().toString().trim();
            String lebar = edtLebar.getText().toString().trim();
            String quantity = edtQuantity.getText().toString().trim();

            DataHistoryViewModel dataHistoryViewModel = new ViewModelProvider(this).get(DataHistoryViewModel.class);

            dataHistoryModel = new DataHistoryModel(Integer.parseInt(panjang), Integer.parseInt(lebar), Integer.parseInt(quantity));

            Toast.makeText(this,"Data Telah Terkirim", Toast.LENGTH_SHORT).show();
            dataHistoryViewModel.insert(dataHistoryModel);
            startActivity(new Intent(this, MainActivity.class));
            finish();
        });

    }
}
