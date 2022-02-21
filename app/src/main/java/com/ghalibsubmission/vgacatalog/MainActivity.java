package com.ghalibsubmission.vgacatalog;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvVGA;
    private ArrayList<VGA> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvVGA = findViewById(R.id.rv_vga);
        rvVGA.setHasFixedSize(true);

        list.addAll(VGAData.getListData());
        rvVGA.setLayoutManager(new LinearLayoutManager(this));
        VGAListAdapter vgaListAdapter = new VGAListAdapter(list);
        rvVGA.setAdapter(vgaListAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        getMenuInflater().inflate(R.menu.menu_about, menu);
        return true;
    }
    public void onProfileAction(MenuItem mi) {
        Intent about = new Intent(MainActivity.this, About.class);
        startActivity(about);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int a = item.getItemId();
        switch (a) {
            case R.id.action_list:
                rvVGA.setLayoutManager(new LinearLayoutManager(this));
                VGAListAdapter vgaListAdapter = new VGAListAdapter(list);
                rvVGA.setAdapter(vgaListAdapter);
                break;
            case R.id.action_cardView:
                rvVGA.setLayoutManager(new LinearLayoutManager(this));
                VGACardViewAdapter vgaCardViewAdapter = new VGACardViewAdapter(list);
                rvVGA.setAdapter(vgaCardViewAdapter);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
