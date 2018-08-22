package com.reizx.httputils;

import com.zhy.http.okhttp.OkHttpUtils;
import okhttp3.Response;
import org.junit.Test;

import java.io.IOException;

public class GetTest {
    @Test
    public void getTest() throws IOException {
        Response response = OkHttpUtils
                .get()
                .url("http://2018.ip138.com/ic.asp")
                .build()
                .execute();
        String result = new String(response.body().bytes(), "GB2312");
        System.out.println("the respon : "  + result);
    }
}
