package com.frostdev.sukamus.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.frostdev.sukamus.R;

public class FragmentTranslate extends Fragment {

    public FragmentTranslate(){

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_translate, container, false);
        WebView webView = (WebView)v.findViewById(R.id.translate);
        getActivity().setTitle(getResources().getString(R.string.translate));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://translate.google.co.id/");
        return v;
    }
}