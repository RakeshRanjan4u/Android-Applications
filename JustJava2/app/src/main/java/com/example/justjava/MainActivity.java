//package com.example.justjava;
package com.example.justjava;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
    private  static  boolean hasWhippedCream=false, hasChocolate=false;

    public void submitOrder(View view) {
        EditText editText=(EditText)findViewById(R.id.name_field);
        String name=editText.getText().toString();

        CheckBox whippedCreamCheckbox=(CheckBox)findViewById(R.id.whipped_cream_checkbox);
        hasWhippedCream =whippedCreamCheckbox.isChecked();

        CheckBox chocolateCheckbox=(CheckBox)findViewById(R.id.chocolate_checkbox);
        hasChocolate =chocolateCheckbox.isChecked();

        int price=calculatePrice(hasWhippedCream,hasChocolate);
        String priceMessage=createOrderSummary(name,price,hasWhippedCream,hasChocolate);
        //Intent will send mail through mailing app
            Intent intent = new Intent(Intent.ACTION_SENDTO);
            intent.setData(Uri.parse("mailto:")); // only email apps should handle this
            intent.putExtra(Intent.EXTRA_SUBJECT, "Just Java ordered for: "+name);
            intent.putExtra(Intent.EXTRA_TEXT, priceMessage);
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }

    }

    //Methods to Increment Or Decrement Quantity
    public void increment(View view){
        if(noOfCupOfCoffee==100){
            Toast.makeText(this,"You can not have more thaan 100 cup of coffee!",Toast.LENGTH_SHORT).show();
            return;
        }
        noOfCupOfCoffee=noOfCupOfCoffee+1;
        displayQuantity(noOfCupOfCoffee);
    }
    public void decrement(View view){
        if(noOfCupOfCoffee==1){
            Toast.makeText(this,"You can not have less than 1 cup of coffee!",Toast.LENGTH_SHORT).show();
            return;
        }
        noOfCupOfCoffee=noOfCupOfCoffee-1;
        displayQuantity(noOfCupOfCoffee);
    }

    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }
    private int calculatePrice(boolean addWhippedCreamPrice,boolean addChocolatePrice){
        int basePrice=5;
        basePrice+=addWhippedCreamPrice?1:0;
        basePrice+=addChocolatePrice?2:0;
        return noOfCupOfCoffee*basePrice;
    }
    /* CREATE SUMMARY OF THE ORDER!
     * @param Name               of the order
     * @param Price              of the order
     * @param addWhippedCream    whether or not add whipped cream to coffee
     * @Param addChocolate       whether or not add Chocolate to the coffee
     *
     */
    private String createOrderSummary(String name,int price,boolean addWhippedCream,boolean addChocolate){
        String summaryMessage=getString(R.string.order_summary_name)+name;
        summaryMessage+="\nAdd Whipped Cream? "+addWhippedCream;
        summaryMessage+="\nAdd Chocolate? "+addChocolate;
        summaryMessage+="\nQuantity: "+noOfCupOfCoffee;
        summaryMessage+= "\nPrice: $"+price;
        summaryMessage+="\n"+getString(R.string.thank_you);
        return summaryMessage;
    }

}