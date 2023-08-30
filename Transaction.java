package com.fix;

public class Transaction
{  
    private String Accno;  
    private String name;  
    private String acc_type;  
    private long balance;      
    public String getAccno()
    {
        return Accno;
    }
    public void setAccno(String Accno)
    {
        this.Accno=Accno;
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public String getAcc_type()
    {
        return acc_type;
    }
    public void setAcc_type(String acc_type)
    {
        this.acc_type=acc_type;
    }
    public long getBalance()
    {
        return balance;
    }
    public void setBalance(long balance)
    {
        this.balance=balance;
    }      
}