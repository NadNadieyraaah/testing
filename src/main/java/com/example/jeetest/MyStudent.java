package com.example.jeetest;

public class MyStudent extends MySelf implements MyVehicle
{
    public String MyMatricNo;
    public String MyProgramCode;
    public String MyCampus;

    public MyStudent(String myName, int myAge, String myHobbies, String myHometown, String myMatricNo, String myProgramCode, String myCampus)
    {
        super(myName, myAge, myHobbies, myHometown);
        MyMatricNo = myMatricNo;
        MyProgramCode = myProgramCode;
        MyCampus = myCampus;
    }

    public String getMyMatricNo()
    {
        return MyMatricNo;
    }

    public void setMyMatricNo(String myMatricNo)
    {
        MyMatricNo = myMatricNo;
    }

    public String getMyProgramCode()
    {
        return MyProgramCode;
    }

    public void setMyProgramCode(String myProgramCode)
    {
        MyProgramCode = myProgramCode;
    }

    public String getMyCampus()
    {
        return MyCampus;
    }

    public void setMyCampus(String myCampus)
    {
        MyCampus = myCampus;
    }


}
