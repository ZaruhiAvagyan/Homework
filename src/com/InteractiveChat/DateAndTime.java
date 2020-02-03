package com.InteractiveChat;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime
{
    public static void getCurrentTime()
    {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/mm/yyyy hh:mm:ss");
        System.out.println(formatter.format(date));
    }

}

