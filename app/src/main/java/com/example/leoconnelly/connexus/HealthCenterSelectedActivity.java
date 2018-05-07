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
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * Created by leoconnelly on 4/10/18.
 */

public class HealthCenterSelectedActivity extends AppCompatActivity {
    MapView mMapView;
    private GoogleMap googleMap;
    //private WebView mWebView;
    public static final String KEY_URL = "key_url";
    public static final String KEY_TITLE = "key_title";
    Context mContext;
    public double lat;
    public double longi;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.find_care_selected);

        //if else statement

        //String title = this.getIntent().getExtras().getString("title");

    String nameOfCenterFromIntent = this.getIntent().getExtras().getString("nameOfCenter");
    lat = this.getIntent().getExtras().getDouble("latitude");
    longi = this.getIntent().getExtras().getDouble("longitude");

        System.out.println(nameOfCenterFromIntent + "beep beep beep beep BEEP BEEP BEEP BEEP BEEP BEEP BEEP BEEP BEEP BEEPBEEP BEEP BEEP BEEPBEEP BEEP BEEP BEEPBEEP BEEP BEEP BEEPBEEP BEEP BEEP BEEP");

        mMapView = (MapView) findViewById(R.id.mapView);
        mMapView.onCreate(savedInstanceState);
        //if
        try {
            MapsInitializer.initialize(this.getApplicationContext());
        } catch (Exception e) {
            e.printStackTrace();
        }

        mMapView.getMapAsync(new OnMapReadyCallback() {
            @Override
            public void onMapReady(GoogleMap mMap) {
                googleMap = mMap;

                //set location
                LatLng Bowdoin = new LatLng(lat, longi);
                googleMap.addMarker(new MarkerOptions().position(Bowdoin).title("Marker Title").snippet("Marker Description"));

                // zoom automatically to the location of the marker
                CameraPosition cameraPosition = new CameraPosition.Builder().target(Bowdoin).zoom(12).build();
                googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
            }
        });


        TextView address = findViewById(R.id.Address);
        Button GetDirections = findViewById(R.id.GetDirections);
        Button call = findViewById(R.id.Call); //done
        Button visitWebsite = findViewById(R.id.VisitWebsite); //done
        Button moreInfo = findViewById(R.id.MoreInfo);


        //for more info, assign an int for each one.
        //Create the int in the onclick
        //if statments checking the value of the int ad

        mContext = this;


        GetDirections.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {


                Uri gmmIntentUri = Uri.parse("Google.navigation:q="+lat+","+"long");

                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);

                mapIntent.setPackage("com.google.android.apps.maps");

                startActivity(mapIntent);

                // mWebView = findViewById(R.id.detail_web_view);
                //mWebView.loadUrl("www.youtube.com");

            }
        });

        address.setText("230 Bowdoin St.");



        if (nameOfCenterFromIntent.equalsIgnoreCase("Bowdoin Health Center")) {
                System.out.println("TEST TEST TEST TEST TEST ");

            address.setText("230 Bowdoin St.");




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

            address.setText("230 Bowdoin St.");


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