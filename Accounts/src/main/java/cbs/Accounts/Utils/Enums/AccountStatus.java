package cbs.Accounts.Utils.Enums;

public enum AccountStatus {
    OPEN("OPEN"),
    CLOSED("CLOSED"),
    DELETED("DELETED"),
    ACTIVE("ACTIVE"),
    FROZEN("FROZEN");

    private final String status;

    AccountStatus(String status){
        this.status = status;
    }

    public String getStatus() {
        return status;
    }
}
