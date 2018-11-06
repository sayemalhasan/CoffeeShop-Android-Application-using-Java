package com.example.user.coffee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    int n;
    CheckBox cb1, cb2;
    TextView tv;
    Button button, button2, button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cb1 = (CheckBox) findViewById(R.id.checkBox);
        cb1.setOnClickListener(this);
        cb2 = (CheckBox) findViewById(R.id.checkBox2);
        cb1.setOnClickListener(this);
        tv = (TextView) findViewById(R.id.tv);
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(this);
        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(this);
        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        if (cb1.isChecked() == true || cb2.isChecked() == true)
            switch (v.getId()) {
                case R.id.button:

                    n++;
                    tv.setText(n + "");
                    break;
                case R.id.button2:
                    if (n <= 0)
                        Toast.makeText(this, "Order at least one coffee", Toast.LENGTH_SHORT).show();

                    else
                        n--;
                    tv.setText(n + "");
                    break;
                case R.id.button3:
//                    if (cb1.isChecked() == true)
//                        Toast.makeText(this, "Hot Coffee Total price= $" + n * 10, Toast.LENGTH_LONG).show();
//                    if (cb2.isChecked() == true)
//                        Toast.makeText(this, "Cold Coffee Total price= $" + n * 5, Toast.LENGTH_LONG).show();
                    order(n);
                    break;

            }
        else
            Toast.makeText(this, "Order at least one item", Toast.LENGTH_SHORT).show();

    }
    public void order(int n) {
        int x = 0, y = 0, total;
        if (cb1.isChecked()) {
            x = n * 10;
        }
        if (cb2.isChecked()) {
            y = n * 5;
        }

        total = x + y;

        Toast.makeText(this, "Your total bill is $" + total, Toast.LENGTH_LONG).show();
        }
}

