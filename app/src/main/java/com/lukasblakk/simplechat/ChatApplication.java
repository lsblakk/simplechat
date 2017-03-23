package com.lukasblakk.simplechat;

import android.app.Application;

import com.lukasblakk.simplechat.models.Message;
import com.parse.Parse;
import com.parse.ParseObject;
import com.parse.interceptors.ParseLogInterceptor;

/**
 * Created by lukas on 3/22/17.
 */

public class ChatApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        ParseObject.registerSubclass(Message.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
            .applicationId("93bd0b59a90d46b1999e484431b83f41")
                .addNetworkInterceptor(new ParseLogInterceptor())
                .server("https://simplechatclient.herokuapp.com/parse/").build());

    }
}
