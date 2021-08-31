package com.jors.t1;

public class rectangle{
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double width;
    private double height;

    public  rectangle(){
        this(1.0,1.0);
    }

    public rectangle(double width, double height){
        this.width=width;
        this.height=height;
    }
    public double getArea(){
        return this.width*this.height;
    }
    public double getPeremeter(){
        return 2*(this.height+this.width);
    }

}
