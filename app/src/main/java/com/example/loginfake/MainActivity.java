package com.example.loginfake;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn1;
    private EditText txtUser, txtPass;
    TextView txtMostar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=findViewById(R.id.btnClick);
        txtUser=findViewById(R.id.txtUser);
        txtPass=findViewById(R.id.txtPass);
        txtMostar=findViewById(R.id.txtRespuesta);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtMostar.setText(txtUser.getText().toString());
            }
        });
        btn1.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                txtMostar.setText(txtPass.getText().toString());
                return false;
            }
        });
    }
}
