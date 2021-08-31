package com.jors.t1;

public class member {
    public int getOutX() {
        return outX;
    }

    public void setOutX(int outX) {
        this.outX = outX;
    }

    private int outX;
    class inner{
        public inner( int x){
            this.x=x;
        }
        public int getX() {
            System.out.println(outX);
            return x;
        }

        public void setX(int x) {
            this.x = x;
        }

        private int x;

    }
    public void demo(){
        inner inX1 = new inner(3);
        inner inX11 = new inner(7);
        System.out.println(inX1.getX());
        //inX11.getX();
    }
}
