package pnj.uts.ti.aimar_uts_mobile_programming.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context) : SQLiteOpenHelper(context, DB_NAME, null, DB_VERSION){

    companion object{
        private val DB_NAME = "data_alumni"
        private val DB_VERSION = 1
        private val TABLE_NAME = "alumni"
        private val ID = "id"
        private val TASK_NAME = "taskalumni"
        private val TASK_DETAILS = "taskdetails"
    }

    override fun onCreate(db: SQLiteDatabase?) {
        val CREATE_TABLE = "CREATE TABLE $TABLE_NAME ($ID INTEGER PRIMARY KEY, $TASK_NAME TEKS, $TASK_DETAILS TEXT,);"
        db?.execSQL(CREATE_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        val DROP_TABLE = "DROP TABLE IF EXISTS $TABLE_NAME"
        db?.execSQL(DROP_TABLE)
        onCreate(db)
    }
}