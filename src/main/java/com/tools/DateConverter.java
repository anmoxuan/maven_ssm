package com.tools;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConverter implements Converter<String,Date>{
    private String format;

    public void setFormat(String format) {
        this.format = format;
    }

    @Override
    public Date convert(String s) {
        Date dd=null;
        try {
            dd=new SimpleDateFormat(format).parse(s);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dd;
    }
}
