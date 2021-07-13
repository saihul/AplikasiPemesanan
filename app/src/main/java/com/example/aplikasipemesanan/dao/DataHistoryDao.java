package com.example.aplikasipemesanan.dao;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.aplikasipemesanan.model.DataHistoryModel;

import java.util.List;

@Dao
public interface DataHistoryDao {

    @Insert
    void insert(DataHistoryModel dataHistoryModel);

    @Query("SELECT * FROM menu_spanduk ORDER BY quantity ASC")
    LiveData<List<DataHistoryModel>> getAllDataModel();

    @Update
    void update(DataHistoryModel dataHistoryModel);

    @Delete
    void delete(DataHistoryModel dataHistoryModel);

    @Query("DELETE FROM menu_spanduk")
    void deleteAll();

}
