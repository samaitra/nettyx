package com.nettyx;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: saikat
 * Date: 05/08/13
 * Time: 3:09 PM
 * To change this template use File | Settings | File Templates.
 */
public class Time {

    private final int value;

    public Time() {
        this((int) (System.currentTimeMillis() / 1000L + 2208988800L));
    }

    public Time(int value) {
        this.value = value;
    }

    public int value() {
        return value;
    }

    @Override
    public String toString() {
        return new Date((value() - 2208988800L) * 1000L).toString();
    }
}
