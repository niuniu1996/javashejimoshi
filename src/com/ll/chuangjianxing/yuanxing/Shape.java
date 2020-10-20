package com.ll.chuangjianxing.yuanxing;

/**
 * @author 奥特曼
 * @version 1.0
 * @date 2020/10/20 0020 下午 15:00
 */
public abstract class Shape implements Cloneable{
    private String id;
    protected String type;

    abstract void draw();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
