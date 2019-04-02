package com.hjs.beantomap;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {



    public static boolean check(Date min1, Date max1,Date min2,Date max2){

        if(min1.compareTo(max2) >0 || max1.compareTo(min2) <0){
            return false;
        }

        return true;

    }

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println(check(sdf.parse("2017-12-31"),
                                    sdf.parse("2019-10-31"),
                                    sdf.parse("2017-11-31"),
                                    sdf.parse("2019-12-31")
                                ));

    }

}
