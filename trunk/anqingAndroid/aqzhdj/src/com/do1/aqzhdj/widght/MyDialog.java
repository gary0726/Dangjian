package com.do1.aqzhdj.widght;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;

import com.do1.aqzhdj.R;

public class MyDialog extends Dialog {
	
	private Context context;

	public MyDialog(Context context) {
		super(context);
		this.context = context;
	}

	public MyDialog(Context context, int theme) {
		super(context, theme);
		this.context = context;
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.dialog);
	}

}
