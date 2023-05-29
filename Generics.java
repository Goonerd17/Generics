import java.util.*;

public class Generics {
    public static void main(String[] args) {
        ArrayList<Player> list = new ArrayList<Player>();

        list.add(new Foward("Gabriel Jesus",28,9,30));
        list.add(new Foward("Bukayo Saka", 24,8,44));
        list.add(new Foward("Leandro Trosaar", 29,7,19));

        Iterator<Player> it = list.iterator();
        while (it.hasNext()) {
            Player p = it.next();

            System.out.println(p.name);
        }


    }
}

class Player{
    String name = "";
    int age;

    Player(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
class Foward extends Player{
    int skillpoint;
    int game;


    Foward (String name, int age, int skillpoint, int game) {
        super(name,age);
        this.skillpoint = skillpoint;
        this.game = game;
    }
}
