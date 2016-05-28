package com.raise.tools.http;

import com.alibaba.fastjson.JSON;
import com.zhy.http.okhttp.callback.Callback;

import okhttp3.Response;

/**
 * Created by raise.yang on 2016/05/28.
 */
public abstract class ObjCallback<T> extends Callback<T> {

    Class<T> m_clazz;

    public ObjCallback(Class<T> clazz) {
        m_clazz = clazz;
    }

    @Override
    public T parseNetworkResponse(Response response) throws Exception {
        return JSON.parseObject(response.body().string(), m_clazz);
    }
}
