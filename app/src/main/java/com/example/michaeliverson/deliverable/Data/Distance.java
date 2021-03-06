
package com.example.michaeliverson.deliverable.Data;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Distance implements Serializable
{

    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("value")
    @Expose
    private long value;
    private final static long serialVersionUID = 279030794330453586L;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Distance withText(String text) {
        this.text = text;
        return this;
    }

    public long getValue() {
        return value;
    }

    public void setValue(long value) {
        this.value = value;
    }

    public Distance withValue(long value) {
        this.value = value;
        return this;
    }

}
