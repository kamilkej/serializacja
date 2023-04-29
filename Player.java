import java.io.Serializable;


public class Player implements Serializable{
    private static final long serialVersionUID = 1L;
    private String name;
    private String armLeft;
    private String armRight;
    private int hp;
    private int level;

    public Player(String name, int hp, int level){
        this.name = name;
        this.hp = hp;
        this.level = level;
    }



    public void useRight(String item){
        this.armRight = item;
    }


    
    public void useLeft(String item){
        this.armLeft = item;
    }

    @Override
    public String toString(){
        return "UID: " + this.serialVersionUID + "\br NAZWA: " + this.name + "\br HP: "+ this.hp + "\br POZIOM: " + this.level + "\br armLeft: " + this.armLeft + "\br armRight: " + this.armRight;
    }
}
