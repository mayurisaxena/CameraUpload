package ci6222.cameraupload;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by HP on 10/11/2016.
 */

public class DBHelper extends SQLiteOpenHelper {

    public static final String dbName = "cameraUploadDB";
    public DBHelper(Context context){
        super(context,dbName,null,1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table imageSearch id integer primary key, file_path text, search text ");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
