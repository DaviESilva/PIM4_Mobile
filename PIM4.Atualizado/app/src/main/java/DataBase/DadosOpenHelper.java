package DataBase;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DadosOpenHelper extends SQLiteOpenHelper {
    public DadosOpenHelper(Context context) {
        super(context, "Dados", null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ScriptDLL.getCreateTableCliente());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
