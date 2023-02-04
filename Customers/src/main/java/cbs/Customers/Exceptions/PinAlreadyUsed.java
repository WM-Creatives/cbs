package cbs.Customers.Exceptions;

public class PinAlreadyUsed extends Exception{
    public PinAlreadyUsed(){
        super("The Pin provided has already been used for an existing customer");
    }
}
