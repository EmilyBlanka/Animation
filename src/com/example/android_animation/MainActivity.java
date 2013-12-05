//http://www.k-sugi.sakura.ne.jp/java/android/1808/
//http://web-terminal.blogspot.jp/2013/05/android.html
//http://www.geocities.jp/inu_poti/java/meida/image02.html
package com.example.android_animation;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
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

public class MainActivity extends Activity  {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		ImageView img1 = (ImageView)findViewById(R.id.MusicIcon1);
		ImageView img2 = (ImageView)findViewById(R.id.MusicIcon2);
		
		Animation anim1 = AnimationUtils.loadAnimation(this, R.anim.img1_anim);
		
		//繰り返す回数を設定（１度でよい場合は設定しない）
		anim1.setInterpolator(new CycleInterpolator(10));
		
		
		ImageButton imgbtn1 = (ImageButton)findViewById(R.id.MusicIconButton1);
		ImageButton imgbtn2 = (ImageButton)findViewById(R.id.MusicIconButton2);
		
		Animation anim2 = AnimationUtils.loadAnimation(this, R.anim.imgbtn1_anim);
		
		//繰り返す回数を設定（１度でよい場合は設定しない）
		anim2.setInterpolator(new CycleInterpolator(10));
		
//		//アニメーションが無限に繰り返される
//		anim1.setRepeatCount( Animation.INFINITE );
		
		//アニメーションをスタート
		img1.startAnimation(anim1);
		img2.startAnimation(anim1);
		imgbtn1.startAnimation(anim2);
		imgbtn2.startAnimation(anim2);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}