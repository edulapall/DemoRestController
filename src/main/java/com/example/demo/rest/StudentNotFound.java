package com.example.demo.rest;

public class StudentNotFound {


    private int status;
    private String message;
    private String timestamp;


    public StudentNotFound() {
    }

    public StudentNotFound(String timestamp, String message, int status) {
        //this.timestamp = timestamp;
      //  this.status = status;
        this.message = message;

    }

   // public String getTimestamp() {
    //    return timestamp;
   // }

   // public void setTimestamp(String timestamp) {
  //      this.timestamp = timestamp;
  //  }

   public int getStatus() {
       return status;
   }

    public void setStatus(int status) {
       this.status = status;
   }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}


