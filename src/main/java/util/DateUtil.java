package util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by zcy on 2017/5/22.
 *
 */
public class DateUtil {
    private static String[] holidays = new String[]{"04-04","04-05","04-06","05-01","05-02","05-03","10-01","10-02","10-03","10-04","10-05","10-06","10-07"};

    public static boolean isHoliday(Date d){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String date = simpleDateFormat.format(d).substring(5);
        for (String holiday : holidays) {
            if (holiday.equals(date)) {
                return true;
            }
        }
        return false;
    }
}
