package com.example.appexo01helloalejandro;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {


    private EditText txt;
    private TextView lbl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        this.txt = (EditText)findViewById(R.id.txtMsg);
        this.lbl = (TextView)findViewById(R.id.lblMsg);


    }

    public void changeMsg(View view) {
        String msgTXT = this.txt.getText().toString();
        this.lbl.setText(msgTXT);
    }
}