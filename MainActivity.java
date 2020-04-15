package jauran.faerieapp;

import android.app.*;
import android.os.*;
import android.view.*;
import android.view.animation.*;
import android.widget.*;

public class MainActivity extends Activity {
	//private TextView TextView = null;
	private ImageView ImageView1=null;
	int i,j=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		//TextView = findViewById(R.id.mainTextView1);
		ImageView1 = findViewById(R.id.mainImageView1);
		Toast.makeText(this, "点我，我能走两步～", Toast.LENGTH_LONG).show();
    }
	public void onClickImageView1(View view) {
		i = i + 1;
		if (i == 1) {
			// This Java code shows a toast
			Toast.makeText(this, "你好!\n我是赵然制作的第1个安卓小机器人^_^", Toast.LENGTH_LONG).show();
			// Animation...
			TranslateAnimation animation = new TranslateAnimation(0, 280, 0, 0);//右移280
			animation.setDuration(3000);
			animation.setFillAfter(true);
			animation.setAnimationListener(new Animation.AnimationListener(){
					@Override
					public void onAnimationStart(Animation animation) {
					}
					@Override
					public void onAnimationRepeat(Animation animation) {
					}
					@Override
					public void onAnimationEnd(Animation animation) {
						ImageView1.clearAnimation();//动画结束时清除动画，并在下面给它位置
						RelativeLayout.LayoutParams layoutParams=(RelativeLayout.LayoutParams)ImageView1.getLayoutParams();
						layoutParams.leftMargin = ImageView1.getLeft() + 40;
						ImageView1.setLayoutParams(layoutParams);
					}
				});
			view.startAnimation(animation);
			//TextView.setVisibility(TextView.INVISIBLE);
		}
		else if (i == 3) {
			Toast.makeText(this, "如果你喜欢我，你就继续点点我～", Toast.LENGTH_SHORT).show();
		}
		else if (i == 6) {
			Toast.makeText(this, "我有很多好玩的事情想告诉你～", Toast.LENGTH_SHORT).show();
		}
		else if (i == 10) {
			Toast.makeText(this, "我这么可爱，你给我买一个可爱多吧～", Toast.LENGTH_SHORT).show();
		}
		else if (i == 15) {
			Toast.makeText(this, "你都点了我" + i + "次了，我想静静了...", Toast.LENGTH_LONG).show();
		}
		else if (i <= 14) {
			Toast.makeText(this, "你是第" + i + "次点我了～", Toast.LENGTH_SHORT).show();
		}
	}
	public void onClickImageView2(View view) {
		j = j + 1;
		if (j <= 2) {
			// This Java code shows a toast
			Toast.makeText(this, "我需要一把钥匙才能进入小屋!", Toast.LENGTH_SHORT).show();
		}
		else if (j == 3) {
			Toast.makeText(this, "这是第" + j + "次告诉你：\n我需要一把钥匙才能进入小屋!", Toast.LENGTH_LONG).show();
		}
	}
}
