package com.argz.demo_oop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "POTATO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Car randomCar1 = new Car();
        randomCar1.brand = "VOLVO";
        randomCar1.color = "RED";

        Car randomCar2 = new Car();
        randomCar2.brand = "AUDI";
        randomCar2.color = "BLUE";

        Car randomCar3 = new Car();
        randomCar3.brand = "TOYOTA";
        randomCar3.color = "GREEN";

        Employee employee = new Employee();
        employee.setName("argz");
        employee.setAge("18");

        Log.d(TAG, "onCreate: " + employee.toString());
    }
}