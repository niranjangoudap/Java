
import java.security.PKCS12Attribute;

class Pokemon {
	
	String name;
	int level;
	

    Pokemon() {
        level=1;
    }

    Pokemon(String  pname,int plevel){
        name=pname;
        level=plevel;
    }
    Pokemon(String name,int level){
        this.name=name;
        this.level=level;
    }

	void attack() {
		System.out.println(name + " attack! by level " + level);
	}

//initialising a object
// classname variable = new classname;
public class Pokemon {

    public static void main(String[] args) {
    
/* 	Pokemon p1 = new Pokemon();
	p1.name = "Pikachu";
	p1.level=10;
	
	System.out.println(p1.name +" "+ p1.level);
    System.out.println(p1.level);

    
    Pokemon p2 = new Pokemon();
	p2.name="Evee";
	p2.level=20;

    p2.attack();*/

Pokemon p3 = new Pokemon("Patil",25);
System.out.println(p3.name + " " +p3.level);
}
}
}