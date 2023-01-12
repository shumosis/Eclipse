package com.xworkz.springFramework5.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Ghost {
	
	private String name;
	private String city;
	private String gf;
	private String wife;
	private String mother;
	private String father;
	private String grandfather;
	private String garndmother;
	private int kids;
	private String girlName;
	@Autowired
	@Qualifier("ghostboy")
	private String boyName;
	@Autowired
	@Qualifier("ghostage")
	private int ageofghost;
	@Autowired
	@Qualifier("ghostWifeAge")
	private int ageofghostwife;
	@Autowired
	@Qualifier("ghostGFAge")
	private int ageofghostgf;
	@Autowired
	@Qualifier("ghostmotherage")
	private int ageofghostmother;
	@Autowired
	@Qualifier("ghostfatherage")
	private int ageofghostfather;
	@Autowired
	@Qualifier("ghostGrandFatherAge")
	private int ageofghostgrandfather;
	@Autowired
	@Qualifier("ghostGrandMotherAge")
	private int ageofghostgrandmother;
	@Autowired
	@Qualifier("ghostGirlAge")
	private int ageofghostgirl;
	@Autowired
	@Qualifier("ghostBoyAge")
	private int ageofghostboy;
	@Autowired
	@Qualifier("ghostNumber")
	private double ghostNumber;
	
	@Autowired
	public Ghost(@Qualifier("ghostName")String name,@Qualifier("ghostcity") String city,@Qualifier("ghostgf") String gf,@Qualifier("ghostwife") String wife,
			@Qualifier("ghostmother")String mother,@Qualifier("ghostfather") String father,@Qualifier("ghostGrandFather") String grandfather,
			@Qualifier("ghostGrandMother")String garndmother,@Qualifier("ghostkids") int kids,@Qualifier("ghostgirl") String girlName) {
		this.name = name;
		this.city = city;
		this.gf = gf;
		this.wife = wife;
		this.mother = mother;
		this.father = father;
		this.grandfather = grandfather;
		this.garndmother = garndmother;
		this.kids = kids;
		this.girlName = girlName;
	}

	@Override
	public String toString() {
		return "Ghost [name=" + name + ", city=" + city + ", gf=" + gf + ", wife=" + wife + ", mother=" + mother
				+ ", father=" + father + ", grandfather=" + grandfather + ", garndmother=" + garndmother + ", kids="
				+ kids + ", girlName=" + girlName + ", boyName=" + boyName + ", ageofghost=" + ageofghost
				+ ", ageofghostwife=" + ageofghostwife + ", ageofghostgf=" + ageofghostgf + ", ageofghostmother="
				+ ageofghostmother + ", ageofghostfather=" + ageofghostfather + ", ageofghostgrandfather="
				+ ageofghostgrandfather + ", ageofghostgrandmother=" + ageofghostgrandmother + ", ageofghostgirl="
				+ ageofghostgirl + ", ageofghostboy=" + ageofghostboy + ", ghostNumber=" + ghostNumber + "]";
	}
	
	
	
}
