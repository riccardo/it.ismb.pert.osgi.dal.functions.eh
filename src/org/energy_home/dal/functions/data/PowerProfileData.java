package org.energy_home.dal.functions.data;

import java.util.Map;

import org.osgi.service.dal.FunctionData;

public class PowerProfileData extends FunctionData{

	public short totalProfileNum;
	public short powerProfileID;
	
	public PowerProfileData(long timestamp, Map metadata) {
		super(timestamp, metadata);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
