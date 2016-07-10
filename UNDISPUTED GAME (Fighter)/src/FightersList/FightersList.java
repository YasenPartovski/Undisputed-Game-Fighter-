package FightersList;

import Match.Fighter;

public class FightersList {
	

	public void assignBoyka () {
		((Fighter)this).setName("Yuri Boyka");
		((Fighter)this).setLife(410);
		((Fighter)this).setDamage(Fighter.MAX_DAMAGE);
		((Fighter)this).setDodge(3);
		((Fighter)this).setBlock(3);
	}
	
	public void assignGeorgeChambers() {
		((Fighter)this).setName("George Chambers");
		((Fighter)this).setLife(450);
		((Fighter)this).setDamage(85);
		((Fighter)this).setDodge(4);
		((Fighter)this).setBlock(2);
	}
	
	public void assignTurbo() {
		((Fighter)this).setName("Turbo");
		((Fighter)this).setLife(200);
		((Fighter)this).setDamage(50);
		((Fighter)this).setDodge(2);
		((Fighter)this).setBlock(Fighter.MAX_BLOCK);
	}
	
	public void assignGaga() {
		((Fighter)this).setName("Gaga");
		((Fighter)this).setLife(150);
		((Fighter)this).setDamage(30);
		((Fighter)this).setDodge(3);
		((Fighter)this).setBlock(0);
	}
	
	public void assignRaulDolorQuinones() {
		((Fighter)this).setName("Raul 'Dolor' Quinones");
		((Fighter)this).setLife(Fighter.MAX_LIFE);
		((Fighter)this).setDamage(85);
		((Fighter)this).setDodge(2);
		((Fighter)this).setBlock(4);
	}
	
	public void assignRodrigoSilva() {
		((Fighter)this).setName("Rodrigo Silva");
		((Fighter)this).setLife(400);
		((Fighter)this).setDamage(90);
		((Fighter)this).setDodge(Fighter.MAX_DODGE);
		((Fighter)this).setBlock(1);
	}
	


}