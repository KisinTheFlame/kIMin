package tech.kisin.kimin.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtils {

    private static final SimpleDateFormat DATETIME_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static final SimpleDateFormat DASH_DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd-HH-mm-ss");

    public static String getCurrentTimeDatetimeFormat() {
        return DATETIME_DATE_FORMAT.format(new Date());
    }

    public static String getCurrentTimeDashFormat() {
        return DASH_DATE_FORMAT.format(new Date());
    }

    public static String getDatetimeFormatOf(Date date) {
        return DATETIME_DATE_FORMAT.format(date);
    }
}
