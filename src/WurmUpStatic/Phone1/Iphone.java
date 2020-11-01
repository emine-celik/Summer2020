package WurmUpStatic.Phone1;
/*
4. create a class named iPhone that can inherit from AppleApps and Phone
            actions: texting(), calling(), faceTiming()
            if the price of Iphoen is more than 1500, the system should throw an exception with a message of:
                    Invalid Price, Iphone' price cannot more than 1500
 */
public class Iphone extends Phone implements AppleAppStore {


    public Iphone(String brand, String model, double price, String size) {
        super(brand, model, price, size);
        if( price > 1500){
            throw new RuntimeException("Invalid Price, Iphone' price cannot more than 1500");
        }
    }


    @Override
    public String downloadAppleApp() {
        return null;
    }

    @Override
    public void texting() {
        System.out.println(brand+" is texting");
    }

    @Override
    public void calling() {
        System.out.println(brand+" is calling");

    }

    public void faceTiming(){
        System.out.println(brand+" is faceTiming");
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
