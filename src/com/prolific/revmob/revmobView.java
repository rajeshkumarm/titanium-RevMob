package com.prolific.revmob;

import org.appcelerator.kroll.KrollDict;
import org.appcelerator.titanium.TiApplication;
import org.appcelerator.titanium.proxy.TiViewProxy;
import org.appcelerator.titanium.view.TiUIView;

import com.revmob.ads.banner.Banner;

import android.app.Activity;
import android.util.Log;
import android.view.View;

public class revmobView extends TiUIView {
	private View view;
	TiViewProxy proxy;
	public revmobView(TiViewProxy proxy) {
		super(proxy);
		this.proxy=proxy;
		Log.d("RevMob","Creating Ad View");
		
	}
	
	public void createAdView()
	{
		if(ProrevmobModule.APP_ID!="" && ProrevmobModule.APP_ID!=null)
		{
			Log.d("RevMob"," Ad View Created with Appid="+ProrevmobModule.APP_ID);
		Banner banner = new Banner(ProrevmobModule.APP_ID,
				proxy.getActivity());
		setNativeView(banner);
		}
		else
		{
			Log.d("RevMob","App id Missing");
		}
	}

	@Override
	public void processProperties(KrollDict dict) {
		super.processProperties(dict);
		Log.d("RevMob", "process properties");
		if (dict.containsKey("appId")) {
			Log.d("RevMob", "has appId: " + dict.getString("appId"));
			ProrevmobModule.APP_ID = dict.getString("appId");
		}
		this.createAdView();
	}
}
