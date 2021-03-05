package accessSpecifier;

public class TestOffice {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int additionResult = cal.addition(10, 100);
        System.out.println("addtionResults");

        cal.task(10, 1000);

        Office office = new Office("EBAY");
        System.out.println("office.officeName");


        Office yourOffice = new Office();
        yourOffice.setOfficeName("Google");
        System.out.println(yourOffice.officeName);


    }
}
