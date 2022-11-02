package br.ulbra.calculadora;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.io.FileNotFoundException;

public class MainActivity extends AppCompatActivity {
    EditText valor1, valor2;
    Button somar, subtrair, multiplicar, dividir;

    public void message(String titulo, String mensagem, String botao) {

        AlertDialog.Builder dialogo = new AlertDialog.Builder(MainActivity.this);
        dialogo.setTitle(titulo);
        dialogo.setMessage(mensagem);
        dialogo.setNeutralButton(botao, null);
        dialogo.show();
    }

    public String calcular(int op, double valor1, double valor2) {
        double res = 0;
        String resposta;
        if (op == 1) {
            res = valor1 + valor2;
            resposta = "O resulado da soma =" + res;
        } else if (op == 2) {
            res = valor1 - valor2;
            resposta = "O resulado da subtração =" + res;
        } else if (op == 3) {
            res = valor1 * valor2;
            resposta = "O resulado da multiplicação =" + res;
        } else {
    try{
        res = valor1 / valor2;
        resposta = "O resulado da divisão =" + res;
    }catch (ArithmeticException e){
        resposta = "nao pode zero";

    }

        }
       return resposta;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1 = findViewById(R.id.edtValor1);
        valor2 = findViewById(R.id.edtValor2);
        somar = findViewById(R.id.btnSomar);
        subtrair = findViewById(R.id.btnSubtrair);
        multiplicar = findViewById(R.id.btnMultiplicar);
        dividir = findViewById(R.id.btnDividir);


        somar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
      if(valor1.getText().toString().equals(null) ||valor2.getText().toString().equals(null)){
          message ("Resultado da calculadora", "sem campos" , "ok");
}else{
    double valorr1, valorr2;
          valorr1 = Double.parseDouble(valor1.getText().toString());
          valorr2 = Double.parseDouble(valor2.getText().toString());
          message("A soma é ",calcular(1, valorr1, valorr2), "ok");
}
            }
        });
        subtrair.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             if(valor1.getText().toString().equals(null) ||valor2.getText().toString().equals(null)){
                 message ("Resultado da calculadora", "sem campos" , "ok");
             }else{
                 double valorr1, valorr2;
                 valorr1 = Double.parseDouble(valor1.getText().toString());
                 valorr2 = Double.parseDouble(valor2.getText().toString());
                 message("A subtrasão é ",calcular(2, valorr1, valorr2), "ok");
             }
         }
     });
        multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(valor1.getText().toString().equals(null) ||valor2.getText().toString().equals(null)){
                    message ("Resultado da calculadora", "sem campos" , "ok");
                }else{
                    double valorr1, valorr2;
                    valorr1 = Double.parseDouble(valor1.getText().toString());
                    valorr2 = Double.parseDouble(valor2.getText().toString());
                    message("A subtrasão é ",calcular(3, valorr1, valorr2), "ok");
                }
            }
        });

        dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(valor1.getText().toString().equals(null) ||valor2.getText().toString().equals(null)){
                    message ("Resultado da calculadora", "sem campos" , "ok");
                }else{
                    double valorr1, valorr2;
                    valorr1 = Double.parseDouble(valor1.getText().toString());
                    valorr2 = Double.parseDouble(valor2.getText().toString());
                    message("A subtrasão é ",calcular(4, valorr1, valorr2), "ok");
                }
            }
        });



    }
}