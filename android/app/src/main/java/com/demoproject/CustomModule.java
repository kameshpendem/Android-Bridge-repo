package com.demoproject;

import android.widget.Toast;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class CustomModule extends ReactContextBaseJavaModule {

    private static ReactApplicationContext reactContext;

     public CustomModule(ReactApplicationContext context){
         super(context);
         reactContext = context;
     }

    @NonNull
    @Override
    public String getName() {
        return "CustomModule";
    }

    @ReactMethod
    public void show(){
        Toast.makeText(reactContext, "Hi from android", Toast.LENGTH_SHORT).show();
    }

}
