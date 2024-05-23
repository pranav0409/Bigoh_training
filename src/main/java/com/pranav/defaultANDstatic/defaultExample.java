package com.pranav.defaultANDstatic;

public class defaultExample implements myinterface {
    public void abstractmethod()
    {
        System.out.println("this is abstract method");
    }

    @Override
    public void defaultMethod()
    {
        System.out.println("this is overriden default method");
    }

    public static void main(String[] args) {
        defaultExample obj = new defaultExample();
        obj.abstractmethod();
        obj.defaultMethod();
    }
}
