package org.lessons.java;

import org.apache.log4j.lf5.Log4JLogRecord;

public class Main {
    public static void main(String[] args) {

        Log4JLogRecord log = new Log4JLogRecord();

        log.setMessage("Messaggio di provissima");

        System.out.println(log);
    }
}