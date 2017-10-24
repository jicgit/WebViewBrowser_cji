package com.example.chunjo01.webviewbrowser_cji;


/**
 * Created by chunjo01 on 2017-10-23.
 */

public class Utils {
    public void checkUrl(String url) {
        if(url != null && !url.startsWith("http")) {
            url = "http://" + url;
        }
    }

}
