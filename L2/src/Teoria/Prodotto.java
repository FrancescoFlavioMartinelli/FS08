package Teoria;

public class Prodotto {
	private double price = 20;
	
	private String nome;
	
	private double salePersonal = 0;
	static private double saleAll = 0.2;
	
	static int priceChanged = 0;
	
	static int totProdotti = 0;
//	CHAINING CONSTRUCTOR
//	public Prodotto(String nome, double price, double sale) {
//		this.nome = nome;
//		this.price = price;
//		this.salePersonal = sale;
//		System.out.println("Costruttore prodotto " + this.nome);
//		totProdotti++;
//	}
//	
//	public Prodotto() {
//		this("Prodotto" + totProdotti, 20, 0);
//	}
//	
//	public Prodotto(String nome, double price) {
//		this(nome, price, 0);
//		
//	}
//	
//	public Prodotto(double price) {
//		this.nome = "Prodotto" + totProdotti;
//		this.price = price;
//	}
	
	private Prodotto() {
		//qua inseriamo tutte le logiche che devono sempre esserci alla costruzione
		System.out.println("Nuovo prodotto");
		this.nome = "Prodotto" + totProdotti;
		this.price = 10;
		totProdotti++;
	}
	
	public Prodotto(String nome) {
		this(); //fa riferimento al costruttore senza parametri
		System.out.println("Nome prodotto: " + nome);
		//qua inseriamo tutte le logiche che devono sempre esserci alla costruzione con nome specificato
		this.nome = nome;
	}
	
	public Prodotto(String nome, double price) {
		this(nome);
		System.out.println("Price prodotto: " + price);
		this.price = price;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	
	static String getInfoProdotto() {
		return "Price, Nome, priceChanged";
	}
	
	static int getPrezzo() {
		return priceChanged;
	}
	
	public double getPrezzoScontato() {
		return getPrice() - getSconto();
	}
	public double getRisparmio() {
		return (getSconto() / getPrice())*100;
	}
	
	
	public double getSale() {
		return salePersonal;
	}
	
	public void setSale(double s) {
		System.out.print("Set sale pers");
		if(s <= 1 && s > 0) {			
			salePersonal = s;
		}
	}
	
	//overload
	public void setSale(float s) {
		setSale((double) s);
	}
	public void setSale(double s, boolean all) {
		System.out.print("Set sale all");
		if(all && s <= 1 && s > 0) {		
				saleAll = s;
		} else {
			setSale(s);
		}
	}
	
	
	private double getSconto() {
		return price * salePersonal;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public void setPrice(double p) {
		priceChanged++;
		price = p;
	}
	
	
	//overload
	private void setInfo(String name, double price) {
		nome = name;
		price = price;
	}
	
	public void setInfo(String[] data) {
//		nome =data[0];
//		price = Double.parseDouble(data[1]);
		setInfo(data[0], Double.parseDouble(data[1]));
	}
	
	
	
}