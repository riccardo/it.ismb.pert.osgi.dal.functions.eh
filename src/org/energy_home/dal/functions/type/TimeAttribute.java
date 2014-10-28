package org.energy_home.dal.functions.type;

public class TimeAttribute {

	//constructor to be used to parse ZigBee StartTime/FinishTime/RemainingTime attributes
	public TimeAttribute(int result) {
		//int is on 4 bytes, we need 2 bytes
		//get bytes 8 to 15
		hour= new Integer((int) ((result & 0x0000FF00) & 0xFFFF));
		//minute=
	}
	private Boolean absolute;
	private Integer hour;
	private Integer minute;
}
