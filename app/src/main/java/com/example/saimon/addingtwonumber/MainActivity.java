package com.example.saimon.addingtwonumber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addition(View v)
    {
        int n1,n2,sum;
        EditText e1= (EditText)findViewById(R.id.editText);
        EditText e2= (EditText)findViewById(R.id.editText2);
        TextView out=(TextView)findViewById(R.id.textView);
        n1=Integer.parseInt(e1.getText().toString());
        n2=Integer.parseInt(e2.getText().toString());
        sum=n1+n2;
        out.setText("Sum is " + sum);


    }

    public void sub(View v)
    {
        int n1,n2,sum;
        EditText e1= (EditText)findViewById(R.id.editText);
        EditText e2= (EditText)findViewById(R.id.editText2);
        TextView out=(TextView)findViewById(R.id.textView);
        n1=Integer.parseInt(e1.getText().toString());
        n2=Integer.parseInt(e2.getText().toString());
        sum=n1-n2;
        out.setText("Sum is "+sum);


    }
    public void mul(View v)
    {
        int n1,n2,sum;
        EditText e1= (EditText)findViewById(R.id.editText);
        EditText e2= (EditText)findViewById(R.id.editText2);
        TextView out=(TextView)findViewById(R.id.textView);
        n1=Integer.parseInt(e1.getText().toString());
        n2=Integer.parseInt(e2.getText().toString());
        sum=n1*n2;
        out.setText("Sum is "+sum);


    }

    public void div(View v)
    {
        int n1,n2,sum;
        EditText e1= (EditText)findViewById(R.id.editText);
        EditText e2= (EditText)findViewById(R.id.editText2);
        TextView out=(TextView)findViewById(R.id.textView);
        n1=Integer.parseInt(e1.getText().toString());
        n2=Integer.parseInt(e2.getText().toString());
        sum=n1/n2;
        out.setText("Sum is "+sum);


    }

}
