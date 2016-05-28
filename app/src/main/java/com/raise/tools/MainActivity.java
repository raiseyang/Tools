package com.raise.tools;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.raise.tools.Entity.WxArticle;
import com.raise.tools.http.ListCallback;
import com.zhy.http.okhttp.OkHttpUtils;

import java.util.List;

import okhttp3.Call;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void test_http(final View view) {
        String url = "http://apis.baidu.com/txapi/weixin/wxhot";
        OkHttpUtils
                .get()
                .url(url)
                .addHeader("apikey", "fc652c435f5a28179bad3b895d9ce1dc")
                .addParams("word","科技")
                .addParams("num","10")
                .build()
                .execute(new ListCallback<WxArticle>(WxArticle.class) {
                    @Override
                    public void onError(Call call, Exception e) {

                    }

                    @Override
                    public void onResponse(List<WxArticle> response) {
                        for (WxArticle article :response){
                            Log.d("activity",article.toString());
                        }

                    }
                });

    }
}
