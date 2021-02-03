package com.company;

public class Member extends Person {
    boolean isBasic;
    String memberType;
    int memberFee;

    public Member(String name, String cpr, boolean isBasic) {
        super(name, cpr);
        this.isBasic = isBasic;
        if (isBasic){
            memberType = "Basic";
            memberFee = 199;
        } else {
            memberType = "Full";
            memberFee = 299;
        }

    }

    @Override
    public String toString() {
        return name + "  " + cpr + "  " + memberType + "  " + memberFee;

    }
}
