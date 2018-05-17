package com.neo.landtwo.emas;

import android.widget.Toast;

import com.taobao.weex.annotation.JSMethod;
import com.taobao.weex.bridge.JSCallback;
import com.taobao.weex.common.WXModule;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/4/25.
 */

public class MyModule extends WXModule {

    @JSMethod(uiThread = true)
    public void printLog(String msg) {
        Toast.makeText(mWXSDKInstance.getContext(),msg,Toast.LENGTH_SHORT).show();
    }

    @JSMethod(uiThread = true)
    public void showParams2(String msg,JSCallback callback) {
        Toast.makeText(mWXSDKInstance.getContext(),msg,Toast.LENGTH_SHORT).show();

        Map<String, String> map = new HashMap();
        map.put("code","200");
        map.put("msg","回调成功");
        callback.invoke(map);
    }



    //20180509新增三个交互方法
    @JSMethod(uiThread = true)
    public void openScan(String msg) {
        Toast.makeText(mWXSDKInstance.getContext(),msg,Toast.LENGTH_SHORT).show();
    }

    @JSMethod(uiThread = true)
    public void getContacts(String msg,JSCallback callback) {
        Toast.makeText(mWXSDKInstance.getContext(),msg,Toast.LENGTH_SHORT).show();
    }

    @JSMethod(uiThread = true)
    public void gotoLogin(String msg,JSCallback callback) {
        Toast.makeText(mWXSDKInstance.getContext(),msg,Toast.LENGTH_SHORT).show();

        Map<String, String> map = new HashMap();
        map.put("code","200");
        map.put("msg","回调成功");
        callback.invoke(map);
    }

}
