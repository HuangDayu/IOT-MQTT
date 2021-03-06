package com.iot.mqtt;

public class PayloadRoot
{
    private String messageType;

    private String clientId;

    private String topic;

    private String namespace;

    private String name;

    private String deviceId;

    private String deviceType;

    private String messageId;

    private String payloadVersion;

    private String publishTime;

    private String remarks;

    public void setMessageType(String messageType){
        this.messageType = messageType;
    }
    public String getMessageType(){
        return this.messageType;
    }
    public void setClientId(String clientId){
        this.clientId = clientId;
    }
    public String getClientId(){
        return this.clientId;
    }
    public void setTopic(String topic){
        this.topic = topic;
    }
    public String getTopic(){
        return this.topic;
    }
    public void setNamespace(String namespace){
        this.namespace = namespace;
    }
    public String getNamespace(){
        return this.namespace;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setDeviceId(String deviceId){
        this.deviceId = deviceId;
    }
    public String getDeviceId(){
        return this.deviceId;
    }
    public void setDeviceType(String deviceType){
        this.deviceType = deviceType;
    }
    public String getDeviceType(){
        return this.deviceType;
    }
    public void setMessageId(String messageId){
        this.messageId = messageId;
    }
    public String getMessageId(){
        return this.messageId;
    }
    public void setPayloadVersion(String payloadVersion){
        this.payloadVersion = payloadVersion;
    }
    public String getPayloadVersion(){
        return this.payloadVersion;
    }
    public void setPublishTime(String publishTime){
        this.publishTime = publishTime;
    }
    public String getPublishTime(){
        return this.publishTime;
    }
    public void setRemarks(String remarks){
        this.remarks = remarks;
    }
    public String getRemarks(){
        return this.remarks;
    }
}
