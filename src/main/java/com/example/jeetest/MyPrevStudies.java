package com.example.jeetest;

public class MyPrevStudies extends MySelf implements MyVehicle
{
    public double MyCGPA;
    public String MyPrevProgram;
    public String MyPrevCampus;
    public String MyFavCourse;

    public MyPrevStudies(String myName, int myAge, String myHobbies,String myHometown, double myCGPA, String myPrevProgram, String myPrevCampus, String myFavCourse)
    {
        super(myName, myAge, myHobbies, myHometown);
        MyCGPA = myCGPA;
        MyPrevProgram = myPrevProgram;
        MyPrevCampus = myPrevCampus;
        MyFavCourse = myFavCourse;
    }

    public double getMyCGPA()
    {
        return MyCGPA;
    }

    public void setMyCGPA(double myCGPA)
    {
        MyCGPA = myCGPA;
    }

    public String getMyPrevProgram()
    {
        return MyPrevProgram;
    }

    public void setMyPrevProgram(String myPrevProgram)
    {
        MyPrevProgram = myPrevProgram;
    }

    public String getMyPrevCampus()
    {
        return MyPrevCampus;
    }

    public void setMyPrevCampus(String myPrevCampus)
    {
        MyPrevCampus = myPrevCampus;
    }

    public String getMyFavCourse()
    {
        return MyFavCourse;
    }

    public void setMyFavCourse(String myFavCourse)
    {
        MyFavCourse = myFavCourse;
    }


}
