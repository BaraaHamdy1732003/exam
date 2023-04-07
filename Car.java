//1
public class Car {
    private String body ;
    private String enTybe;
    private String transmissoin ;
    private String color;
    private String model;
    private int price;

    public Car(){}

    public Car(String body,String enTybe,String transmissoin,String color, String model,int price){
        this.body= body;
        this.enTybe= enTybe;
        this.transmissoin= transmissoin;
        this.color= color;
        this.model= model;
        this.price= price;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getEnTybe() {
        return enTybe;
    }

    public void setEnTybe(String enTybe) {
        this.enTybe = enTybe;
    }

    public String getTransmissoin() {
        return transmissoin;
    }

    public void setTransmissoin(String transmissoin) {
        this.transmissoin = transmissoin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "body='" + body + '\'' +
                ", enTybe='" + enTybe + '\'' +
                ", transmissoin='" + transmissoin + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
