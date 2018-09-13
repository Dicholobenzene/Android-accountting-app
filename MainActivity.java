package erben.accounting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> list = new ArrayList<String>();
    private TextView contents;
    private Spinner spinner;
    private ArrayAdapter<String> adapter;
    private DbManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        list.add("早饭");
        list.add("午饭");
        list.add("晚饭");
        list.add("饮料");
        list.add("零食");
        list.add("学习");
        list.add("游戏");
        list.add("？？");
        spinner = (Spinner) findViewById(R.id.spinner);
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,list);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        manager=new DbManager();
    }
}
