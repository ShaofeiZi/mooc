package com.imooc.collection;

/**
 * Created by zishaofei on 2017/8/23.
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
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
    public static void main(String[] args){
        ListTest lt =new ListTest();
        lt.TeseAdd();
    }
}
