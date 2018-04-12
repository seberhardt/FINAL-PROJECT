package com.example.leoconnelly.connexus;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;

/**
 * Created by leoconnelly on 4/10/18.
 */

public class HealthCenterSelectedActivity extends AppCompatActivity {

    private WebView mWebView;
    public static final String KEY_URL = "key_url";
    public static final String KEY_TITLE = "key_title";
    Context mContext;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.find_care_selected);

        //if else statement

        //        String title = this.getIntent().getExtras().getString("title");

    String nameOfCenterFromIntent = this.getIntent().getExtras().getString("nameOfCenter");
        System.out.println(nameOfCenterFromIntent + "beep beep beep beep BEEP BEEP BEEP BEEP BEEP BEEP BEEP BEEP BEEP BEEPBEEP BEEP BEEP BEEPBEEP BEEP BEEP BEEPBEEP BEEP BEEP BEEPBEEP BEEP BEEP BEEP");

        // if

        Button addressButton = findViewById(R.id.Address);
        Button GetDirections = findViewById(R.id.GetDirections);
        Button call = findViewById(R.id.Call); //done
        Button visitWebsite = findViewById(R.id.VisitWebsite); //done
        Button moreInfo = findViewById(R.id.MoreInfo);


        //for more info, assign an int for each one.
        //Create the int in the onclick
        //if statments checking the value of the int ad

        mContext = this;

        if (nameOfCenterFromIntent.equalsIgnoreCase("Bowdoin Health Center")) {
                System.out.println("TEST TEST TEST TEST TEST ");

            call.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    Intent callNum = new Intent(Intent.ACTION_DIAL);
                    callNum.setData(Uri.parse("tel:0123456789"));
                    startActivity(callNum);
                    // mWebView = findViewById(R.id.detail_web_view);
                    //mWebView.loadUrl("www.youtube.com");

                }
            });

                //call


            //visit website
            //detail_web_view

            visitWebsite.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    Uri uri = Uri.parse("https://www.youtube.com");
                    Intent VisitWebsite = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(VisitWebsite);
                    // mWebView = findViewById(R.id.detail_web_view);
                    //mWebView.loadUrl("www.youtube.com");

                }
            });


            moreInfo.setOnClickListener(new View.OnClickListener() {
                public void onClick (View v) {
                    int index = 0;

                    Intent openMoreInfo0 = new Intent (mContext, MoreInfoActivity.class);
                    openMoreInfo0.putExtra("index", index);
                    startActivity(openMoreInfo0);
                }
            });


        }
        else if (nameOfCenterFromIntent.equalsIgnoreCase("Dimock Center")) {

            call.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    Intent callNum = new Intent(Intent.ACTION_DIAL);
                    callNum.setData(Uri.parse("tel:0123456789"));
                    startActivity(callNum);
                    // mWebView = findViewById(R.id.detail_web_view);
                    //mWebView.loadUrl("www.youtube.com");

                }
            });

            visitWebsite.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    Uri uri = Uri.parse("https://www.youtube.com");
                    Intent VisitWebsite = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(VisitWebsite);
                    // mWebView = findViewById(R.id.detail_web_view);
                    //mWebView.loadUrl("www.youtube.com");

                }
            });

            moreInfo.setOnClickListener(new View.OnClickListener() {
                public void onClick (View v) {
                    int index = 1;

                    Intent openMoreInfo0 = new Intent (mContext, MoreInfoActivity.class);
                    openMoreInfo0.putExtra("index", 1);
                    startActivity(openMoreInfo0);
                }
            });

        }
        else if (nameOfCenterFromIntent.equalsIgnoreCase("BETH ISRAEL DEACONESS MEDICAL CENTER")) {


            call.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    Intent callNum = new Intent(Intent.ACTION_DIAL);
                    callNum.setData(Uri.parse("tel:0123456789"));
                    startActivity(callNum);
                    // mWebView = findViewById(R.id.detail_web_view);
                    //mWebView.loadUrl("www.youtube.com");

                }
            });

            visitWebsite.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    Uri uri = Uri.parse("https://www.youtube.com");
                    Intent VisitWebsite = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(VisitWebsite);
                    // mWebView = findViewById(R.id.detail_web_view);
                    //mWebView.loadUrl("www.youtube.com");

                }
            });

            moreInfo.setOnClickListener(new View.OnClickListener() {
                public void onClick (View v) {
                    int index = 2;

                    Intent openMoreInfo0 = new Intent (mContext, MoreInfoActivity.class);
                    openMoreInfo0.putExtra("index", index);
                    startActivity(openMoreInfo0);
                }
            });

        }
        else if (nameOfCenterFromIntent.equalsIgnoreCase("BETH ISRAEL CHELSEA")) {

            call.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    Intent callNum = new Intent(Intent.ACTION_DIAL);
                    callNum.setData(Uri.parse("tel:0123456789"));
                    startActivity(callNum);
                    // mWebView = findViewById(R.id.detail_web_view);
                    //mWebView.loadUrl("www.youtube.com");

                }
            });

            visitWebsite.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    Uri uri = Uri.parse("https://www.youtube.com");
                    Intent VisitWebsite = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(VisitWebsite);
                    // mWebView = findViewById(R.id.detail_web_view);
                    //mWebView.loadUrl("www.youtube.com");

                }
            });

            moreInfo.setOnClickListener(new View.OnClickListener() {
                public void onClick (View v) {
                    int index = 3;

                    Intent openMoreInfo0 = new Intent (mContext, MoreInfoActivity.class);
                    openMoreInfo0.putExtra("index", index);
                    startActivity(openMoreInfo0);
                }
            });

        }
        else if (nameOfCenterFromIntent.equalsIgnoreCase("Fenway Health")) {

            call.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    Intent callNum = new Intent(Intent.ACTION_DIAL);
                    callNum.setData(Uri.parse("tel:0123456789"));
                    startActivity(callNum);
                    // mWebView = findViewById(R.id.detail_web_view);
                    //mWebView.loadUrl("www.youtube.com");

                }
            });

            visitWebsite.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    Uri uri = Uri.parse("https://www.youtube.com");
                    Intent VisitWebsite = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(VisitWebsite);
                    // mWebView = findViewById(R.id.detail_web_view);
                    //mWebView.loadUrl("www.youtube.com");

                }
            });

            moreInfo.setOnClickListener(new View.OnClickListener() {
                public void onClick (View v) {
                    int index = 4;

                    Intent openMoreInfo0 = new Intent (mContext, MoreInfoActivity.class);
                    openMoreInfo0.putExtra("index", index);
                    startActivity(openMoreInfo0);
                }
            });

        }
        else if (nameOfCenterFromIntent.equalsIgnoreCase("South Cove Medical Center")) {

            call.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    Intent callNum = new Intent(Intent.ACTION_DIAL);
                    callNum.setData(Uri.parse("tel:0123456789"));
                    startActivity(callNum);
                    // mWebView = findViewById(R.id.detail_web_view);
                    //mWebView.loadUrl("www.youtube.com");

                }
            });

            visitWebsite.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    Uri uri = Uri.parse("https://www.youtube.com");
                    Intent VisitWebsite = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(VisitWebsite);
                    // mWebView = findViewById(R.id.detail_web_view);
                    //mWebView.loadUrl("www.youtube.com");

                }
            });

            moreInfo.setOnClickListener(new View.OnClickListener() {
                public void onClick (View v) {
                    int index = 5;

                    Intent openMoreInfo0 = new Intent (mContext, MoreInfoActivity.class);
                    openMoreInfo0.putExtra("index", index);
                    startActivity(openMoreInfo0);
                }
            });

        }

        else if (nameOfCenterFromIntent.equalsIgnoreCase("South Cove Community Health Center-Chinatown")) {

            call.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    Intent callNum = new Intent(Intent.ACTION_DIAL);
                    callNum.setData(Uri.parse("tel:0123456789"));
                    startActivity(callNum);
                    // mWebView = findViewById(R.id.detail_web_view);
                    //mWebView.loadUrl("www.youtube.com");

                }
            });

            visitWebsite.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {

                    Uri uri = Uri.parse("https://www.youtube.com");
                    Intent VisitWebsite = new Intent(Intent.ACTION_VIEW, uri);
                    startActivity(VisitWebsite);
                    // mWebView = findViewById(R.id.detail_web_view);
                    //mWebView.loadUrl("www.youtube.com");

                }
            });

            moreInfo.setOnClickListener(new View.OnClickListener() {
                public void onClick (View v) {
                    int index = 6;

                    Intent openMoreInfo0 = new Intent (mContext, MoreInfoActivity.class);
                    openMoreInfo0.putExtra("index", index);
                    startActivity(openMoreInfo0);
                }
            });

        }




        //if name equals Beth Israel
        //Set up page for beth Israel

        //else if name equals somethign else
        //set up page for something else

        //maybe use switch

    }

}