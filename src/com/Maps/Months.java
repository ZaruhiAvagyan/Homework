package com.Maps;

public enum Months
{
    JANUARY(31, 1, 6, 28),
    FEBRUARY(28, 14),
    MARCH(31,  8),
    APRIL(30, 1, 7),
    MAY(30, 1,9,28),
    JUNE(30,1),
    JULY(31, 21),
    AUGUST(31),
    SEPTEMBER(30, 1),
    OCTOBER(31),
    NOVEMBER(30),
    DECEMBER(31, 31);

    private int numberOfDaysInMonth;
    private int[] publicHolidays;


    Months(int numberOfDaysInMonth,  int...publicHolidays) {

        this.numberOfDaysInMonth = numberOfDaysInMonth;
        this.publicHolidays = publicHolidays;
    }

    public int[] getPublicHolidays() {
        return publicHolidays;
    }

    public void setPublicHolidays(int[] publicHolidays) {
        this.publicHolidays = publicHolidays;
    }

    public int getNumberOfHolidaysInMonth() {
        return publicHolidays.length;
    }


    public int getNumberOfDaysInMonth() {
        return numberOfDaysInMonth;
    }

    public void setNumberOfDaysInMonth(int numberOfDaysInMonth) {
        this.numberOfDaysInMonth = numberOfDaysInMonth;
    }



    public static void holidaysInMonth(Months month)
    {
        System.out.printf("Holidays in %s are the following days: ", month);
        int[] publicHolidaysTemp = month.getPublicHolidays();
        for (int i = 0; i < publicHolidaysTemp.length; i++) {
            System.out.printf("%d  ", publicHolidaysTemp[i]);
        }
        System.out.println();
    }

    public static void dayCountOfMonth(Months month)
    {
        System.out.printf("Number of days in %s is: %d\n", month, month.getNumberOfDaysInMonth());
    }

    public static void printMonthNames()
    {
        System.out.print("Month names are: ");
        for(Months month : Months.values())
        {
            System.out.print(month + " ");
        }
        System.out.println();
    }

    public static boolean isHoliday(Months month, int day)
    {
        int[] temp = month.getPublicHolidays();
        for (int i = 0; i < temp.length; i++) {
            if(temp[i]==day) {
                System.out.printf("%s %d is public holiday\n", month, day);
                return true;
            }
            else{
                System.out.printf("%s %d is not public holiday\n", month, day);
            }
        }
        return false;
    }
}
