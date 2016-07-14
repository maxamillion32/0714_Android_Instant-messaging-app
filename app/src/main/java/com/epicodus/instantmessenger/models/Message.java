package com.epicodus.instantmessenger.models;

/**
 * Created by Guest on 7/14/16.
 */
public class Message {
    String body;
    String pushId;

    public Message() {}

    public Message(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

    public String getPushId() {
        return pushId;
    }

    public void setPushId(String pushId) {
        this.pushId = pushId;
    }
}
