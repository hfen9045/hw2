package com.example.hw2;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.TimeZone;

public class MainActivity extends AppCompatActivity {
          private boolean isCheckedValue;

        Thread t = new Thread()  ;
    private Button mButton ;

     private Button mButton1 ;
      CheckBox checkBox;
    SimpleDateFormat formatDate = new SimpleDateFormat("hh:mm a ");
    SimpleDateFormat formatDate1 = new SimpleDateFormat("hh:mm a ");
    SimpleDateFormat formatDate2 = new SimpleDateFormat("hh:mm a ");
    SimpleDateFormat formatDate3 = new SimpleDateFormat("hh:mm a ");
    SimpleDateFormat formatDate4 = new SimpleDateFormat("hh:mm a ");

    SimpleDateFormat aformatDate = new SimpleDateFormat("HH:mm");
    SimpleDateFormat aformatDate1 = new SimpleDateFormat("HH:mm");
    SimpleDateFormat aformatDate2 = new SimpleDateFormat("HH:mm");
    SimpleDateFormat aformatDate3 = new SimpleDateFormat("HH:mm");
    SimpleDateFormat aformatDate4 = new SimpleDateFormat("HH:mm");


       Date f = Calendar.getInstance().getTime();




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);


        t =new Thread(){

           @Override
                public void run() {
                    try {
                        while (!isInterrupted()) {
                            Thread.sleep(1000);
                            runOnUiThread(new Runnable() {
                                @Override
                                public void run() {

            f = Calendar.getInstance().getTime();


        formatDate.setTimeZone(TimeZone.getTimeZone("America/New_York"));
        formatDate2.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
        formatDate3.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
        formatDate4.setTimeZone(TimeZone.getTimeZone("Asia/Dubai"));




        String currentTime = formatDate1.format(f.getTime());
        String newTime =  formatDate.format(f.getTime());
        String shanghai =  formatDate3.format(f.getTime());
        String paris =  formatDate2.format(f.getTime());
        String dubai =  formatDate4.format(f.getTime());



        TextView c=(TextView) findViewById(R.id.ct);
        c.setText(currentTime);


        TextView c1=(TextView) findViewById(R.id.ct1);
        c1.setText(newTime);


        TextView c2=(TextView) findViewById(R.id.ct4);
        c2.setText(shanghai);

        TextView c3=(TextView) findViewById(R.id.ct3);
        c3.setText(paris);

        TextView c4=(TextView) findViewById(R.id.ct5);
        c4.setText(dubai);


          }
                             });
                         }
                     } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                     }

                    
                 }
             };
         
             t.start();


        



                  mButton = findViewById(R.id.button2);
                    mButton.setOnClickListener(new View.OnClickListener(){
                        @Override
                        public void onClick(View view)
                        {
                                t.interrupt();
                             t = new Thread() {

                                @Override
                                     public void run() {
                                         try {
                                             while (!isInterrupted()) {
                                                 Thread.sleep(1000);
                                                 runOnUiThread(new Runnable() {
                                                     @Override
                                                     public void run() {

                                 f = Calendar.getInstance().getTime();



                       aformatDate.setTimeZone(TimeZone.getTimeZone("America/New_York"));
                       aformatDate2.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
                       aformatDate3.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
                       aformatDate4.setTimeZone(TimeZone.getTimeZone("Asia/Dubai"));




                       String currentTime = aformatDate1.format(f.getTime());
                       String newTime =  aformatDate.format(f.getTime());
                       String shanghai =  aformatDate3.format(f.getTime());
                       String paris =  aformatDate2.format(f.getTime());
                       String dubai =  aformatDate4.format(f.getTime());



                       TextView c=(TextView) findViewById(R.id.ct);
                       c.setText(currentTime);


                       TextView c1=(TextView) findViewById(R.id.ct1);
                       c1.setText(newTime);


                       TextView c2=(TextView) findViewById(R.id.ct4);
                       c2.setText(shanghai);

                       TextView c3=(TextView) findViewById(R.id.ct3);
                       c3.setText(paris);

                       TextView c4=(TextView) findViewById(R.id.ct5);
                       c4.setText(dubai);


                              }
                                                 });
                                             }
                                         } catch (InterruptedException e) {
                                         }
                                     }
                                 };

                                 t.start();






                        }
                    });






















                    mButton1 = findViewById(R.id.button);
                      mButton1.setOnClickListener(new View.OnClickListener(){
                          @Override
                          public void onClick(View view)
                          {



                               t.interrupt();

                               t = new Thread() {

                                   @Override
                                        public void run() {
                                            try {
                                                while (!isInterrupted()) {
                                                    Thread.sleep(1000);
                                                    runOnUiThread(new Runnable() {
                                                        @Override
                                                        public void run() {

                                    f = Calendar.getInstance().getTime();



                         formatDate.setTimeZone(TimeZone.getTimeZone("America/New_York"));
                         formatDate2.setTimeZone(TimeZone.getTimeZone("Europe/Paris"));
                         formatDate3.setTimeZone(TimeZone.getTimeZone("Asia/Shanghai"));
                         formatDate4.setTimeZone(TimeZone.getTimeZone("Asia/Dubai"));




                         String currentTime = formatDate1.format(f.getTime());
                         String newTime =  formatDate.format(f.getTime());
                         String shanghai =  formatDate3.format(f.getTime());
                         String paris =  formatDate2.format(f.getTime());
                         String dubai =  formatDate4.format(f.getTime());



                         TextView c=(TextView) findViewById(R.id.ct);
                         c.setText(currentTime);


                         TextView c1=(TextView) findViewById(R.id.ct1);
                         c1.setText(newTime);


                         TextView c2=(TextView) findViewById(R.id.ct4);
                         c2.setText(shanghai);

                         TextView c3=(TextView) findViewById(R.id.ct3);
                         c3.setText(paris);

                         TextView c4=(TextView) findViewById(R.id.ct5);
                         c4.setText(dubai);

                                     }                                                        
                                                        });                                   
                                                    }                                         
                                                } catch (InterruptedException e) {            
                                                }                                             
                                            }                                                 
                                        };                                                    
                                                                                              
                                        t.start();                                            
                                                                                              

                          }
                      });






















        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
