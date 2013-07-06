package com.glasshackathon.glass.live;

import android.os.Bundle;
import com.bluebird.gcm.client.activity.GCMRegistrationActivityAction;
import com.bluebird.mobile.tools.activities.AbstractActivity;

public class StartActivity extends AbstractActivity {
    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        addActivityAction(new GCMRegistrationActivityAction(this));
    }
}
