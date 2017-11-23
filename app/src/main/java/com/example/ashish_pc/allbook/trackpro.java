package com.example.ashish_pc.allbook;

/**
 * Created by ashish_pc on 2/13/2016.
 */
public class trackpro {

    private String name;
    private int price;
    private int id;
    private int id2;
    private String status;

    public trackpro(String name,String status,int price,int id,int id2)
    {
        super();
        this.name=name;
        this.status=status;
        this.price=price;
        this.id=id;
        this.id2=id2;

    }
    public String getname()
    {
        return name;
    }

    public String getstatus()
    {
        return status;
    }

    public int getprice()
    {
        return price;
    }

    public int getid()
    {
        return id;
    }
    public int getid2()
    {
        return id2;
    }

}
