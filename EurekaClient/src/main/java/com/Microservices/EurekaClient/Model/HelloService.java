package com.Microservices.EurekaClient.Model;

public class HelloService {
	private int countMax;
	private int countMin;
	public int getCountMax() {
		return countMax;
	}
	public void setCountMax(int countMax) {
		this.countMax = countMax;
	}
	public int getCountMin() {
		return countMin;
	}
	public void setCountMin(int countMin) {
		this.countMin = countMin;
	}
	public HelloService(int countMax, int countMin) {
		super();
		this.countMax = countMax;
		this.countMin = countMin;
	}
}
