package ck.itheima.com.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.OrientationHelper;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRv;
    private List<String> mDataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initData();
        initView();
    }

    private void initData() {
        mDataList = new ArrayList<>();
        for (int i = 0; i < 40; i++) {
            mDataList.add("第" + i + "条目");

        }
    }

    private void initView() {
        mRv = (RecyclerView) findViewById(R.id.rc_main);

        mRv.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(OrientationHelper.HORIZONTAL);
        mRv.setLayoutManager(layoutManager);

        mRv.setAdapter(new MyAdapter(this,mDataList));
    }
}
