package com.example.jaden.shoppinglist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SecondActivity extends AppCompatActivity {
    public static final String EXTRA_REPLY =
            "com.example.android.shoppinglist.extra.REPLY";
    private static boolean checkIfAddedEgg = true;
    private static boolean checkIfAddedMilk = true;
    private static boolean checkIfAddedCheese = true;
    private static boolean checkIfAddedBread = true;
    private static boolean checkIfAddedApples = true;
    private static boolean checkIfAddedRice = true;
    private static boolean checkIfAddedChicken = true;
    private static boolean checkIfAddedJuice = true;
    private static boolean checkIfAddedOnions = true;
    private static boolean checkIfAddedBananas = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }



    public void addItemEgg(View view) {
        Intent addIntent = new Intent(this, MainActivity.class);

        if(checkIfAddedEgg) {
            addIntent.putExtra(EXTRA_REPLY, "Eggs");
            setResult(RESULT_OK, addIntent);
            finish(); //returns to main
        }
        checkIfAddedEgg = false;
    }

    public void addItemMilk(View view) {
        Intent addIntent = new Intent(this, MainActivity.class);
        if(checkIfAddedMilk == true) {
            addIntent.putExtra(EXTRA_REPLY, "Milk");
            setResult(RESULT_OK, addIntent);
            finish(); //returns to main
        }
        checkIfAddedMilk = false;
    }

    public void addItemCheese(View view) {
        Intent addIntent = new Intent(this, MainActivity.class);
        if(checkIfAddedCheese == true) {
            addIntent.putExtra(EXTRA_REPLY, "Cheese");
            setResult(RESULT_OK, addIntent);
            finish(); //returns to main
        }
        checkIfAddedCheese = false;
    }

    public void addItemBread(View view) {
        Intent addIntent = new Intent(this, MainActivity.class);
        if(checkIfAddedBread == true) {
            addIntent.putExtra(EXTRA_REPLY, "Bread");
            setResult(RESULT_OK, addIntent);
            finish(); //returns to main
        }
        checkIfAddedBread = false;
    }


    public void addItemApple(View view) {
        Intent addIntent = new Intent(this, MainActivity.class);
        if(checkIfAddedApples == true) {
            addIntent.putExtra(EXTRA_REPLY, "Apples");
            setResult(RESULT_OK, addIntent);
            finish(); //returns to main
        }
        checkIfAddedApples = false;
    }

    public void addItemRice(View view) {
        Intent addIntent = new Intent(this, MainActivity.class);
        if(checkIfAddedRice == true) {
            addIntent.putExtra(EXTRA_REPLY, "Rice");
            setResult(RESULT_OK, addIntent);
            finish(); //returns to main
        }
        checkIfAddedRice = false;
    }

    public void addItemChicken(View view) {
        Intent addIntent = new Intent(this, MainActivity.class);
        if(checkIfAddedChicken == true) {
            addIntent.putExtra(EXTRA_REPLY, "Chicken");
            setResult(RESULT_OK, addIntent);
            finish(); //returns to main
        }
        checkIfAddedChicken = false;
    }

    public void addItemJuice(View view) {
        Intent addIntent = new Intent(this, MainActivity.class);
        if(checkIfAddedJuice == true) {
            addIntent.putExtra(EXTRA_REPLY, "Juice");
            setResult(RESULT_OK, addIntent);
            finish(); //returns to main
        }
        checkIfAddedJuice = false;
    }

    public void addItemOnion(View view) {
        Intent addIntent = new Intent(this, MainActivity.class);
        if(checkIfAddedOnions == true) {
            addIntent.putExtra(EXTRA_REPLY, "Onions");
            setResult(RESULT_OK, addIntent);
            finish(); //returns to main
        }
        checkIfAddedOnions = false;
    }

    public void addItemBanana(View view) {
        Intent addIntent = new Intent(this, MainActivity.class);
        if(checkIfAddedBananas == true) {
            addIntent.putExtra(EXTRA_REPLY, "Bananas");
            setResult(RESULT_OK, addIntent);
            finish(); //returns to main
        }
        checkIfAddedBananas = false;
    }
}
