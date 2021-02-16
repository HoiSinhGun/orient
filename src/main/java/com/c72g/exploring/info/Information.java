package com.c72g.exploring.info;

import javax.sound.sampled.Line;
import javax.swing.border.TitledBorder;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Information {

    String header;
    String content;
    // Data data; will we make a difference between data and information?
    // List<Information> subInformation;
    String footer;
    Date created_on = new Date();


    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFooter() {
        return footer;
    }

    public void setFooter(String footer) {
        this.footer = footer;
    }

    public Date getCreated_on() {
        return created_on;
    }

    public void setCreated_on(Date created_on) {
        this.created_on = created_on;
    }

    /*final SimpleDateFormat format =
            new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
*/}
