package com.example.aplikasipemesanan.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.aplikasipemesanan.R;
import com.example.aplikasipemesanan.activities.DataHistoryActivity;
import com.example.aplikasipemesanan.activities.DataPembayaranActivity;
import com.example.aplikasipemesanan.activities.DataPengeluaranActivity;
import com.example.aplikasipemesanan.activities.MenuActivity;

import org.jetbrains.annotations.NotNull;

public class DataFragment extends Fragment {

    public DataFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_data, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        Button btndataTransaksi = view.findViewById(R.id.btn_dataTransaksi);
        Button btnPengeluaran = view.findViewById(R.id.btn_dataPengeluaran);
        Button btnPembayaran = view.findViewById(R.id.btn_dataPembayaran);

        super.onViewCreated(view, savedInstanceState);

        btndataTransaksi.setOnClickListener(v -> {

            Intent intent = new Intent(requireContext(), DataHistoryActivity.class);
            v.getContext().startActivity(intent);
        });

        btnPengeluaran.setOnClickListener(v -> {

            Intent intent = new Intent(requireContext(), DataPengeluaranActivity.class);
            v.getContext().startActivity(intent);
        });

        btnPembayaran.setOnClickListener(v -> {

            Intent intent = new Intent(requireContext(), DataPembayaranActivity.class);
            v.getContext().startActivity(intent);
        });
    }
}