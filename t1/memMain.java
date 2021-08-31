package com.jors.t1;

public class memMain {
    public static void main(String[] args){
        member mem=new member();
        member.inner inX=mem.new inner(5);
        member.inner inxx = mem.new inner(8);
        System.out.println(inX.getX());
       // System.out.println(inX.getX());
        mem.setOutX(8);
        //System.out.println(mem.getOutX());
         mem.demo();

    }
}
