package com.example.jaden.shoppinglist;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final int TEXT_REQUEST = 1;
    private TextView firstTextView;
    private TextView secondTextView;
    private TextView thirdTextView;
    private TextView fourthTextView;
    private TextView fifthTextView;
    private TextView sixthTextView;
    private TextView seventhTextView;
    private TextView eighthTextView;
    private TextView ninthTextView;
    private TextView tenthTextView;
    private EditText mLocationEditText;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstTextView = findViewById(R.id.textView_One);
        secondTextView = findViewById(R.id.textView_Two);
        thirdTextView = findViewById(R.id.textView_Three);
        fourthTextView = findViewById(R.id.textView_Four);
        fifthTextView = findViewById(R.id.textView_Five);
        sixthTextView = findViewById(R.id.textView_Six);
        seventhTextView = findViewById(R.id.textView_Seven);
        eighthTextView = findViewById(R.id.textView_Eight);
        ninthTextView = findViewById(R.id.textView_Nine);
        tenthTextView = findViewById(R.id.textView_Ten);
        mLocationEditText = findViewById(R.id.editText_loc);


        if (savedInstanceState != null) {
            firstTextView.setText(savedInstanceState.getString("first_text"));
            secondTextView.setText(savedInstanceState.getString("second_text"));
            thirdTextView.setText(savedInstanceState.getString("third_text"));
            fourthTextView.setText(savedInstanceState.getString("fourth_text"));
            fifthTextView.setText(savedInstanceState.getString("fifth_text"));
            sixthTextView.setText(savedInstanceState.getString("sixth_text"));
            seventhTextView.setText(savedInstanceState.getString("seventh_text"));
            eighthTextView.setText(savedInstanceState.getString("eighth_text"));
            ninthTextView.setText(savedInstanceState.getString("ninth_text"));
            tenthTextView.setText(savedInstanceState.getString("tenth_text"));


        }

    }

    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putBoolean("text_visible", true);
        outState.putString("first_text", firstTextView.getText().toString()); //saves reply text
        outState.putString("second_text", secondTextView.getText().toString());
        outState.putString("third_text", thirdTextView.getText().toString());
        outState.putString("fourth_text", fourthTextView.getText().toString());
        outState.putString("fifth_text", fifthTextView.getText().toString());
        outState.putString("sixth_text", sixthTextView.getText().toString());
        outState.putString("seventh_text", seventhTextView.getText().toString());
        outState.putString("eighth_text", eighthTextView.getText().toString());
        outState.putString("ninth_text", ninthTextView.getText().toString());
        outState.putString("tenth_text", tenthTextView.getText().toString());


    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivityForResult(intent, TEXT_REQUEST);
    }

    public void onActivityResult(int requestCode,
                                 int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //makes sure i process the right intent, could be several
        if (requestCode == TEXT_REQUEST) {
            //tests to see if the request was successful
            if (resultCode == RESULT_OK) { //can be result_ok, result_cancel (user cancelled) or result_first_user(defining my own result)
                String reply = data.getStringExtra(SecondActivity.EXTRA_REPLY);
                //mReplyHeadTextView.setVisibility(View.VISIBLE);
                //if(firstTextView.getText().equals(""))
                checkEmptyTextView().setText(reply);


                //mReplyTextView.setVisibility(View.VISIBLE);

            }
        }
    }

    private TextView checkEmptyTextView() {
        TextView[] arrayTextView = {firstTextView, secondTextView, thirdTextView,
                fourthTextView, fifthTextView, sixthTextView,
                seventhTextView, eighthTextView, ninthTextView,
                tenthTextView};
        TextView current = arrayTextView[0];
        int count = 0;
        while (!(current.getText().equals(""))) {
            count++;
            current = arrayTextView[count];
        }

        return current;

/*
        if(firstTextView.getText().equals(""))
            return firstTextView;
        else if(secondTextView.getText().equals(""))
            return secondTextView;
        else if(thirdTextView.getText().equals(""))
            return thirdTextView;
        else if(fourthTextView.getText().equals(""))
            return fourthTextView;
        else if(fifthTextView.getText().equals(""))
            return fifthTextView;
        else if(sixthTextView.getText().equals(""))
            return sixthTextView;
        else if(seventhTextView.getText().equals(""))
            return seventhTextView;
        else if(eighthTextView.getText().equals(""))
            return eighthTextView;
        else if(ninthTextView.getText().equals(""))
            return ninthTextView;
        else if(tenthTextView.getText().equals(""))
            return tenthTextView;
        //should never get here
        return null;

        */
    }

    public void openLocation(View view) {
        String loc = mLocationEditText.getText().toString();
        //parse string into Uri
        Uri addressUri = Uri.parse("geo:0,0?q=" + loc);
        Intent intent = new Intent(Intent.ACTION_VIEW, addressUri);

        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            Log.d("ImplicitIntents", "Can't handle this intent!");
        }
    }
}
