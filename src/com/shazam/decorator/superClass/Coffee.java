package com.shazam.decorator.superClass;

//被装饰者的超类
abstract public class Coffee {
    public String description = "";

    public int size;

    public String getDescription() {
        return description;
    }

    abstract public double cost();

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public enum Size{

        BIG(3,"大份"),MIDDLE(2,"中份"),SMALL(1,"小份");

        private String dsc;
        private int code;
        private Size(int code,String dsc){
            this.dsc = dsc;
            this.code = code;
        }

        public String getDsc() {
            return dsc;
        }

        public void setDsc(String dsc) {
            this.dsc = dsc;
        }

        public int getCode() {
            return code;
        }

        public void setCode(int code) {
            this.code = code;
        }
    }
}
