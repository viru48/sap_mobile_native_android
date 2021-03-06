package com.sap.dcode.agency;

import android.app.Application;

import com.sap.dcode.agency.services.logs.AgencyLogManager;
import com.sap.dcode.util.TraceLog;

public class AgencyApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		
		//TODO 5-1 INITIALIZE AgencyLogManager with the application context
		//BEGIN
        //END

		//Initialize logging for debugging
        TraceLog.initialize(this);
        TraceLog.scoped(this).d("onCreate");
        
	}

}
