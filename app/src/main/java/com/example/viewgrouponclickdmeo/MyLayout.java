package com.example.viewgrouponclickdmeo;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;

public class MyLayout extends LinearLayout {

	public MyLayout(Context context, AttributeSet attrs) {
		super(context, attrs);
	}
	
	//�Ƿ�ȥ�����¼��Ĵ��ݣ�����true�����أ�����false�ǲ����أ�����
	@Override
	public boolean onInterceptTouchEvent(MotionEvent ev) {
		//��onclick����¼����ݵ��ӿؼ���
		return false;
	}
	//dispatchTouchEvent(ev)
}
