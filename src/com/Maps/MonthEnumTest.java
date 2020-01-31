package com.Maps;

public class MonthEnumTest
{
    public static void main(String[] args) {
        Months.holidaysInMonth(Months.APRIL);
        Months.dayCountOfMonth(Months.MARCH);
        Months.printMonthNames();
        Months.isHoliday(Months.MARCH, 21);
        Months.isHoliday(Months.MARCH, 8);
    }
}
