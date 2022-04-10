package org.eufranio.javaoneforall.Kenum.domain;

public enum CustomerType {
    INDIVIDUAL(1, "Individual"),
    COMPANY(2),
    START_UP(3);

    public final int DB_VALUE;
    public final String PRETTY_NAME;

    CustomerType(int dbValue) {
        this.DB_VALUE = dbValue;
        this.PRETTY_NAME = null;
    }
    CustomerType(int dbValue, String prettyName) {
        this.DB_VALUE = dbValue;
        this.PRETTY_NAME = prettyName;
    }
    public static CustomerType getCustomerType(String reportValue) {
        for(CustomerType customerType : values()) {
            if (customerType.PRETTY_NAME != null && customerType.PRETTY_NAME.equalsIgnoreCase(reportValue)) {
                return customerType;
            }
        }
        return null;
    }
}
