package com.glasshackathon.glass.live;

import com.bluebird.gcm.client.receiver.GCMMessageHandler;
import com.bluebird.gcm.client.receiver.NotificationMessageHandler;
import com.bluebird.gcm.client.service.AbstractGCMIntentService;

import java.util.ArrayList;
import java.util.List;

/**
 * @author tk@bluebird-mobile.com
 */
public class MyGCMIntentService  extends AbstractGCMIntentService {

    @Override
    protected List<GCMMessageHandler> getMessageHandlers() {
        List<GCMMessageHandler> messageHandlers = new ArrayList<GCMMessageHandler>();
        messageHandlers.add(new NotificationMessageHandler());
        return messageHandlers;
    }
}
