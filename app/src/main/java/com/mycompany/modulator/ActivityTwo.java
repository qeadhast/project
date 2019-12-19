package com.mycompany.modulator;
import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;

public class ActivityTwo extends Activity implements OnClickListener
{

	TextView twotxtv;
	EditText twoEditText1;
	Button twoButtonResult;
	
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		// TODO: Implement this method
		super.onCreate(savedInstanceState);
		setContentView(R.layout.two);
		twoButtonResult.setOnClickListener(this);
		
		
	}

	@Override
	public void onClick(View p1)
	{
		// TODO: Implement this method
		switch(p1.getId()){
			case R.id.twoButtonResult:
				String s = twoEditText1.getText().toString();
				
		}
		
	}

	
	
}
