package com.example.aplikasipemesanan.database;


import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.example.aplikasipemesanan.dao.DataHistoryDao;
import com.example.aplikasipemesanan.model.DataHistoryModel;

import org.jetbrains.annotations.NotNull;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {DataHistoryModel.class}, version = 1)
public abstract class DataHistoryRoomDatabase extends RoomDatabase {

    public abstract DataHistoryDao dataHistoryDao();

    private static volatile DataHistoryRoomDatabase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    public static final ExecutorService databaseWriteExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREADS);

    public static synchronized DataHistoryRoomDatabase getDatabaseDataHistory(final Context context){
        if (INSTANCE == null) {
            INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                    DataHistoryRoomDatabase.class, "data_history_database")
                    .fallbackToDestructiveMigration()
                    .addCallback(callback)
                    .build();
        }
        return INSTANCE;
    }

    private static final RoomDatabase.Callback callback = new RoomDatabase.Callback(){
        @Override
        public void onCreate(@NonNull @NotNull SupportSQLiteDatabase db) {
            super.onCreate(db);
        }
    };

}
