package DesignPatternAug2023.Creational.ShallowDeepCopy;

public class EmployeeAddress {


    public int houseNo;
    public String streeName;
    public String city;


    EmployeeAddress(int houseNo, String streeName, String city) {
        this.houseNo = houseNo;
        this.streeName = streeName;
        this.city = city;
    }


    public String toString() {
        return "House No : " + houseNo + " Street Name : " + streeName + " City : " + city;
    }
}
