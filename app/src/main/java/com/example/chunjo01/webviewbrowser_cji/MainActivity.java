package com.example.chunjo01.webviewbrowser_cji;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private String postUrl;
    private Button button;
    private EditText editText;

//    private WebView webView;
//    private ProgressBar progressBar;
//    private float m_downX;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("");

//        postUrl = getString(R.string.home_url);
        button = (Button) findViewById(R.id.button);
        editText = (EditText) findViewById(R.id.editText);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = editText.getText().toString();
                if(url == null || url.equals("")) {
                    url = "m.naver.com"; //getString(R.string.home_url);
                }
                Intent intent = new Intent(MainActivity.this, BrowserActivity.class);
//                Intent intent = new Intent(getApplicationContext(), BrowserActivity.class);
                intent.putExtra("url",url);

//                view.getContext().startActivity(intent);
                startActivity(intent);
            }
        });
//        webView = (WebView) findViewById(R.id.webView);
//        progressBar = (ProgressBar) findViewById(R.id.progressBar);
    }




//    private void setupWebView() {
//
//        // webview settings
//        WebSettings settings = webView.getSettings();
//        settings.setAllowUniversalAccessFromFileURLs(true);
//        settings.setJavaScriptEnabled(true);
//        settings.setLoadWithOverviewMode(true);
//        settings.setUseWideViewPort(true);
//        settings.setSupportZoom(true);
//        settings.setBuiltInZoomControls(false);
//        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
//        settings.setCacheMode(WebSettings.LOAD_NO_CACHE);
//        settings.setAppCacheEnabled(false);
//        settings.setDomStorageEnabled(true);
//        webView.setScrollBarStyle(WebView.SCROLLBARS_OUTSIDE_OVERLAY);
//        webView.setScrollbarFadingEnabled(true);
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
//            webView.setLayerType(View.LAYER_TYPE_HARDWARE, null);
//        } else {
//            webView.setLayerType(View.LAYER_TYPE_SOFTWARE, null);
//        }
//
//        webView.setWebChromeClient(new MyWebChromeClient(this));
//        webView.setWebViewClient(new WebViewClient() {
//
//            @Override
//            public void onPageStarted(WebView view, String url, Bitmap favicon) {
//                super.onPageStarted(view, url, favicon);
//                progressBar.setVisibility(View.VISIBLE);
//                invalidateOptionsMenu();
//            }
//
//            @Override
//            public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
//                return super.shouldOverrideUrlLoading(view, request);
//            }
//
//            @Override
//            public void onPageFinished(WebView view, String url) {
//                super.onPageFinished(view, url);
//                progressBar.setVisibility(View.GONE);
//            }
//        });
//
//
//    }
//
//    private class MyWebChromeClient extends WebChromeClient {
//        Context context;
//
//        public MyWebChromeClient(Context context) {
//            super();
//            this.context = context;
//        }
//    }

//    public static void hideSoftKeyboard(Activity activity) {
//        InputMethodManager inputMethodManager =
//                (InputMethodManager) activity.getSystemService(
//                        Activity.INPUT_METHOD_SERVICE);
//        inputMethodManager.hideSoftInputFromWindow(
//                activity.getCurrentFocus().getWindowToken(), 0);
//    }
}
