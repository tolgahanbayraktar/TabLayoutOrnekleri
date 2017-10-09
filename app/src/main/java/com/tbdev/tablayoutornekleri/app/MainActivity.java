package com.tbdev.tablayoutornekleri.app;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.tbdev.tablayoutornekleri.R;
import com.tbdev.tablayoutornekleri.tabs.TextTab;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnTextTab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Tablayout Örnek");

        btnTextTab = (Button) findViewById(R.id.btnTextTab);
        btnTextTab.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.btnTextTab:
                Intent intent = new Intent(this, TextTab.class);
                startActivity(intent);

                break;
        }
    }
}
