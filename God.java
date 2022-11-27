package com.xworkz.equals.things;

public class God {
	
	private String name;
    private String weapon;
    private String power;
    private String wife;
    private String son;
    private String temple;
    private String prasad;
    private int hands;
    private int monsterKillings;
	public God(String name, String weapon, String power, String wife, String son, String temple, String prasad,
			int hands, int monsterKillings) {
		super();
		this.name = name;
		this.weapon = weapon;
		this.power = power;
		this.wife = wife;
		this.son = son;
		this.temple = temple;
		this.prasad = prasad;
		this.hands = hands;
		this.monsterKillings = monsterKillings;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power = power;
	}
	public String getWife() {
		return wife;
	}
	public void setWife(String wife) {
		this.wife = wife;
	}
	public String getSon() {
		return son;
	}
	public void setSon(String son) {
		this.son = son;
	}
	public String getTemple() {
		return temple;
	}
	public void setTemple(String temple) {
		this.temple = temple;
	}
	public String getPrasad() {
		return prasad;
	}
	public void setPrasad(String prasad) {
		this.prasad = prasad;
	}
	public int getHands() {
		return hands;
	}
	public void setHands(int hands) {
		this.hands = hands;
	}
	public int getMonsterKillings() {
		return monsterKillings;
	}
	public void setMonsterKillings(int monsterKillings) {
		this.monsterKillings = monsterKillings;
	}
	@Override
	public String toString() {
		return "God [name=" + name + ", weapon=" + weapon + ", power=" + power + ", wife=" + wife + ", son=" + son
				+ ", temple=" + temple + ", prasad=" + prasad + ", hands=" + hands + ", monsterKillings="
				+ monsterKillings + "]";
	}
	@Override
	public boolean equals(Object obj) {
		
		System.out.println("overriding object method");
		if(obj instanceof  God ) 
		{
			System.out.println("checking insatnce");
			 God  god  =(God)obj;
			if(this.name.equals( god.name) && this.power.equals(god.power) && this.wife.equals( god.wife ) && this.weapon.equals(god.weapon) && this.prasad.equals(god.prasad)) {
				System.out.println(" god  is same");
				return true;
			}
			else 
			{
				System.err.println("obj is not god ");
				
			}
			
		}
		return false;
	
	}
}
