package com.example.clonecoding.alarm;

public class AlarmDTO {
    private String alarm_content, alarm_date;

    public AlarmDTO(String alarm_content, String alarm_date) {
        this.alarm_content = alarm_content;
        this.alarm_date = alarm_date;
    }

    public String getAlarm_content() {
        return alarm_content;
    }

    public void setAlarm_content(String alarm_content) {
        this.alarm_content = alarm_content;
    }

    public String getAlarm_date() {
        return alarm_date;
    }

    public void setAlarm_date(String alarm_date) {
        this.alarm_date = alarm_date;
    }
}
