package br.com.philippesis.usespinnerlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Spinner;

import java.util.ArrayList;

import br.com.philippesis.spinnercustomlib.SpinnerCustomAdapter;
import br.com.philippesis.spinnercustomlib.SpinnerData;

public class MainActivity extends AppCompatActivity {

    private Spinner mspnMain;

    private SpinnerCustomAdapter mspnCustomAdapter;

    private ArrayList<SpinnerData> mDataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDataList = new ArrayList<>();
        mDataList.add(new SpinnerData(1, "Java", "Oracle Inc."));
        mDataList.add(new SpinnerData(2, "Kotlin", "JetBrains"));
        mDataList.add(new SpinnerData(3, "C++", "Communit"));
        mDataList.add(new SpinnerData(4, "Python", "Pyton Software Fundation"));

        mspnCustomAdapter = new SpinnerCustomAdapter(this, R.layout.spinner_custom_layout, mDataList);

        mspnMain = (Spinner) findViewById(R.id.idspnMain);

        mspnMain.setAdapter(mspnCustomAdapter);

    }
}
