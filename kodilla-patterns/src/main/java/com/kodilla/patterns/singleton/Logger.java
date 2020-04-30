package com.kodilla.patterns.singleton;

public class Logger {

    private static Logger loggerInstatnce = null;
    private String lastLog = "";

    private Logger() {
    }

    public static Logger getInstance() {

        if (loggerInstatnce == null) {

            synchronized (Logger.class) {

                if ((loggerInstatnce == null))

                    loggerInstatnce = new Logger();
            }
        }

        return loggerInstatnce;
    }

    public void log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
    }

    public String getLastLog() {
        return lastLog;
    }
}
