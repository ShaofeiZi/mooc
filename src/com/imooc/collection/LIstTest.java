package com.imooc.collection;

/**
 * Created by zishaofei on 2017/8/23.
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 备选课程
 */
public class ListTest {
    /**
     * 用于存放备选课程的List
     */
    public List coursesToSelect;
    public ListTest(){
        this.coursesToSelect=new ArrayList();
    }

    /**
     * 往coursesToSelect添加课程
     */
    public void TeseAdd(){
        // 创建一个课程对象，通过调用add方法，添加到备选课程List
        Course cr1=new Course("1","数据结构");
        coursesToSelect.add(cr1);
        Course temp = (Course)coursesToSelect.get(0);
        System.out.print("添加了课程:" + temp.id+";"+temp.name+"\n");
        Course cr2 = new Course("2","C语言");
        coursesToSelect.add(0,cr2);
        Course temp2 = (Course)coursesToSelect.get(0);

        System.out.print("添加了课程:" + temp2.id+";"+temp2.name+"\n");
        Course cr3 =new Course("3","567890");
        coursesToSelect.add(cr3);
        Course[] coureses = {new Course("4","离散数学"),new Course("5","汇编")};
        for(Course courese :coureses){
            System.out.print("添加了课程:" + courese.id+";"+courese.name+"\n");
        }
        Course[] coureses2 = {new Course("6","高等数学"),new Course("7","超级汇编")};
        coursesToSelect.addAll(2, Arrays.asList(coureses2));
        for(Course courese2 :coureses2){
            System.out.print("添加了课程:" + courese2.id+";"+courese2     .name+"\n");
        }





    }

    /**
     * 取得List中的元素
     * @param args
     */
    public void testGet(){
        System.out.print("通过for循环访问 有以下选择\n");

        int size = coursesToSelect.size();
        for(int i =0 ;i<size;i++){
            Course tempcourse=(Course)coursesToSelect.get(i);
            System.out.print("添加了课程:" + tempcourse.id+";"+tempcourse.name+"\n");
        }
    }

    /**
     * t通过迭代器便利List
     * @param args
     */
    public void testIterator(){
        Iterator it=coursesToSelect.iterator();
        System.out.print("通过迭代器访问 有以下选择\n");

        while (it.hasNext()){
            Course cr = (Course)it.next();
            System.out.print("添加了课程:" + cr.id+";"+cr.name+"\n");

        }
    }

    /**
     * foreach方法
     * @param args
     */
    public void testForEach(){
        System.out.print("通过foreach访问 有以下选择\n");

        for(Object obj :coursesToSelect){
            Course temp =(Course)obj;
            System.out.print("添加了课程:" + temp.id+";"+temp.name+"\n");

        }
    }
    public static void main(String[] args){
        ListTest lt =new ListTest();
        lt.TeseAdd();
        lt.testGet();
        lt.testIterator();
        lt.testForEach();
    }
}
