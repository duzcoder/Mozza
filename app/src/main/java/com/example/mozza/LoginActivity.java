package com.example.mozza;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;
import android.widget.EditText;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button bouton1=(Button)findViewById(R.id.valider);
        EditText E1 = (EditText)findViewById(R.id.nom) ;
        EditText E2 = (EditText)findViewById(R.id.pwd) ;

        bouton1.setOnClickListener(new OnClickListener (){
            public void onClick(View view){
                String nome = E1.getText().toString().trim();
                String pwde = E2.getText().toString().trim();

                if ((nome.equals("guest")) && (pwde.equals("guest"))){
                    Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                    intent.putExtra("monNom", nome);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(LoginActivity.this, "Please check your password or username", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}