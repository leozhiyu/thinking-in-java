package com.leozzy.eleven;

/**
 * Created by Leo
 */

// 手机颜色
class Color{
    private String name;

    public Color(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class Phone implements Cloneable{
    private Color phoneColor; // 手机颜色
    private String phoneName; // 手机名称
    private double phonePrice; // 手机价格

    public Phone(Color phoneColor, String phoneName, double phonePrice) {
        this.phoneColor = phoneColor;
        this.phoneName = phoneName;
        this.phonePrice = phonePrice;
    }

    public Color getPhoneColor() {
        return phoneColor;
    }
    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }
    public void setPhonePrice(double phonePrice) {
        this.phonePrice = phonePrice;
    }

    //输出手机的信息
    public void print(){
        System.out.println(phoneName + " => 颜色: " + phoneColor.getName() + " ，价格： " + phonePrice);
    }

    @Override
    public Phone clone(){
        Phone yourPhone = null;
        try {
            yourPhone = (Phone) super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return yourPhone;
    }

    public static void main(String[] args) {
        Phone myPhone = new Phone(new Color("黑色"),"iPhone6",4000);
        myPhone.print();
        Phone yourPhone = myPhone.clone();
        yourPhone.setPhoneName("更厉害的iPhone6");
        yourPhone.setPhonePrice(4600);
        yourPhone.getPhoneColor().setName("玫瑰金");
        myPhone.print();
        yourPhone.print();
    }
}
