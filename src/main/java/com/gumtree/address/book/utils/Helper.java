package com.gumtree.address.book.utils;


import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Helper {

    public final static String DATE_FORMAT = "dd/MM/yy";

    public static Date convertStringToDate(String date) throws ParseException {
        DateFormat format = new SimpleDateFormat(DATE_FORMAT, Locale.ENGLISH);
        return format.parse(date);
    }


}
