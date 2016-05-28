package com.raise.tools.http;

import com.alibaba.fastjson.JSON;
import com.zhy.http.okhttp.callback.Callback;

import java.util.List;

import okhttp3.Response;

/**
 * Created by raise.yang on 2016/05/28.
 */
public abstract class ListCallback<T> extends Callback<List<T>> {
    Class<T> m_clazz;

    public ListCallback(Class<T> clazz) {
        m_clazz = clazz;
    }

    @Override
    public List<T> parseNetworkResponse(Response response) throws Exception {
        return JSON.parseArray(response.body().string(),m_clazz);
    }

    @Override
    public void onResponse(List<T> response) {

    }
}
