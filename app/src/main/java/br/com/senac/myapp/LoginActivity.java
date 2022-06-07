package br.com.senac.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    //declarar as variáveis globais
    EditText edtEmail,edtSenha;
    Button btnLogin;
    TextView txtRecuperarSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        //apresentando as variáveis xml no java
        edtEmail = findViewById(R.id.edtEmail);
        edtSenha = findViewById(R.id.edtSenha);
        btnLogin = findViewById(R.id.btnLogin);
        txtRecuperarSenha = findViewById(R.id.txtRecuperarSenha);

        //Criando o clique do botão
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Pegar os valores do email e da senha do usuário
                String email, senha;

                email = edtEmail.getText().toString();
                email = edtEmail.getText().toString();

                //criando a estrutura de decisão para acesso ao sistema
                if(true){
                    //entrar aqui..
                }
            }
        });

        txtRecuperarSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    public void abrirFacebook(View view) {
        Toast.makeText(getApplicationContext(),
                "Cliquei no botão do Facebook",
                Toast.LENGTH_SHORT).show();
    }
}