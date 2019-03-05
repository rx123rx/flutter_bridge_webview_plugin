#import <Flutter/Flutter.h>
#import <WebKit/WebKit.h>
#import "WKWebViewJavascriptBridge.h"

static FlutterMethodChannel *channel;

@interface FlutterBridgeWebViewPlugin : NSObject<FlutterPlugin>
@property (nonatomic, retain) UIViewController *viewController;
@property (nonatomic, retain) WKWebView *webView;
@property (nonatomic, retain) WKWebViewJavascriptBridge *bridge;

@end
