public class Iphone extends Apple {
    private String modelOfphone;
    private int priceOfPhone;

    public Iphone(String nameOfCompany, String modelOfphone, int priceOfPhone) {
        super(nameOfCompany);
        this.modelOfphone = modelOfphone;
        this.priceOfPhone = priceOfPhone;
    }

    public Iphone(String nameOfCompany) {
        super(nameOfCompany);
    }

    public String charger() {
      return "charger is 1500ap";
    }

    public String   camera() {
        return "kamera 100mege pixsel";

    }

    @Override
    public String toString() {
        return "Iphone{" +camera()+charger()+Products()+
                "modelOfphone='" + modelOfphone + '\'' +
                ", priceOfPhone=" + priceOfPhone +
                '}';
    }
}

