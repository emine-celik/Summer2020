package SELF_PRACTICE.Abstacrt.SoccorTask;

public abstract class Team {



        protected abstract void run();

        public abstract void gol();


        String name;
        int IdNumber;

    public Team(String name, int idNumber) {
        this.name = name;
        IdNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Team{" +
                "name='" + name + '\'' +
                ", IdNumber=" + IdNumber +
                '}';
    }
}

