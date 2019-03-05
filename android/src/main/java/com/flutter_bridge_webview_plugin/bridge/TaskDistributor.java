package com.flutter_bridge_webview_plugin.bridge;

import android.app.Activity;

import com.flutter_bridge_webview_plugin.view.WVJBWebView;

import org.json.JSONObject;


public class TaskDistributor {
    private Activity activity;
    BridgeForwarderImpl bridgeForwarder;
    JSONObject dataJSON;
    WVJBWebView.WVJBResponseCallback callbac;
    JSONObject responseJSON = new JSONObject();

    public TaskDistributor(Activity activity, BridgeForwarderImpl bridgeForwarder, JSONObject dataJSON, WVJBWebView.WVJBResponseCallback callback) {
        this.activity = activity;
        this.bridgeForwarder = bridgeForwarder;
        this.dataJSON = dataJSON;
        this.callbac = callback;
    }

    public void invokeTask() {
        try {
            String msg = dataJSON.getString("msg");
            switch (msg) {
                case "": {
                    break;
                }
            }
        } catch (Exception e) {

        }
    }
}
