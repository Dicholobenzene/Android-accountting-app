package erben.accounting;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import static android.database.sqlite.SQLiteDatabase.openOrCreateDatabase;


/**
 * Created by hasee on 2017/8/27.
 */

public class DbManager {
    String dbName;
    String[] colName;
    SQLiteDatabase db;
    public DbManager(){
        try{SQLiteDatabase.openDatabase("data.db",null,SQLiteDatabase.OPEN_READWRITE);}
        catch (Exception e){
            getFilesDir();
            db =openOrCreateDatabase("data/data/Accounting/databases/data.db",null);
            db.execSQL("create table account(date DATE,usage VARCHAR,amount SMALLINT )");
        }
    }
}
