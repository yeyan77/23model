package com.crystal.main.factory;

/**
 * Created by hp on 2017-05-31.
 */
public class MainboardFactory {
    public static Mainboard createMainboard(int type){
        Mainboard mainboard = null;
        if(type == 1){
            mainboard = new IntelMainbard(755);
        }else if(type == 2){
            mainboard = new AmdMainboard(938);
        }
        return mainboard;
    }
}
