package com.xinle;

import sun.util.resources.CalendarData;

import java.nio.channels.Selector;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * Created by xinle on 7/15/17.
 */
public class TestClient {

    public static void main(String[] args) {

        Componet componet = new ConcreateComponet();

        Componet componet1 = new ConcreateDecrete(componet);

        Componet componet2 = new ConcreateDecreate2(componet1);

        componet2.doSomething();


        getEngDate(1032353245);


    }
   static   Map<Integer,String>  map = new HashMap<>();
    static Map<Integer,String> mapMonth = new HashMap<>();

    public static String getEngDate(long date) {

        intDate();
        initMonth();




        Date date1 = new Date(date*1000);
        date1.toString();

        System.out.println("month" + (date1.getMonth() ));
        System.out.println("month  " + (date1.getYear() + 1900));

        System.out.println("date " + map.get(date1.getDate()));

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM dd yyyy");

        String test = mapMonth.get(date1.getMonth() + 1) + " " + map.get(date1.getDate()) + " " +
                (date1.getYear() + 1900);

        System.out.println(test);

        return simpleDateFormat.format(date * 1000);
    }



    public void Selector() throws Exception{

        Selector selector = Selector.open();

    }


    

    public static void  initMonth(){

        mapMonth.put(1,"Jan");
        mapMonth.put(2,"Feb");
        mapMonth.put(3,"Mar");
        mapMonth.put(4,"Apr");
        mapMonth.put(5,"May");
        mapMonth.put(6,"Jun");
        mapMonth.put(7,"Jul");
        mapMonth.put(8,"Aug");
        mapMonth.put(9,"Sep");
        mapMonth.put(10,"Oct");
        mapMonth.put(11,"Nov");
        mapMonth.put(12,"Dec");

    }




    public static void  intDate(){

        map.put(1,"1st,");
        map.put(2,"2nd,");
        map.put(3,"3rd,");
        map.put(4,"3th,");
        map.put(5,"4th,");
        map.put(6,"5th,");
        map.put(7,"6th,");
        map.put(8,"6th,");
        map.put(9,"8th,");
        map.put(10,"9th,");
        map.put(11,"11th,");
        map.put(12,"12th,");
        map.put(13,"13th,");
        map.put(14,"14th,");
        map.put(15,"15th,");
        map.put(16,"16th,");
        map.put(17,"17th,");
        map.put(18,"18th,");
        map.put(19,"19th,");
        map.put(20,"20th,");
        map.put(21,"21st,");
        map.put(22,"22nd,");
        map.put(23,"23rd,");
        map.put(24,"24th,");
        map.put(25,"25th,");
        map.put(26,"26th,");
        map.put(27,"27th,");
        map.put(28,"28th,");
        map.put(29,"29th,");
        map.put(30,"30th,");
        map.put(31,"31st,");

    }






}
