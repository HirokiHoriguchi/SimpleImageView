package com.example.imagevieweasysample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    private ImageView imageView;
    private Button button;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Inisialize();

        imageView.layout(0,0,imageView.getWidth(), imageView.getHeight());
        button.setOnClickListener(this);


    }

    private void Inisialize(){
        imageView = findViewById(R.id.image_view);
        button = findViewById(R.id.button);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                counter += 100;

                int left = counter/2;
                int top = counter;
                int right = counter/2 + imageView.getWidth();
                int bottom = counter + imageView.getHeight();

                imageView.layout(left, top, right, bottom);

                Log.d("下限", String.valueOf(bottom));

                if(bottom > 1763){
                    counter = 0;
                    imageView.layout(0,0,imageView.getWidth(), imageView.getHeight());
                }
        }
    }
}
