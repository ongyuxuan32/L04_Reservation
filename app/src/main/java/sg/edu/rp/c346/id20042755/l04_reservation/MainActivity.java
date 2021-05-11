package sg.edu.rp.c346.id20042755.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    DatePicker dp;
    TimePicker tp;
    TextView name;
    TextView numberPax;
    TextView phone;
    Button Book;
    TextView display;
    CheckBox smoke;
    Button reset;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.datePicker);
        tp = findViewById(R.id.timePicker);
        name = findViewById(R.id.UserName);
        numberPax = findViewById(R.id.NumberOfPax);
        phone = findViewById(R.id.UserPhone);
        Book = findViewById(R.id.BOOK);
        display = findViewById(R.id.DisplayText);
        smoke = findViewById(R.id.Smoke);
        reset = findViewById(R.id.ResetBtn);


        Book.setOnClickListener(new View.OnClickListener(){


            @Override
            public void onClick(View v) {
            String dateis = ", Your Date of booking is: " + dp.getMonth() + "/" +
                    (dp.getMonth()+1) + "/" +dp.getYear();

            String timeis = " and Your Booking time is: " + tp.getCurrentHour() + ":" +
                    tp.getCurrentMinute();
            String customer = "Your name is " + name.getText();
            String number = ", Phone number " + phone.getText();
            String pax = ", Number of people is " +  numberPax.getText();

            display.setText("Your name " + customer + number + pax + dateis + timeis);


             }



        });
        smoke.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Smoking Table Checked:",
                        Toast.LENGTH_LONG).show();
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String customer = null;
                String number = null;
                String pax = null;

            }
        });








    }
}