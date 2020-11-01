package WurmUpStatic.Phone1;
/*
5. create a class named Samsung that can inherit from AndroidApps and Phone
            actions: texting(), calling(), freezing()
             if the price of Samsung is more than 1200, the system should throw an exception with a message of:
                    Invalid Price, Samsung' price cannot more than 1200

 */
public class Samsung extends Phone implements AndroidAppStore{


    public Samsung(String brand, String model, double price, String size) {
        super(brand, model, price, size);
        if(price < 1200){
            throw new RuntimeException("Invalid Price, Samsung' price cannot more than 1200");
        }

    }

    @Override
    public String downloadAndroidApp() {
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

    public void freezing(){
        System.out.println(brand + " is freezing");
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }
}
