package com.example.ashwin.androidfirebasetest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by ashwin on 9/9/16.
 */

//@JsonIgnoreProperties
public class Person
{
    //name and address string
    private String name;
    private String address;
    private String key;

    public Person()
    {
      /*Blank default constructor essential for Firebase*/
    }

    //Getters and setters
    public String getKey()
    {
        return key;
    }

    public void setKey(String key)
    {
        this.key = key;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    @Override
    public String toString()
    {
        return "Person:  name: "+name+ ", address: " +address;
    }
}
