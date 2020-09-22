package WurmUpStatic;

import java.util.ArrayList;
import java.util.Arrays;

public class Local_Restaurant {
    public static void main(String[] args) {
       // Restrant restrant1=new Restrant();
       Server[] servers1={new Server(),new Server(), new Server()};
       servers1[0].setInfo("Ayse",217933,60,true);
       servers1[1].setInfo("Ferda",2345667,60,true);
       servers1[2].setInfo("Emine",45673,40,false);

      Chef[] chefs1={new Chef(),new Chef(),new Chef()};
      chefs1[0].setInfo("Ayse",2345678,45,false);
      chefs1[1].setInfo("Asli",23378,30,true);
      chefs1[2].setInfo("Zehra",1335,25,true);


        Restrant team1=new Restrant();
        team1.setInfo("Emine","Milwaukee",5);

        System.out.println();

        team1.hireServer(servers1);
        team1.hireChef(chefs1);

        System.out.println(team1);


    }
}
