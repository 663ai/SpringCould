package com.test.controller;

import java.util.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testController {

    @RequestMapping(value = "/test")
    public void test(){
        List<Integer> arr = new ArrayList<>();// 建一个无序的数组
        arr.add(2);
        arr.add(5);
        arr.add(3);
        arr.add(8);
        arr.add(324);
        arr.add(22);
        arr.add(223);
        arr.add(636);
        arr.add(44);
        Long sum = 0L;
        Date sdate = new Date();
        SortThread sortThread = new SortThread(arr, sdate, sum);
        sortThread.run();
    }
//
//    public static void main(String[] args) {
//        List<Integer> arr = new ArrayList<>();// 建一个无序的数组
//        arr.add(2);
//        arr.add(5);
//        arr.add(3);
//        arr.add(8);
//        arr.add(324);
//        arr.add(22);
//        arr.add(223);
//        arr.add(636);
//        arr.add(44);
//        arr.add(7);
//        arr.add(23);
//        arr.add(21);
//        arr.add(444);
//        arr.add(6236);
//        arr.add(441);
//
//        Long sum = 0L;
//        Date sdate = new Date();
//        SortThread sortThread = new SortThread(arr, sdate, sum);
//        sortThread.run();
//        SortThread1 sortThread1 = new SortThread1(arr, sdate, sum);
//        sortThread1.run();
//    }
}

// 排序线程
class SortThread extends Thread {
    List<Integer> arr = null;
    Thread t = null;
    Date startDate = null;
    Long sum = 0L;


    public SortThread(List<Integer> arr, Date startDate, Long sum) {
        this.arr = arr;
        this.startDate = startDate;
        this.sum = sum;
    }

    public void run() {
        Collections.shuffle(arr);// 随机打乱
        System.out.println(arr);
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) < arr.get(i + 1)) {
                continue;
            } else {
                sum++;
                new SortThread(arr, startDate, sum).start();
                return;// 结束当前线程
            }

        }
        System.err.println("花了" + (new Date().getTime() - startDate.getTime()) + "ms时间,排序数组元素个数:" + arr.size() + ",共进行了"
                + sum + "次");

    }

}


// 排序线程
class SortThread1 extends Thread {
    List<Integer> arr = null;
    Thread t = null;
    Date startDate = null;
    Long sum = 0L;


    public SortThread1(List<Integer> arr, Date startDate, Long sum) {
        this.arr = arr;
        this.startDate = startDate;
        this.sum = sum;
    }

    public void run() {
        Collections.shuffle(arr);// 随机打乱
        System.out.println(arr+" <>---");
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) < arr.get(i + 1)) {
                continue;
            } else {
                sum++;
                new SortThread(arr, startDate, sum).start();
                return;// 结束当前线程
            }

        }
        System.err.println("花了" + (new Date().getTime() - startDate.getTime()) + "ms时间,排序数组元素个数:" + arr.size() + ",共进行了"
                + sum + "次");

    }


}
