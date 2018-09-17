package cs2340.gatech.edu.lab3.model;

public enum ClassStanding {
    FRESHMAN("FR"),
    SOPHOMORE("SO"),
    JUNIOR("JR"),
    SENIOR("SR");

    private String code;

    ClassStanding(String code) {
        this.code = code;
    }
}
