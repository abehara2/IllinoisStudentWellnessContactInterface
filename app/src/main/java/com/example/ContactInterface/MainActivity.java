package com.example.ContactInterface;


import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //McKinley
        Button McKinleyWeb = (Button) findViewById(R.id.McKinleyWebsite);
        McKinleyWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.mckinley.illinois.edu/";
                Intent urlintent = new Intent(Intent.ACTION_VIEW);
                urlintent.setData(Uri.parse(url));
                startActivity(urlintent);
            }
        });
        //Carle
        Button CarleWeb = (Button) findViewById(R.id.CarleWebsite);
        CarleWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.carle.org/";
                Intent urlintent = new Intent(Intent.ACTION_VIEW);
                urlintent.setData(Uri.parse(url));
                startActivity(urlintent);
            }
        });
        //OSF
        Button OSFWeb = (Button) findViewById(R.id.OSFWebsite);
        OSFWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.osfhealthcare.org/heart-of-mary/";
                Intent urlintent = new Intent(Intent.ACTION_VIEW);
                urlintent.setData(Uri.parse(url));
                startActivity(urlintent);
            }
        });
        // Suicide Prevention
        Button SuicideWeb = (Button) findViewById(R.id.SuicideWebsite);
        SuicideWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://suicidepreventionlifeline.org/";
                Intent urlintent = new Intent(Intent.ACTION_VIEW);
                urlintent.setData(Uri.parse(url));
                startActivity(urlintent);
            }
        });
        // Turnerdocs
        Button TurnerWeb = (Button) findViewById(R.id.TurnerWebsite);
        TurnerWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://counselingcenter.illinois.edu/";
                Intent urlintent = new Intent(Intent.ACTION_VIEW);
                urlintent.setData(Uri.parse(url));
                startActivity(urlintent);
            }
        });
        //Financial
        Button FinancialWeb = (Button) findViewById(R.id.FinancialWebsite);
        FinancialWeb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://web.extension.illinois.edu/cfiv/fwcollege/";
                Intent urlintent = new Intent(Intent.ACTION_VIEW);
                urlintent.setData(Uri.parse(url));
                startActivity(urlintent);
            }
        });
//        //Ashank's Website
//        Button AshankWeb = (Button) findViewById(R.id.AshankWebsite);
//        AshankWeb.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String url = "https://abehara2.github.io/";
//                Intent urlintent = new Intent(Intent.ACTION_VIEW);
//                urlintent.setData(Uri.parse(url));
//                startActivity(urlintent);
//            }
//        });
//        //Niviru's Website
//        Button NiviruWeb = (Button) findViewById(R.id.NivWebsite);
//        NiviruWeb.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                String url = "https://niviruw.github.io/";
//                Intent urlintent = new Intent(Intent.ACTION_VIEW);
//                urlintent.setData(Uri.parse(url));
//                startActivity(urlintent);
//            }
//        });
        //McKinley Call
        Button McKinleyPhone = (Button) findViewById(R.id.McKinleyCall);
        McKinleyPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                String temp = "tel:" + "2173332700";
                intent.setData(Uri.parse(temp));

                startActivity(intent);
            }
        });
        //Carle Call
        Button CarlePhone = (Button) findViewById(R.id.CarleCall);
        CarlePhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                String temp = "tel:" + "2173833311";
                intent.setData(Uri.parse(temp));

                startActivity(intent);
            }
        });
        //OSF Call
        Button OSFPhone = (Button) findViewById(R.id.OSFCall);
        OSFPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                String temp = "tel:" + "2173372000";
                intent.setData(Uri.parse(temp));

                startActivity(intent);
            }
        });
        //Suicide Call
        Button SuicidePhone = (Button) findViewById(R.id.SuicideCall);
        SuicidePhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                String temp = "tel:" + "18002738255";
                intent.setData(Uri.parse(temp));

                startActivity(intent);
            }
        });
        //Turner Call
        Button TurnerPhone = (Button) findViewById(R.id.TurnerCall);
        TurnerPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                String temp = "tel:" + "2173333704";
                intent.setData(Uri.parse(temp));

                startActivity(intent);
            }
        });
        //Financial Call;
        Button FinancialPhone = (Button) findViewById(R.id.FinancialCall);
        FinancialPhone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_DIAL);
                String temp = "tel:" + "2173330100";
                intent.setData(Uri.parse(temp));

                startActivity(intent);
            }
        });
    }
}