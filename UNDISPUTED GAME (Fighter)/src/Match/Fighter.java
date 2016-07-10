package Match;

import java.util.Random;

import FightersList.FightersList;

public class Fighter extends FightersList {
	// MAX STATS:
	public static final int MAX_LIFE=500;
	public static final int MAX_DAMAGE=100;
	public static final int MAX_DODGE=5;
	public static final int MAX_BLOCK=5;
	
	// Stats:
	private String name;
	private double life;
	private int damage;
	private int block;
	private int dodge;
//	SpecialAbility specialAbility;
	private Fighter enemy;
	
	// Setters & Getters:
	public String getName() {
		return name;
	}

	public void setName(final String name) {
		if (name!=null && name.matches(".*[a-zA-Z]+.*")) {
			this.name=name;
		}
	}

	public double getLife() {
		return life;
	}

	public void setLife(final int life) {
		if (life>0 && life<=MAX_LIFE) {
			this.life = life;
		}
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(final int damage) {
		if (damage>0 && damage<=MAX_DAMAGE) {
			this.damage = damage;
		}
	}

	public int getBlock() {
		return block;
	}

	public void setBlock(final int block) {
		if (block>0 && block<=MAX_BLOCK) {
			this.block = block;
		}
	}

	public int getDodge() {
		return dodge;
	}

	public void setDodge(final int dodge) {
		if (dodge>0 && dodge<=MAX_DODGE) {
			this.dodge = dodge;
		}
	}

	public Fighter getEnemy() {
		return enemy;
	}

	public void setEnemy(final Fighter enemy) {
		if (enemy!=null && enemy!=this) { // A fighter cannot fight nobody or himself/herself
			this.enemy=enemy;
			enemy.enemy=this;
		}
	}


	

	
	// Actions:
	void attack() {
		System.out.println("===================\n");
		System.out.println(this.name+" attacked "+this.enemy.name+"!!!");
		System.out.println();
		if (this.enemy.dodge()) { // Ако избегне удара
			System.out.println(this.enemy.name+" dodged the attack!");
			return;
		}
		if (this.enemy.block()) { // Ако блокира
			System.out.println(this.enemy.name+" blocked the attack!");
			this.enemy.decreaseLife((this.damage)*0.4); // поема само 40% от удара
			return;
		}
		System.out.println(this.enemy.name+" took a hit!");
		this.enemy.decreaseLife(this.damage); // Ако поеме директен удар
	}
	
	private boolean dodge() {
		if (this.dodge!=0) {
			int chance = new Random().nextInt((int) ((double) 100/(this.dodge*10)+0.99));
		if (chance==0) { // Ако избегне удара
			return true;
		}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}

	private boolean block() {
		if (this.block!=0) {
			int chance = new Random().nextInt((int) ((double) 100/(this.block*10)+0.99));
			if (chance==0) { // Ако избегне удара
				return true;
			}
			else {
				return false;
			}
		}
		else {
			return false;
		}
	}
	
	private void decreaseLife(final double damage) {
		this.life-=damage;
	}
	
	public boolean isAlive() {
		return this.life>0;
	}

}
