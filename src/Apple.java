public class Apple {
    private String nameOfCompany;

    public Apple(String nameOfCompany) {
        this.nameOfCompany = nameOfCompany;
    }

    public String Products() {

return "it is a first product";
    }


    public String getNameOfCompany() {
        return nameOfCompany;
    }

    @Override
    public String toString() {
        return "Apple{" +
                "nameOfCompany='" + nameOfCompany + '\'' +
                '}';
    }
}
