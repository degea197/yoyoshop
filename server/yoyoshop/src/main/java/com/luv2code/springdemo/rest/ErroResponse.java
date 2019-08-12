/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.luv2code.springdemo.rest;

/**
 *
 * @author chauc
 */

public class ErroResponse {
    
    private int status;
    private String mess;
    private long timeStamp;

    public ErroResponse() {
    }

    public ErroResponse(int status, String mess, long timeStamp) {
        this.status = status;
        this.mess = mess;
        this.timeStamp = timeStamp;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }

    public long getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(long timeStamp) {
        this.timeStamp = timeStamp;
    }
    
    
}
