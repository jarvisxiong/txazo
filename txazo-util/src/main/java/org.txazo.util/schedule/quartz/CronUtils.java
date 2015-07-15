package org.txazo.util.schedule.quartz;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.quartz.CronExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * CronUtils
 *
 * @author txazo
 * @email txazo1218@163.com
 * @since 15.07.2015
 */
public abstract class CronUtils {

    public static boolean isValidCronExpression(String expression) {
        return getValidCronExpression(expression) != null;
    }

    public static CronExpression getValidCronExpression(String expression) {
        try {
            CronExpression cronExpression = new CronExpression(expression);
            return cronExpression;
        } catch (Exception e) {
            return null;
        }
    }

    public static boolean isExpire(String expression) {
        return CollectionUtils.isEmpty(getNextValidTimes(expression, 1));
    }

    public static List<Date> getNextValidTimes(String expression, int size) {
        CronExpression cronExpression = getValidCronExpression(expression);
        if (cronExpression == null) {
            return Collections.EMPTY_LIST;
        }

        Date current = new Date();
        Date next = null;
        List<Date> dateList = new ArrayList<Date>();
        while (size-- > 0) {
            next = cronExpression.getNextValidTimeAfter(current);
            if (next == null) {
                break;
            }
            dateList.add(current = next);
        }
        return dateList;
    }

}
