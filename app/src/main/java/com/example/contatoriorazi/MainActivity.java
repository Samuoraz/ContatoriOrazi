package com.example.contatoriorazi;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    //Inizializzazione delle variabili/tasti

    Button bottone_Più_L, bottone_Meno_L, bottone_Reset_L;  //Bottoni Lavoro
    Button bottone_Più_S, bottone_Meno_S, bottone_Reset_S;  //Bottoni Sport
    Button bottone_Più_A, bottone_Meno_A, bottone_Reset_A;  //Bottoni AcquaBevuta
    int n_1 = 0, n_2 = 0, n_3 = 0;

    EditText number_L, number_S, number_A;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //Collegamento Bottoni con la grafica
        bottone_Più_L = findViewById(R.id.B_1L);
        bottone_Meno_L = findViewById(R.id.B_0L);
        bottone_Reset_L = findViewById(R.id.B_R_L);

        bottone_Più_S = findViewById(R.id.B_1S);
        bottone_Meno_S = findViewById(R.id.B_0S);
        bottone_Reset_S = findViewById(R.id.B_R_S);

        bottone_Più_A = findViewById(R.id.B_1A);
        bottone_Meno_A = findViewById(R.id.B_0A);
        bottone_Reset_A = findViewById(R.id.B_R_A);

        number_L = findViewById(R.id.etL);
        number_S = findViewById(R.id.etS);
        number_A = findViewById(R.id.etA);



        bottone_Più_L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_L.setText(Incrementa(1));
            }
        });

        bottone_Meno_L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_L.setText(Decrementa(1));
            }
        });

        bottone_Reset_L.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_L.setText(Resetta(1));
            }
        });

        bottone_Più_S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_L.setText(Incrementa(2));
            }
        });

        bottone_Meno_S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_L.setText(Decrementa(2));
            }
        });

        bottone_Reset_S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_L.setText(Resetta(2));
            }
        });

        bottone_Più_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_L.setText(Incrementa(3));
            }
        });

        bottone_Meno_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_L.setText(Decrementa(3));
            }
        });

        bottone_Reset_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                number_L.setText(Resetta(3));
            }
        });


    }

    public int Incrementa(int scelta){
        switch (scelta){
            case 1:
                return n_1++;
            case 2:
                return n_2++;
            case 3:
                return n_3++;
            default:
                return 0;
        }
    }

    public int Decrementa(int scelta){
        switch (scelta){
            case 1:
                if(n_1 == 0){
                    Toast.makeText(getApplicationContext(), "Errore: input non valido", Toast.LENGTH_SHORT).show();
                }else {
                    return n_1--;
                }
            case 2:
                if(n_2 == 0){
                    Toast.makeText(getApplicationContext(), "Errore: input non valido", Toast.LENGTH_SHORT).show();
                }else{
                    return n_2--;
                }
            case 3:
                if(n_3 == 0){
                    Toast.makeText(getApplicationContext(), "Errore: input non valido", Toast.LENGTH_SHORT).show();
                }else {
                    return n_3--;
                }
            default:
                return 0;
        }
    }


    public int Resetta(int scelta){
        switch (scelta){
            case 1:
                n_1 = 0;
                return n_1;
            case 2:
                n_2 = 0;
                return n_2;
            case 3:
                n_3 = 0;
                return n_3;
            default:
                return 0;
        }
    }









}