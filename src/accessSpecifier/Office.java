package accessSpecifier;

public class Office {

    String officeName;
    int address;

    public Office(){}
    public Office(String officeName){
        this.officeName = officeName;

    }

    public void setOfficeName(String officeName){
        this.officeName = officeName;
    }
    public Office(String officeName, int address){
        this.officeName = officeName;
        this.address = address;
    }


}
