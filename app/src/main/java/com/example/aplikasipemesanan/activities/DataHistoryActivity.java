package com.example.aplikasipemesanan.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;

import com.example.aplikasipemesanan.R;
import com.example.aplikasipemesanan.adapter.DataHistoryListAdapter;
import com.example.aplikasipemesanan.model.DataHistoryViewModel;

public class DataHistoryActivity extends AppCompatActivity {

    private DataHistoryViewModel dataHistoryViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_history);

        RecyclerView rvDataHistory = findViewById(R.id.rv_Data_History);
        rvDataHistory.setLayoutManager(new LinearLayoutManager(this));
        rvDataHistory.setHasFixedSize(true);

        DataHistoryListAdapter adapter = new DataHistoryListAdapter();
        rvDataHistory.setAdapter(adapter);

        dataHistoryViewModel = new ViewModelProvider(this).get(DataHistoryViewModel.class);
        dataHistoryViewModel.getAllDataHistory().observe(this, adapter::setDataHistoryModelList);
    }
}