package com.example.aplikasipemesanan.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.aplikasipemesanan.R;
import com.example.aplikasipemesanan.activities.MenuActivity;

import org.jetbrains.annotations.NotNull;

public class MenuFragment extends Fragment {

       public MenuFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false);
    }

    @Override
    public void onViewCreated(@NonNull @NotNull View view, @Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {

           Button btnSpanduk = view.findViewById(R.id.btnSpanduk);

           super.onViewCreated(view, savedInstanceState);

           btnSpanduk.setOnClickListener(v -> {

               Intent intent = new Intent(requireContext(), MenuActivity.class);
               v.getContext().startActivity(intent);
           });
    }
}