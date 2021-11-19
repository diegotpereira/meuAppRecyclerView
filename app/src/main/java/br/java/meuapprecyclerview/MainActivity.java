package br.java.meuapprecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Filme> listaFilmes = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        this.criarFilmes();

        // Adapter
        Adapter adapter = new Adapter(listaFilmes);

        // LayoutManger
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        // Dataset
    }

    public void criarFilmes() {
        Filme filme = new Filme("O Homem Aranha", "genero", "ano");
        listaFilmes.add(filme);

        filme = new Filme("Capitão América","ação","2015");
        listaFilmes.add(filme);

        filme = new Filme("A Lenda","drama","2011");
        listaFilmes.add(filme);

        filme = new Filme("Lagoa Azul","drama","1990");
        listaFilmes.add(filme);
    }
}