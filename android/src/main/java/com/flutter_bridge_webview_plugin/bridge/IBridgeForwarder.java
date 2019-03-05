package com.flutter_bridge_webview_plugin.bridge;


import com.flutter_bridge_webview_plugin.ObservableWebView;

public interface IBridgeForwarder {
    void receiveMessageFromJs(String dataFromJsString, ObservableWebView.WVJBResponseCallback<String> callback);

    void sendMessageToJs(String dataFromNativeString, ObservableWebView.WVJBResponseCallback<String> callback);
}
