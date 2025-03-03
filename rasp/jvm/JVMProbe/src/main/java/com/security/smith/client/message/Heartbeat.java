package com.security.smith.client.message;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Heartbeat {
    private String filter;
    private String block;
    private String limit;
    private String patch;
    private String class_filter_version;
    private String switches;
    private int discard_send;

    public Heartbeat() {
        filter = "";
        block = "";
        limit = "";
        patch = "";
        class_filter_version = "";
        switches = "";
        discard_send = 0;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getPatch() {
        return patch;
    }

    public void setPatch(String patch) {
        this.patch = patch;
    }

    public String getClassFilterVersion() {
        return class_filter_version;
    }

    public void setClassFilterVersion(String classFilterVersion) {
        this.class_filter_version = classFilterVersion;
    }

    public String getSwicthes() {
        return switches;
    }

    public void setSwitches(String switches) {
        this.switches = switches;
    }

    public synchronized int  getDiscardSend() {
        return discard_send;
    }

    public synchronized void setDiscardSend(int discard_send) {
        this.discard_send = discard_send;
    }

    public static Heartbeat fromJson(String json) {
        Gson gson = new Gson();
        return gson.fromJson(json, Heartbeat.class);
    }

    public String toJson() {
        Gson gson = new Gson();
        return gson.toJson(this);
    }

    public static Heartbeat fromJsonObject(JsonObject jsonObject) {
        Gson gson = new Gson();
        return gson.fromJson(jsonObject, Heartbeat.class);
    }

    public JsonObject toJsonObject() {
        Gson gson = new Gson();
        JsonElement jsonElement = gson.toJsonTree(this);
        return jsonElement.getAsJsonObject();
    }

    public JsonElement toJsonElement() {
        Gson gson = new Gson();
        JsonElement jsonElement = gson.toJsonTree(this);
        return jsonElement;
    }
}
