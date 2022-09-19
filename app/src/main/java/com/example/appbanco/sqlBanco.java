package com.example.appbanco;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class sqlBanco extends SQLiteOpenHelper {
    //definición de las tablas de la BD
    String tblcustomer = "CREATE TABLE customer(email text primary key, name text, password text, rol text)";
    String tblaccount = "CREATE TABLE account(accountnumber int primary key autoincrement, email txt, date txt, balance int)";
    String tbltranstype = "CREATE TABLE transtype(idtranstype text primary key, description text)";
    String tbltransactionc = "CREATE TABLE transactionc(accountnumber int, idtranstype txt, datetrans text, amount int)";
    public sqlBanco(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    //Generar las instrucciones para crear las tablas
        db.execSQL(tblcustomer);
        db.execSQL(tblaccount);
        db.execSQL(tbltranstype);
        db.execSQL(tbltransactionc);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE customer");
        db.execSQL(tblcustomer);
        db.execSQL("DROP TABLE account");
        db.execSQL(tblaccount);
        db.execSQL("DROP TABLE transactionc");
        db.execSQL(tbltransactionc);
        db.execSQL("DROP TABLE transtype");
        db.execSQL(tbltranstype);
    }
}
