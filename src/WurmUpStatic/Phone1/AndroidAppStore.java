package WurmUpStatic.Phone1;
/*
1. create an interface named AndroidAppStore
            variable: AppStoreName
            abstract method: downloadAndroidApp();

    2. create an interface named AppleAppStore
            variable: AppStoreName
            abstract method: downloadAppleApp();

    4. create a class named iPhone that can inherit from AppleApps and Phone
            actions: texting(), calling(), faceTiming()
            if the price of Iphoen is more than 1500, the system should throw an exception with a message of:
                    Invalid Price, Iphone' price cannot more than 1500
    5. create a class named Samsung that can inherit from AndroidApps and Phone
            actions: texting(), calling(), freezing()
             if the price of Samsung is more than 1200, the system should throw an exception with a message of:
                    Invalid Price, Samsung' price cannot more than 1200

 */
public  interface AndroidAppStore {

    public String AppStoreName ="";
    public abstract String downloadAndroidApp();




}
