package ru.mirea.komaristaya.toastapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTxt);
    }

    public void btnClick (View view){
        int num = editText.getText().length();
        String vvod = "Комаристая А.С №13 Группа БСБО-01-20 Кол-во символов: " + num;
        Toast toast = Toast.makeText(getApplicationContext(), vvod, Toast.LENGTH_SHORT);
        toast.show();
    }
}