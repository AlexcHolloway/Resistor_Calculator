package com.alexcholloway.Resistor_Calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.webianks.library.scroll_choice.ScrollChoice;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> ResVal = new ArrayList<>();
    List<String> ResVal3 = new ArrayList<>();
    TextView ResResult;
    ScrollChoice band1, band2, band3;
    String band1Value = "", band2Value = "0", band3Value ="Ω";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Toast for instructions on how to use the app
        Toast.makeText(this, "Swipe to choose values", Toast.LENGTH_SHORT).show();

        setContentView(R.layout.activity_main);

        ResResult = findViewById(R.id.textView1);
        band1 = findViewById(R.id.scroll_choice1);
        band2 = findViewById(R.id.scroll_choice2);
        band3 = findViewById(R.id.scroll_choice3);

        loadDataBand1_2();
        loadDataBand3();

        band1.addItems(ResVal,0);
        band2.addItems(ResVal,0);
        band3.addItems(ResVal3,0);


        band1.setOnItemSelectedListener((scroll_choice1, position, band1) -> {

            band1Value = getValueBand1(band1);
            ResResult.setText(band1Value + band2Value + band3Value);

        });

        band2.setOnItemSelectedListener(new ScrollChoice.OnItemSelectedListener() {
            @Override
            public void onItemSelected(ScrollChoice scroll_choice2, int position, String band2) {
                band2Value = getValueBand2(band2);
                ResResult.setText(band1Value + band2Value + band3Value);
            }
        });


        band3.setOnItemSelectedListener(new ScrollChoice.OnItemSelectedListener() {
            @Override
            public void onItemSelected(ScrollChoice scroll_choice3, int position, String band3) {
                band3Value = getZeros(band3);
                ResResult.setText(band1Value + band2Value + band3Value);
            }
        });
    }

    public String getValueBand1(String test1){
        String result;
        switch (test1){
            case "Brown":
                result = "1";
                break;
            case "Red":
                result = "2";
                break;
            case "Orange":
                result = "3";
                break;
            case "Yellow":
                result = "4";
                break;
            case "Green":
                result = "5";
                break;
            case "Blue":
                result = "6";
                break;
            case "Violet":
                result = "7";
                break;
            case "Grey":
                result = "8";
                break;
            case "White":
                result = "9";
                break;
            default:
                result = "";
        }

        return result;
    }
    public String getValueBand2(String test2){
        String result;
        switch (test2){
            case "Brown":
                result = "1";
                break;
            case "Red":
                result = "2";
                break;
            case "Orange":
                result = "3";
                break;
            case "Yellow":
                result = "4";
                break;
            case "Green":
                result = "5";
                break;
            case "Blue":
                result = "6";
                break;
            case "Violet":
                result = "7";
                break;
            case "Grey":
                result = "8";
                break;
            case "White":
                result = "9";
                break;
            default:
                result = "0";
        }

        return result;
    }
    public String getZeros(String test3){
        String result;
        switch (test3){
            case "Brown":
                result = "0Ω";
                break;
            case "Red":
                result = "00Ω";
                break;
            case "Orange":
                result = "KΩ";
                break;
            case "Yellow":
                result = "0KΩ";
                break;
            case "Green":
                result = "00KΩ";
                break;
            case "Blue":
                result = "MΩ";
                break;
            case "Violet":
                result = "0MΩ";
                break;
            default:
                result = "Ω";
        }

        return result;
    }
    private void loadDataBand1_2() {
        ResVal.add("Black");
        ResVal.add("Brown");
        ResVal.add("Red");
        ResVal.add("Orange");
        ResVal.add("Yellow");
        ResVal.add("Green");
        ResVal.add("Blue");
        ResVal.add("Violet");
        ResVal.add("Grey");
        ResVal.add("White");
    }
    private void loadDataBand3() {
        ResVal3.add("Black");
        ResVal3.add("Brown");
        ResVal3.add("Red");
        ResVal3.add("Orange");
        ResVal3.add("Yellow");
        ResVal3.add("Green");
        ResVal3.add("Blue");
        ResVal3.add("Violet");
    }
}