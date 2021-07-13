package com.example.aplikasipemesanan.model;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.aplikasipemesanan.database.DataHistoryRoomDatabase;
import com.example.aplikasipemesanan.repository.DataHistoryRepository;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class DataHistoryViewModel extends AndroidViewModel{

    private DataHistoryRepository repository;
    private LiveData<List<DataHistoryModel>> allDataHistory;


    public DataHistoryViewModel(@NonNull @NotNull Application application) {
        super(application);
        repository = new DataHistoryRepository(application);
        allDataHistory = repository.getAllDataHistory();

    }

    public void insert(DataHistoryModel dataHistoryModel) {
        repository.insert(dataHistoryModel);
    }

    public void update(DataHistoryModel dataHistoryModel){
        repository.update(dataHistoryModel);
    }
    public void delete (DataHistoryModel dataHistoryModel){
        repository.delete(dataHistoryModel);
    }
//    public void deleteAll() {
//        repository.deleteAll();
//    }

    public LiveData<List<DataHistoryModel>> getAllDataHistory(){
        return allDataHistory;
    }
}
