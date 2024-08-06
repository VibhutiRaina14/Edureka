package Java_Training;

class Mobile
{
	//private data members
	
	private String brand;
	private String[] msgs=new String[10];
	private int msgCount=0;
	private String[] gallery=new String[10];
	private int photoCount=0;
	//Ctor
	public Mobile(String model, String brand) {
		
		this.model = model;
		this.brand = brand;
	}
	//mutator methods
	private String model;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String[] getMsgs() {
		return msgs;
	}
	public void setMsgs(String[] msgs) {
		this.msgs = msgs;
	}
	public int getMsgCount() {
		return msgCount;
	}
	public void setMsgCount(int msgCount) {
		this.msgCount = msgCount;
	}
	public String[] getGallery() {
		return gallery;
	}
	public void setGallery(String[] gallery) {
		this.gallery = gallery;
	}
	public int getPhotoCount() {
		return photoCount;
	}
	public void setPhotoCount(int photoCount) {
		this.photoCount = photoCount;
	}
	//method 
	public void makeCall(String phoneNumber,String string)
	{
		System.out.println("Calling "+phoneNumber+" ...");
		
	}
	public void receiveCall(String callerName)
	{
		System.out.println("Receiving call from "+callerName+"...");
	}
	public void sendMsg(String phoneName, String msg)
	{
		System.out.println("Sending message");
	}
	public void readMsg(String msg)
	{
		System.out.println("Reading msg");
		
	}
	
	//method - click pic
	public void clickPic(String photoName)
	{
		System.out.println("Clicking pic:"+photoName);
	}
	//method- look into gallery
	public void lookIntoGalery()
	{
		System.out.println("Looking into gallery");
	}
}
public class Encapsulation {//consider it as screen
	public static void main(String[] args)
	{
		Mobile m=new Mobile("Model1","Brand1");
		
	}

}
