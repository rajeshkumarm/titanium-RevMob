package com.prolific.revmob;

import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.titanium.TiContext.OnLifecycleEvent;
import org.appcelerator.titanium.proxy.TiViewProxy;
import org.appcelerator.titanium.view.TiUIView;

import android.app.Activity;
import android.view.View;

@Kroll.proxy(creatableInModule = ProrevmobModule.class)
public class revmobViewProxy extends TiViewProxy implements OnLifecycleEvent {
	private revmobView view;
	public revmobViewProxy() {
		super();
	}

	@Override
	public TiUIView createView(Activity activity) {
		view = new revmobView(this);
		return view;
	}

	@Override
	public void onDestroy(Activity arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPause(Activity arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onResume(Activity arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(Activity arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStop(Activity arg0) {
		// TODO Auto-generated method stub
		
	}
}
