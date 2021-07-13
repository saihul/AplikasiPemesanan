package com.example.aplikasipemesanan.repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.aplikasipemesanan.dao.DataHistoryDao;
import com.example.aplikasipemesanan.database.DataHistoryRoomDatabase;
import com.example.aplikasipemesanan.model.DataHistoryModel;

import java.util.List;

public class DataHistoryRepository {

    private final DataHistoryDao dataHistoryDao;
    private final LiveData<List<DataHistoryModel>> allDataHistory;

    public DataHistoryRepository(Application application){
        DataHistoryRoomDatabase db = DataHistoryRoomDatabase.getDatabaseDataHistory(application);
        dataHistoryDao = db.dataHistoryDao();
        allDataHistory = dataHistoryDao.getAllDataModel();
    }

    public void insert(DataHistoryModel dataHistoryModel){
        DataHistoryRoomDatabase.databaseWriteExecutor.execute(() -> dataHistoryDao.insert(dataHistoryModel));
    }

    public void delete(DataHistoryModel dataHistoryModel){
        DataHistoryRoomDatabase.databaseWriteExecutor.execute(() -> dataHistoryDao.delete(dataHistoryModel));
    }

    public void deleteAll(DataHistoryModel dataHistoryModel){
        DataHistoryRoomDatabase.databaseWriteExecutor.execute(dataHistoryDao::deleteAll);
    }

    public LiveData<List<DataHistoryModel>> getAllDataHistory(){
        return allDataHistory;
    }

    public void update(DataHistoryModel dataHistoryModel) {
        DataHistoryRoomDatabase.databaseWriteExecutor.execute(() -> dataHistoryDao.update(dataHistoryModel));
    }

}
