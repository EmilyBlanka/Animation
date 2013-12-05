//http://www.k-sugi.sakura.ne.jp/java/android/1808/
//http://web-terminal.blogspot.jp/2013/05/android.html
//http://www.geocities.jp/inu_poti/java/meida/image02.html
package com.example.android_animation;

//import com.example.musicgame4.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
//import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.CycleInterpolator;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends Activity implements OnTouchListener {
	
	int testbtn1, testbtn2, testbtn3, testbtn4;
	ImageView img1, img2;		
	ImageButton imgbtn1, imgbtn2;
	Button btn1, btn2, btn3, btn4;
	Animation anim1, anim2, anim3, anim4;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		img1 = (ImageView)findViewById(R.id.MusicIcon1);
		img2 = (ImageView)findViewById(R.id.MusicIcon2);
		imgbtn1 = (ImageButton)findViewById(R.id.MusicIconButton1);
		imgbtn2 = (ImageButton)findViewById(R.id.MusicIconButton2);
		
		btn1 = (Button)findViewById(R.id.button1);
		btn2 = (Button)findViewById(R.id.button2);
		btn3 = (Button)findViewById(R.id.button3);
		btn4 = (Button)findViewById(R.id.button4);
		
		btn1.setOnTouchListener(this);
		btn2.setOnTouchListener(this);
        btn3.setOnTouchListener(this);
        btn4.setOnTouchListener(this);
		
		anim1 = AnimationUtils.loadAnimation(this, R.anim.img1_anim);
		anim2 = AnimationUtils.loadAnimation(this, R.anim.img1_anim);
		anim3 = AnimationUtils.loadAnimation(this, R.anim.img1_anim);
		anim4 = AnimationUtils.loadAnimation(this, R.anim.img1_anim);
		
		img1.startAnimation(anim1);
		img2.startAnimation(anim2);
		imgbtn1.startAnimation(anim3);
		imgbtn2.startAnimation(anim4);
	}

	@Override
	public boolean onTouch(View v, MotionEvent event) {
		
		//アニメーションをスタート
		if(event.getAction() == MotionEvent.ACTION_DOWN) {
			switch (v.getId()) {
			case R.id.button1:
				img1.startAnimation(anim1);
				break;
			case R.id.button2:
				img2.startAnimation(anim2);
				break;
			case R.id.button3:
				imgbtn1.startAnimation(anim3);
				break;
			case R.id.button4:
				imgbtn2.startAnimation(anim4);
				break;
			}
			return true;
//		}else if(event.getAction() == MotionEvent.ACTION_UP) {
//			switch (v.getId()) {
//			case R.id.button1:
//				img1.stopAnimation(anim1);
//				break;
//			case R.id.button2:
//				img2.stopAnimation(anim1);
//				break;
//			case R.id.button3:
//				imgbtn1.stopAnimation(anim2);
//				break;
//			case R.id.button4:
//				imgbtn2.stopAnimation(anim2);
//				break;
//			}
//		return true;
		}
		return false;
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}