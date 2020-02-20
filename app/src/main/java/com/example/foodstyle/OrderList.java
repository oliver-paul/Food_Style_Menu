package com.example.foodstyle;

public class OrderList{
    String text;int Qtext,ptext;

    public OrderList(String text,int text2,int text3)
    {
        this.text = text;
        Qtext=text2;
        ptext=text3;
    }

    public void setText(String text,int text2,int text3)
    {
        this.text = text;
        Qtext=text2;
        ptext=text3;
    }

    public String getText(){
        return text;
    }

    public int getQText(){
        return Qtext;
    }

    public int getPText(){
        return ptext;
    }
}