package cbs.Accounts.Utils.Enums;

public enum AccountFunctions {
    OPEN("OPEN"),
    INQUIRE("INQUIRE"),
    CLOSE("CLOSE"),
    MODIFY("MODIFY"),
    APPROVE("APPROVE");

    private final String function;

    AccountFunctions(String function){
        this.function = function;
    }

    public String getFunction(){
        return function;
    }
}
