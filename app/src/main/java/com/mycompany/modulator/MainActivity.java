package com.mycompany.modulator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import android.view.View.*;
import android.view.*;
//import java.util.logging.*;
import android.os.*;
import java.io.*;
import android.content.*;

public class MainActivity extends Activity implements OnClickListener
{

    TextView txtv;
    Button modul;
    EditText edittxt;
    EditText edittxt2;
	int textEditOne;
	int textEditTwo;
	Button plus;
	Button minus;
	Button umno;
	Button delen;
	Button stepen;

    @Override
    protected void onCreate(Bundle savedInstanceState)
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        txtv = (TextView) findViewById(R.id.txtv);
        modul = (Button) findViewById(R.id.modul);
        edittxt = (EditText) findViewById(R.id.edittxt);
        edittxt2 = (EditText) findViewById(R.id.edittxt2);
		plus = (Button) findViewById(R.id.plus);
		minus = (Button) findViewById(R.id.minus);
		delen = (Button) findViewById(R.id.delen);
		umno = (Button) findViewById(R.id.umno);
		stepen = (Button) findViewById(R.id.stepen);

		modul.setOnClickListener(this);
		plus.setOnClickListener(this);
		minus.setOnClickListener(this);
		umno.setOnClickListener(this);
		delen.setOnClickListener(this);
		stepen.setOnClickListener(this);
		
		
	}

	@Override
	public void onClick(View v)
	{
		switch (v.getId())
		{
			case R.id.modul:
				test();
				txtv.setText(textEditOne % textEditTwo + "");
				break;
			case R.id.plus:
				test();
				txtv.setText(textEditOne + textEditTwo + "");
				break;
			case R.id.minus:
				test();
				txtv.setText(textEditOne - textEditTwo + "");
				break;
			case R.id.delen:
				test();
				txtv.setText(textEditOne / textEditTwo + "");
				break;
			case R.id.umno:
				test();
				txtv.setText(textEditOne * textEditTwo + "");
				break;
			case R.id.stepen:
				test();
				txtv.setText(Math.pow(textEditOne, textEditTwo) + "");
				break;


		}

	};





	public void test()
	{
		String textEditOnes = String.valueOf(edittxt.getText());
		textEditOne = Integer.parseInt(textEditOnes);
		String textEditTwos = String.valueOf(edittxt2.getText());
		textEditTwo = Integer.parseInt(textEditTwos);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		// TODO: Implement this method
		menu.add(0,0,0,"form");
		
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item)
	{
		// TODO: Implement this method
		if(item.getTitle()=="form"){
			Intent intent = new Intent(this, ActivityTwo.class);
			startActivity(intent);
		}
		return super.onOptionsItemSelected(item);
	}

	
	









}
