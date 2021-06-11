package com.mshaheerz.calculator; 

import android.os.Bundle; 

import android.view.View; 

import android.widget.Button; 

import android.widget.EditText; 

import android.widget.TextView;
import android.app.*; 



public class MainActivity extends Activity implements View.OnClickListener
{
	EditText number1; 

    EditText number2; 

    Button Add_button,sub,multiply,devide; 

    TextView result; 

    int ans=0; 
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.main); 
		
		number1=findViewById(R.id.editText_first_no); 

        number2=findViewById(R.id.editText_second_no);
		
		
		
		
        Add_button=findViewById(R.id.add_button); 
         Add_button.setOnClickListener(this);
		 
		 
		 sub = findViewById(R.id.sub);
		 sub.setOnClickListener(this);
		 
		 
        result = findViewById(R.id.textView_answer); 

        multiply = findViewById(R.id.multily);
		multiply.setOnClickListener(this);


		devide=findViewById(R.id.devide);
		devide.setOnClickListener(this);
		
		}
	// TODO: Implement this method
	@Override
	public void onClick(View v) {
	
		switch (v.getId()) {
			case R.id.sub:
				// do your codedouble num1 = Double.parseDouble(number1.getText().toString()); 
				double num1 = Double.parseDouble(number1.getText().toString());
				double num2 = Double.parseDouble(number2.getText().toString()); 

				// add both number and store it to sum 
				double sum = num1 - num2; 

				// set it ot result textview 

				result.setText(Double.toString(sum));
				
				break;
			
			case R.id.add_button:
				double num3 = Double.parseDouble(number1.getText().toString());
				double num4 = Double.parseDouble(number2.getText().toString()); 


				double cum = num3 + num4;
				result.setText(Double.toString(cum)); 
				// do your code
				break;
			case R.id.multily:
				double num5 = Double.parseDouble(number1.getText().toString());
				double num6 = Double.parseDouble(number2.getText().toString()); 


				double shum = num5 * num6;
				result.setText(Double.toString(shum)); 
				// do your code
				break;
			case R.id.devide:
				double num7 = Double.parseDouble(number1.getText().toString());
				double num8 = Double.parseDouble(number2.getText().toString()); 


				double jum = num7 / num8;
				result.setText(Double.toString(jum)); 
				// do your code
				break;

			default:
				break;
		}



		// num1 or num2 double type 

		// get data which is in edittext, convert it to string 

		// using parse Double convert it to Double type 



	
}} 
	
	
    


   
