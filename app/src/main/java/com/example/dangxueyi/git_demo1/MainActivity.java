package com.example.dangxueyi.git_demo1;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.bt_start)
    Button btStart;
    private Context mContext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        mContext=this;

    }

    @OnClick(R.id.bt_start)
    public void onClick() {

        Toast.makeText(mContext,"按钮点击",Toast.LENGTH_LONG).show();
    }
}
