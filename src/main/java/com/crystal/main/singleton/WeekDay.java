package com.crystal.main.singleton;

/**
 * Created by hp on 2017-06-01.
 */
public abstract class WeekDay {
    public static final WeekDay SUN = new WeekDay(){

        public WeekDay nextDay() {
            return MON;
        }
    };

    public static final WeekDay MON = new WeekDay() {
        @Override
        public WeekDay nextDay() {
            return SUN;
        }
    };

    @Override
    public String toString() {
        return this == SUN ? "SUN星期天":"MON星期一";
    }

    public abstract WeekDay nextDay();

}
