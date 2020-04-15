package jauran.faerieapp;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.animation.*;
import android.widget.*;

public class MainActivity extends Activity 
{
	private TextView TextView = null;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		TextView = findViewById(R.id.mainTextView1);
    }
	public void onClickImageView(View view)
	{
		// This Java code shows a toast
		Toast.makeText(this, "你好!\n我是赵然制作的第1个安卓小机器人^_^", Toast.LENGTH_LONG).show();
		// Do some fancy animation...
		TranslateAnimation animation = new TranslateAnimation(0, 300, 0, 0);
		animation.setDuration(3000);
		view.startAnimation(animation);
		animation.setFillAfter(true);

		TextView.setVisibility(TextView.INVISIBLE);
	}
}
