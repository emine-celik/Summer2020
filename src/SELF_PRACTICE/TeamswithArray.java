package SELF_PRACTICE;

import java.util.ArrayList;

public class TeamswithArray {

    public static void main(String[] args) {
       ArrayList<Teams> arrayList=new ArrayList<>();

        Teams[] teams={new Teams(),new Teams(),new Teams(),new Teams(),new Teams()};

        teams[0].setTeamInfo("Galatasaray ",20);
        teams[1].setTeamInfo("Fenerbahce",1);
        teams[2].setTeamInfo("Trabzon Spor",30);
        teams[3].setTeamInfo("Barcelona",150);
        teams[4].setTeamInfo("Erzurum Spor",200);

        for (int i = 0; i <= teams.length-1 ; i++) {
            teams[i].getTeamInfo();
        }










    }
}
