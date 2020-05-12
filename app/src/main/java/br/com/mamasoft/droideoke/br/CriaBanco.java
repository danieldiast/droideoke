package br.com.mamasoft.droideoke.br;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by daniel on 30/12/2017.
 */


public class CriaBanco extends SQLiteOpenHelper {

    private static final String NOME_BANCO = "droidoke.db";
    private static final String TABELA = "musicas";
    private static final String COD = "cod";
    private static final String CANTOR = "cantor";
    private static final String TITULO = "titulo";
    private static final String LETRA = "letra";
    private static final String P = "p";
    private static final int VERSAO = 1;

    public CriaBanco(Context context){
        super(context, NOME_BANCO,null,VERSAO);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE "+TABELA+" ("
                + COD + " integer primary key autoincrement,"
                + CANTOR + " text,"
                + TITULO + " text,"
                + LETRA + " text,"
                + P + " text"
                +")";
        db.execSQL(sql);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABELA);
        onCreate(db);
    }
}