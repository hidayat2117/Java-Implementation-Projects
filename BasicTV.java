/******************************************
 * The TV set implementation.             *
 * @author: Vladimir Efros                *
 * This program demonstrates a basic TV.  *
 ******************************************/

import java.util.Scanner;

/**
 *The purpose of this class is to model a television
 */
class Television {
	
	// field declaration
	private final String MANUFACTURER;   // Holds the brand of the television
	private final int SCREEN_SIZE;       // Holds the size of the television
	private boolean powerOn = false;     // Holds the value false, power is OFF
	private int channel = 2;             // Holds the station that the television is showing
	private int volume = 20;             // Holds the loudness of the TV
	
	// constructor method
	public Television(String brand, int size)
	{
		MANUFACTURER = brand;
		SCREEN_SIZE = size;
	}
	
	/**
	* The setChannnel method sets the channel and stores it into a channel variable.
	*/
	public void setChannel(int ch)
	{
		channel = ch;
	}
	
	/**
	* The power method changes the state of the TV power from true to false or vice versa.
	*/
	public void power()
	{
		powerOn = !powerOn; 
	}  
	
	/**
	* The increaseVolume method increases volume by 1
	*/
	public void increaseVolume(){
		volume++;
	}
	
	/**
	* The decreaseVolume method decreases volume by 1
	*/
	public void decreaseVolume()
	{
		volume--;
	}
	
	/**
	* The getChannel method returns the channel value.
	*/
	public int getChannel()
	{
		return channel;
	} 
	
	/**
	* The getVolume method returns the volume value.
	*/
	public int getVolume()
	{
		return volume;
	}
	
	/**
	* The getManufacturer method returns manufacturer value.
	*/
	public String getManufacturer()
	{
		return MANUFACTURER;
	}
	
	/**
	* The getScreensize method returns screen size value.
	*/
	public int getScreenSize()
	{
		return SCREEN_SIZE;
	}
}

public class BasicTV{
	
	public static void main(String[] args){
		//Create a Scanner object to read from the keyboard
		Scanner keyboard = new Scanner (System.in);

		//Declare variables
		int station; //the user’s channel choice

		//Declare and instantiate a television object
		Television bigScreen = new Television("Toshiba", 55);
		Television portable = new Television("Sharp", 19);
		
		//Turn the power on
		bigScreen.power();
		
		//Display the state of the television
		System.out.println("A " + bigScreen.getScreenSize() + " inch "+ bigScreen.getManufacturer() + " has been turned on.");
		
		//Prompt the user for input and store into station
		System.out.print("What channel do you want? ");
		station = keyboard.nextInt();
		
		//Change the channel on the television
		bigScreen.setChannel(station);
		
		//Increase the volume of the television
		bigScreen.increaseVolume();

		//Display the the current channel and volume of the television
		System.out.println("Channel: " + bigScreen.getChannel() + " Volume: " + bigScreen.getVolume());

		System.out.println("Too loud!! I am lowering the volume.");
		//Decrease the volume of the television
		for(int i = 0; i < 5; i++)
			bigScreen.decreaseVolume();
		
		//Display the current channel and volume of the television
		System.out.println("Channel: " + bigScreen.getChannel() + " Volume: " + bigScreen.getVolume());
		System.out.println(); //for a blank line
		
		// Turn the TV power on
		portable.power();

		// Display all the information
		System.out.println("A " + portable.getScreenSize() + " " + portable.getManufacturer() + " has been turned on");
		System.out.print("What channel do you want? ");
		station = keyboard.nextInt();
		portable.setChannel(station);
		for(int i=0; i< 100;i++)
			portable.increaseVolume();
		System.out.println("Station: " + portable.getChannel() + " Volume " + portable.getVolume());
		for(int i=0; i< 69;i++)
			portable.decreaseVolume();
		System.out.println("Too loud!! I am lowering the volume.");
		portable.decreaseVolume();
		System.out.println("Station: " + portable.getChannel() + " Volume " + portable.getVolume());
	}
}
