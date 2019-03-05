package com.flutter_bridge_webview_plugin.bridge;

import android.app.Activity;
import android.util.Log;

import com.flutter_bridge_webview_plugin.ObservableWebView;

import org.json.JSONException;
import org.json.JSONObject;


public class BridgeForwarderImpl implements IBridgeForwarder {
    private Activity activity;

    public BridgeForwarderImpl(Activity activity) {
        this.activity = activity;
    }

    @Override
    public void receiveMessageFromJs(String dataFromJsString, ObservableWebView.WVJBResponseCallback<String> callback) {
        try {
            JSONObject paramsFromJsJSON = new JSONObject(dataFromJsString);
            Log.e("receiveMessageFromJs", dataFromJsString);
            new TaskDistributor(activity, this, paramsFromJsJSON, callback).invokeTask();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void sendMessageToJs(String dataFromNativeString, ObservableWebView.WVJBResponseCallback<String> callback) {
        Log.e("sendMessageToJs", dataFromNativeString);
        if (callback != null) {
            callback.onResult(dataFromNativeString);
        }
    }
}
