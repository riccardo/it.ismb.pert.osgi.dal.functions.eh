package org.energy_home.dal.functions;

import org.energy_home.dal.functions.data.TimeData;
import org.osgi.service.dal.DeviceException;
import org.osgi.service.dal.Function;
import org.osgi.service.dal.functions.data.LevelData;

public interface WashingMachine extends Function {
	
	//read-write properties
	public LevelData getCycle() throws DeviceException;
	public void setCycle(LevelData cycle) throws DeviceException;
	
	public LevelData getTemperature() throws DeviceException;
	public void setTemperature(LevelData temperature) throws DeviceException;
	
	public LevelData getSpin() throws DeviceException;
	public void setSpin(LevelData spin) throws DeviceException;
	
	public TimeData getStartTime() throws DeviceException;
	public void setStartTime(TimeData data) throws DeviceException;
	
	//read-only properties
	public TimeData getFinishTime() throws DeviceException;
	public TimeData getRemainingTime() throws DeviceException;
	
	//Operations
	public void execStartCycle() throws DeviceException;
	public void execStopCycle() throws DeviceException;	
	public void execPauseCycle() throws DeviceException;
	public void execOverloadPauseResume() throws DeviceException;
	public void execOverloadPause() throws DeviceException;
	public void execOverloadWarning() throws DeviceException;
}
