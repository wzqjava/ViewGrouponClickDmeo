package com.example.viewgrouponclickdmeo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class MyLayout extends LinearLayout {

	public MyLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	//是否去拦击事件的传递，返回true是拦截，返回false是不拦截，传递
	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		//把onclick点击事件传递到子控件中
		return false;
	}
	//dispatchTouchEvent(ev)
}
