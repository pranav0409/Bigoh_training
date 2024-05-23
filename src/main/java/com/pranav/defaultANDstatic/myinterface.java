package com.pranav.defaultANDstatic;

public interface myinterface
{
    public void abstractmethod();

    default void defaultMethod()
    {
        System.out.println("default method");
    }
}
