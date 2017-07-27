package com.example.a.lab3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivityList extends AppCompatActivity {
    ListView listV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_list);
        listV = (ListView) findViewById(R.id.list);
        final ArrayList<ClassListView> arrayList = new ArrayList<>();

        ClassListView a = new ClassListView("Tính Tổng");
        ClassListView b = new ClassListView("Giải Phương Trình Bậc 1");
        ClassListView c = new ClassListView("Giải Phương trình Bậc 2 ");
        ClassListView d = new ClassListView("Max & Min 3 Số");
        ClassListView e = new ClassListView(" Số Nguyên Tố Nằm Giữa Hai Số ");
        ClassListView f = new ClassListView("S = 1+2+3+….+n");
        ClassListView g = new ClassListView("Ước Chung & Bội Chung");
        arrayList.add(a);
        arrayList.add(b);
        arrayList.add(c);
        arrayList.add(d);
        arrayList.add(e);
        arrayList.add(f);
        arrayList.add(g);

        ArrayAdapter<ClassListView> arrayAdapter
                = new ArrayAdapter<ClassListView>(this, android.R.layout.simple_list_item_1, arrayList);
        listV.setAdapter(arrayAdapter);
        listV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                int index = i;
                if (i == 0) {//bai 1
                    ClassListView txt = arrayList.get(index);
                    Toast.makeText(MainActivityList.this, txt.getListviewText(),Toast.LENGTH_SHORT).show();
                }
                if (i == 1) {//bai 2
                    ClassListView txt = arrayList.get(index);
                    Toast.makeText(MainActivityList.this, txt.getListviewText(),Toast.LENGTH_SHORT).show();
                }
                if (i == 2) {//bai 3
                    ClassListView txt = arrayList.get(index);
                    Toast.makeText(MainActivityList.this, txt.getListviewText(),Toast.LENGTH_SHORT).show();
                }
                if (i == 3) {//bai 3
                    ClassListView txt = arrayList.get(index);
                    Toast.makeText(MainActivityList.this, txt.getListviewText(),Toast.LENGTH_SHORT).show();
                }
                if (i == 4) {
                    ClassListView txt = arrayList.get(index);
                    Toast.makeText(MainActivityList.this, txt.getListviewText(),Toast.LENGTH_SHORT).show();
                }
                if (i == 5) {
                    ClassListView txt = arrayList.get(index);
                    Toast.makeText(MainActivityList.this, txt.getListviewText(),Toast.LENGTH_SHORT).show();
                }
                if (i == 6) {
                    ClassListView txt = arrayList.get(index);
                    Toast.makeText(MainActivityList.this, txt.getListviewText(),Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
