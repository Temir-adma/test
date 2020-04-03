package com.example.anarbek.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    private static final String TAG = "Main2Activity";
    private EditText name;
    private EditText price;
    private Button addBtn;
    private int countEdTxList=0;
    private TextWatcher generalTextWatcher;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        setTitle(R.string.main_fragm_title);


        name=findViewById(R.id.name);
        price=findViewById(R.id.price);
        addBtn=findViewById(R.id.add);

        generalTextWatcher = new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence s, int start, int before,
                                      int count) {

            }

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count,
                                          int after) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if(!name.getText().toString().isEmpty() && !price.getText().toString().isEmpty())
                    addBtn.setEnabled(true);
                else if((name.getText().toString().isEmpty() || price.getText().toString().isEmpty()))
                    addBtn.setEnabled(false);

            }


        };
        name.addTextChangedListener(generalTextWatcher );
        price.addTextChangedListener(generalTextWatcher);

        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String itemName=name.getText().toString();
                String  itemPrice=price.getText().toString();

            }
        });
    }

}
