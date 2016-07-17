package com.example.hzg.spinner;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
    private List<String> list = new ArrayList<String>();
    private TextView textView;
    private Spinner spinner;
    private ArrayAdapter<String> arrAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        list.add("黄宗贵");
        list.add("宗贵");
        list.add("黄贵");
        list.add("黄宗");
        textView = (TextView) findViewById(R.id.textView);
        spinner = (Spinner) findViewById(R.id.spinner);
        arrAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, list);
        arrAdapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setAdapter(arrAdapter);
        spinner.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
//        String name = arrAdapter.getItem(position);
        String name = list.get(position);
        textView.setText("你选择的是：" + name);

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        textView.setText("NONE");
    }
}
