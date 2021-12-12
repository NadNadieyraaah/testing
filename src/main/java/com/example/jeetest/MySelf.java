package com.example.jeetest;

public class MySelf implements MyVehicle
{
    public String MyName;
    public int MyAge;
    public String MyHobbies;
    public String MyHometown;

    public MySelf(String myName, int myAge, String myHobbies, String myHometown)
    {
        MyName = myName;
        MyAge = myAge;
        MyHobbies = myHobbies;
        MyHometown = myHometown;
    }

    public String getMyName()
    {
        return MyName;
    }

    public void setMyName(String myName)
    {
        MyName = myName;
    }

    public int getMyAge()
    {
        return MyAge;
    }

    public void setMyAge(int myAge)
    {
        MyAge = myAge;
    }

    public String getMyHobbies()
    {
        return MyHobbies;
    }

    public void setMyHobbies(String myHobbies)
    {
        MyHobbies = myHobbies;
    }

    public  String getMyHometown()
    {
        return MyHometown;
    }

    public void setMyHometown(String myHometown)
    {
        MyHometown = myHometown;
    }


}
