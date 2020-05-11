package stock;

import java.util.Scanner;

public abstract class Stock implements StockInput {

	protected StockKind kind = StockKind.Kospi;
	protected String name;
	protected int price;
	protected int target;
	protected int stoploss;
	
	public Stock() {		
	}
	
	public Stock(StockKind kind) {
		this.kind = kind;
	}
	
	
	
	public Stock(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public Stock(String name, int price, int target, int stoploss) {
		this.name = name;
		this.price = price;
		this.target = target;
		this.stoploss = stoploss;
	}
	public Stock(StockKind kind, String name, int price, int target, int stoploss) {
		this.kind = kind;
		this.name = name;
		this.price = price;
		this.target = target;
		this.stoploss = stoploss;
	}
	public StockKind getKind() {
		return kind;
	}

	public void setKind(StockKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getTarget() {
		return target;
	}

	public void setTarget(int target) {
		this.target = target;
	}

	public int getStoploss() {
		return stoploss;
	}

	public void setStoploss(int stoploss) {
		this.stoploss = stoploss;
	}
	
	public abstract void printInfo() ;
	
	public void setStockName(Scanner input) {
		System.out.print("Stock name : ");
		String name = input.next();
		this.setName(name);
	}
	public void setStockPrice(Scanner input) {
		System.out.print("Stock price : ");
		int price = input.nextInt();
		this.setPrice(price);
	}
	public void setStockTarget(Scanner input) {
		System.out.print("Stock target : ");
		int target = input.nextInt();
		this.setTarget(target);
	}
	public void setStockStoploss(Scanner input) {
		System.out.print("Stop Loss : ");
		int stoploss = input.nextInt();
		this.setStoploss(stoploss);
	}
	
	public String getKindString() {
		String skind = "none";
		switch(this.kind) {
		case Kospi: 
			skind = "Kospi";
			break;
		case Kosdaq:
			skind = "Kosdaq";
			break;
		case Dow:
			skind = "Dow";
			break;
		case Nasdaq:
			skind = "Nasdaq";
			break;
		default:
			
		}
		return skind;
	}
	

}