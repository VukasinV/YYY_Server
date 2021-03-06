package main;

import java.io.Serializable;
import java.util.LinkedList;

public class Paket implements Serializable {

	private int tip;
	private String poruka;
	private int brPogodjenihNaMestu;
	private int brPogodjenihNisuNaMestu;
	private LinkedList<String> listaOnlineIgraca;


	// Ime koje korisnik kuca pri loginovanju
	public static final int USERNAME = 1;

	// Potvrda od servera da je ime validno
	public static final int VALID_USERNAME = 2;

	// Potvrda od servera da ime nije validno
	public static final int INVALID_USERNAME = 3;

	// Zahtev za Listu
	public static final int LIST_REQUEST = 4;

	// Lista
	public static final int LIST = 5;
	
	//izarani igrac
	public static final int CHOOSEN_PLAYER = 6;

	// user offline
	public static final int OFFLINE = 7;

	// Zahtev za igru
	public static final int GAME_REQUEST = 8;

	// game accepted
	public static final int ACCEPTED = 9;

	// game declined
	public static final int DECLINED = 10;


	// init of game
	public static final int BEGIN = 11;

	// kombinacija
	public static final int COMBINATION = 12;
	
	// Obicna poruka
	public static final int MESSAGE = 13;

	// rezult of combination
	public static final int REZ = 14;

	public Paket(int inType) throws IllegalArgumentException {
		if ((inType < USERNAME) || (inType > REZ)) {
			throw new IllegalArgumentException("Uneli ste pogresan tip paketa!");
		}
		tip = inType;
	}

	public Paket(int inType, String inMessage) {
		if ((inType < USERNAME) || (inType > REZ)) {
			throw new IllegalArgumentException("Uneli ste pogresan tip paketa!");
		}
		tip = inType;
		poruka = inMessage;
	}
	
	public Paket(int brPogodjenihNaMestu, int brPogodjenihNisuNaMestu) {
		tip = Paket.COMBINATION;
		this.brPogodjenihNaMestu = brPogodjenihNaMestu;
		this.brPogodjenihNisuNaMestu = brPogodjenihNisuNaMestu;
	}
	
	public Paket (LinkedList<String> listaIgraca, String poruka) {
		tip = Paket.LIST;
		listaOnlineIgraca = listaIgraca;
		this.poruka = poruka;
	}

	public int getType() {
		return tip;
	}

	public String getPoruka() {
		return poruka;
	}
	public int getBrPogodjenihNaMestu() {
		return brPogodjenihNaMestu;
	}
	
	public void setBrPogodjenihNaMestu(int brPogodjenihNaMestu) {
		this.brPogodjenihNaMestu = brPogodjenihNaMestu;
	}
	
	public int getBrPogodjenihNisuNaMestu() {
		return brPogodjenihNisuNaMestu;
	}
	
	public void setBrPogodjenihNisuNaMestu(int brPogodjenihNisuNaMestu) {
		this.brPogodjenihNisuNaMestu = brPogodjenihNisuNaMestu;
	}
	public LinkedList<String> getListaOnlineIgraca() {
		return listaOnlineIgraca;
	}
	
	public void setListaOnlineIgraca(LinkedList<String> listaOnlineIgraca) {
		this.listaOnlineIgraca = listaOnlineIgraca;
	}
}
