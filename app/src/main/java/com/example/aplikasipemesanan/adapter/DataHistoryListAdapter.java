package com.example.aplikasipemesanan.adapter;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.aplikasipemesanan.R;
import com.example.aplikasipemesanan.activities.DataHistoryActivity;
import com.example.aplikasipemesanan.activities.MenuActivity;
import com.example.aplikasipemesanan.database.DataHistoryRoomDatabase;
import com.example.aplikasipemesanan.model.DataHistoryModel;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class DataHistoryListAdapter extends RecyclerView.Adapter<DataHistoryListAdapter.ViewHolder> {

    private DataHistoryRoomDatabase dataHistoryRoomDatabase;
    private List<DataHistoryModel>dataHistoryModelList = new ArrayList<>();


    @NonNull
    @NotNull
    @Override
    public DataHistoryListAdapter.ViewHolder onCreateViewHolder(@NonNull @NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_data_history,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull @NotNull DataHistoryListAdapter.ViewHolder holder, int position) {
        DataHistoryModel dataHistoryModel = dataHistoryModelList.get(position);

        holder.tvPanjang.setText(String.format("Panjang = %s", dataHistoryModel.getTvPanjang()));
        holder.tvLebar.setText(String.format("Lebar = %s", dataHistoryModel.getTvLebar()));
        holder.tvQuantity.setText(String.format("Quantity = %s", dataHistoryModel.getTvQuantity()));

    }

    @Override
    public int getItemCount() {
        return dataHistoryModelList.size();
    }

    public void setDataHistoryModelList(List<DataHistoryModel> dataHistoryModels) {
        this.dataHistoryModelList = dataHistoryModels;
        notifyDataSetChanged();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        
        private final TextView tvPanjang;
        private final TextView tvLebar;
        private final TextView tvQuantity;

        ImageButton btnDelete;
        
        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);

            tvPanjang = itemView.findViewById(R.id.tvPanjang);
            tvLebar = itemView.findViewById(R.id.tvLebar);
            tvQuantity = itemView.findViewById(R.id.tvQuantity);

        }

    }
}
