//package com.example.justjava;
package com.example.justjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    private  static  int noOfCupOfCoffee=1;
    public void submitOrder(View view) {
        int price=noOfCupOfCoffee*5;
        String priceMessage="Total: $"+ price + "\nThank You!";
        displayMessage(priceMessage);
    }

    //Methods to Increment Or Decrement Quantity
    public void increment(View view){
        noOfCupOfCoffee=noOfCupOfCoffee+1;
        display(noOfCupOfCoffee);
        displayPrice(noOfCupOfCoffee*5);
    }
    public void decrement(View view){
        noOfCupOfCoffee=noOfCupOfCoffee-1;
        display(noOfCupOfCoffee);
        displayPrice(noOfCupOfCoffee*5);
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));
    }
}