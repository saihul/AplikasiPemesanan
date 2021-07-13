package com.example.aplikasipemesanan.model;


import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "menu_spanduk")
public class DataHistoryModel {

    @PrimaryKey(autoGenerate = true) private int id;
    @ColumnInfo(name ="panjang") private int tvPanjang;
    @ColumnInfo(name ="lebar") private int tvLebar;
    @ColumnInfo(name ="quantity") private int tvQuantity;

    public DataHistoryModel(int tvPanjang, int tvLebar, int tvQuantity) {
        this.tvPanjang = tvPanjang;
        this.tvLebar = tvLebar;
        this.tvQuantity = tvQuantity;
    }

    public int getTvPanjang() {
        return tvPanjang;
    }

    public void setTvPanjang(int tvPanjang) {
        this.tvPanjang = tvPanjang;
    }

    public int getTvLebar() {
        return tvLebar;
    }

    public void setTvLebar(int tvLebar) {
        this.tvLebar = tvLebar;
    }

    public int getTvQuantity() {
        return tvQuantity;
    }

    public void setTvQuantity(int tvQuantity) {
        this.tvQuantity = tvQuantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
