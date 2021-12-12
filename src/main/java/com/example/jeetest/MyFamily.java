package com.example.jeetest;

public class MyFamily extends MySelf implements MyVehicle
{
    public String MyDad;
    public String MyMom;
    public String MySiblings;

    public MyFamily(String myName, int myAge, String myHobbies, String myHometown, String myDad, String myMom, String mySiblings)
    {
        super(myName, myAge, myHobbies, myHometown);
        MyDad = myDad;
        MyMom = myMom;
        MySiblings = mySiblings;
    }

    public String getMyDad()
    {
        return MyDad;
    }

    public void setMyDad(String myDad)
    {
        MyDad = myDad;
    }

    public String getMyMom()
    {
        return MyMom;
    }

    public void setMyMom(String myMom)
    {
        MyMom = myMom;
    }

    public String getMySiblings()
    {
        return MySiblings;
    }

    public void setMySiblings(String mySiblings)
    {
        MySiblings = mySiblings;
    }


}
