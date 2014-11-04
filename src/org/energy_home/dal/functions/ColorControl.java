package org.energy_home.dal.functions;

import org.osgi.service.dal.DeviceException;
import org.osgi.service.dal.Function;

public interface ColorControl extends Function{
	
	public static final String OPERATION_SETCOLOR="setColor";

	public void setColor(Short red, Short green,Short blue) throws DeviceException;

}
