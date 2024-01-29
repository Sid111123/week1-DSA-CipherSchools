import java.util.*;

interface A
{
    int var = 100;
    void func();
}
interface B
{
    int var = 55;
    void func();
}

interface C extends A,B    // Multiple inheritance
{
    int var = 99;
    void func();
}

class Sample implements C
{
    public void func()
    {
        System.out.println("In class C");
    }
}

class Lecture14
{
    public static void main(String t[])
    {
        Sample obj = new Sample();
        obj.func();
    }
}
