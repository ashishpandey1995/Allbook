package com.example.ashish_pc.allbook;

/**
 * Created by ashish_pc on 2/12/2016.
 */
public class product {
    private String name;
    private String offer;
    private int price;
    private int id;
    private String author;

    public product(String name,String author,int price,String offer,int id)
    {
        super();
        this.name=name;
        this.author=author;
        this.price=price;
        this.offer=offer;
        this.id=id;

    }
    public String getname()
    {
        return name;
    }

    public String getauthor()
    {
        return author;
    }

    public int getprice()
    {
        return price;
    }

    public String getoffer()
    {
        return offer;
    }
    public int getid()
    {
        return id;
    }

}
