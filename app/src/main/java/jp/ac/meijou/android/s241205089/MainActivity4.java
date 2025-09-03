package jp.ac.meijou.android.s241205089;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import jp.ac.meijou.android.s241205089.databinding.ActivityMain2Binding;
import jp.ac.meijou.android.s241205089.databinding.ActivityMain3Binding;
import jp.ac.meijou.android.s241205089.databinding.ActivityMain4Binding;

public class MainActivity4 extends AppCompatActivity {
    private ActivityMain4Binding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMain4Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //setContentView(R.layout.activity_main4);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //mainActivity2からのデータ転送
        var editText = getIntent().getStringExtra("title");
        binding.textView5.setText(editText);

        //ok
        binding.button21.setOnClickListener(view -> {
            var intent = new Intent();
            intent.putExtra("ret","OK");
            setResult(RESULT_OK,intent);
            finish();
        });
        //cancel
        binding.button22.setOnClickListener(view -> {
            var intent = new Intent();
            setResult(RESULT_CANCELED);
            finish();
        });
    }
}