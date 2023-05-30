enum Arsenalplayer {
    Ramsdale(1,"England"), Saliba(12,"France"), Xhaka(34,"Switzerland"), Saka(7,"England");
    private static final Arsenalplayer[] gunners = Arsenalplayer.values();
    private final int backnumber;
    private final String nation;
    Arsenalplayer(int backnumber, String nation) {
        this.backnumber = backnumber;
        this.nation = nation;
    }
    public int getBacknumber() { return backnumber; }
    public String getNation() { return nation; }

    public static Arsenalplayer of(int x) {
        if (x < 1 || x > 4)
            throw new IllegalArgumentException("Invalid value : " + x);

        return gunners[x - 1];
    }
    public String toString() {
        return name() + getNation();
    }
}

public class Enum {
    public static void main(String[] args) {
        for(Arsenalplayer ap : Arsenalplayer.values())
            System.out.printf("%s=%d%n", ap.name(), ap.getBacknumber());

        Arsenalplayer ap1 = Arsenalplayer.Xhaka;
        Arsenalplayer ap2 = Arsenalplayer.of(2);

        System.out.printf("ap1=%s, %d, %s%n", ap1.name(), ap1.getBacknumber(), ap1.getNation());
        System.out.printf("ap2=%s, %d, %s%n", ap2.name(), ap2.getBacknumber(), ap2.getNation());

    }
}



