package abstractionPackages.interfaces.live;
import abstractionPackages.interfaces.music.*;
import abstractionPackages.interfaces.music.string.*;
import abstractionPackages.interfaces.music.wind.*;

public class Test {
	public static void main(String[] args) {
		Playable p1=new Veena();
		Playable p2=new Saxophone();
		p1.play();
		p2.play();
	}
}
