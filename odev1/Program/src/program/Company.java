package program;

public class Company extends Customer {

    private String taxtNumber;
    private String companyName;

    public String getTaxtNumber() {
        return taxtNumber;
    }

    public void setTaxtNumber(String taxtNumber) {
        this.taxtNumber = taxtNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }
}
