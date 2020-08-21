package com.example.primass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.primass.Fragments.ArcanosFragment;
import com.example.primass.Fragments.CompatibilidadeFragment;
import com.example.primass.Fragments.DescricaoFragment;
import com.example.primass.Fragments.HomeFragment;
import com.example.primass.Fragments.ResultadoFragment;
import com.example.primass.Fragments.TrianguloFragment;

public class MainActivity extends AppCompatActivity {

    private Button bt_Home, bt_Resultado, bt_Compatibilidade,
            bt_Triangulo, bt_Arcanos, bt_Descricao;
    private HomeFragment homeFragment;
    private ResultadoFragment resultadoFragment;
    private CompatibilidadeFragment compatibilidadeFragment;
    private TrianguloFragment trianguloFragment;
    private ArcanosFragment arcanosFragment;
    private DescricaoFragment descricaoFragment;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bt_Home = findViewById(R.id.bt_Home);
        bt_Resultado = findViewById(R.id.bt_Resultado);
        bt_Compatibilidade = findViewById(R.id.bt_Compatibilidade);
        bt_Triangulo = findViewById(R.id.bt_Triangulo);
        bt_Arcanos = findViewById(R.id.bt_Arcanos);
        bt_Descricao = findViewById(R.id.bt_Descricao);

        homeFragment = new HomeFragment();

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.viewPage, homeFragment);
        transaction.commit();

        bt_Resultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                resultadoFragment = new ResultadoFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.viewPage, resultadoFragment);
                transaction.commit();

            }
        });

        bt_Triangulo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                trianguloFragment = new TrianguloFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.viewPage, trianguloFragment);
                transaction.commit();

            }
        });

        bt_Compatibilidade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                compatibilidadeFragment = new CompatibilidadeFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.viewPage, compatibilidadeFragment);
                transaction.commit();

            }
        });

        bt_Arcanos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                arcanosFragment = new ArcanosFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.viewPage, arcanosFragment);
                transaction.commit();

            }
        });

        bt_Descricao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                descricaoFragment = new DescricaoFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.viewPage, descricaoFragment);
                transaction.commit();

            }
        });

        bt_Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                homeFragment = new HomeFragment();

                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.viewPage, homeFragment);
                transaction.commit();

            }
        });


    }


}

