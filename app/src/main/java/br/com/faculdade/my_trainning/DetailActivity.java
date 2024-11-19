import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import br.com.faculdade.my_trainning.R;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView itemNameTextView = findViewById(R.id.item_text);
        TextView itemDescriptionTextView = findViewById(R.id.item_image);

        // Obtém os dados do Intent
        String itemName = getIntent().getStringExtra("itemName");
        String itemDescription = getIntent().getStringExtra("itemDescription");

        // Configura os textos na tela
        itemNameTextView.setText(itemName);
        itemDescriptionTextView.setText(itemDescription);
    }
}
