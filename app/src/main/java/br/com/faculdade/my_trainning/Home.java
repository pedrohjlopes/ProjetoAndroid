package br.com.faculdade.my_trainning;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        // Lista de itens para exibir
        List<String> items = Arrays.asList("Peito e Triceps", "Costa", "Perna", "Ombro", "Aerobico");

        // Configuração do adaptador
        BoxAdapter adapter = new BoxAdapter(items, item ->
                Toast.makeText(Home.this, "Clicou em: " + item, Toast.LENGTH_SHORT).show()
        );

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
