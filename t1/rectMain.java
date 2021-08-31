package com.jors.t1;

import java.util.Scanner;

public class rectMain{
     public static void main(String[] args){
         rectangle[] rec= new rectangle[3];
         for(int i=0;i<rec.length;i++) {
             rectData(rec,i);
         }
         rectDetail(rec);



     }
     public static void rectData(rectangle[] rec,int i){
             Scanner sc = new Scanner(System.in);
             System.out.println("yes or no");
             char choice= sc.next().charAt(0);
             if(choice=='y') rec[i]= new rectangle(sc.nextDouble(),sc.nextDouble());
             else rec[i]= new rectangle();
     }
     public static void rectDetail(rectangle[] re){
         for(int j=0;j<re.length;j++){
             System.out.println(re[j].getHeight()+" "+ re[j].getWidth()+" "+re[j].getArea());
         }

     }
 }