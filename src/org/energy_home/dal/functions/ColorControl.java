package org.energy_home.dal.functions;

import org.osgi.service.dal.Function;

public interface ColorControl extends Function{
	final static String ATTR_CurrentHue_NAME = "CurrentHue";
	final static String ATTR_CurrentSaturation_NAME = "CurrentSaturation";
	final static String ATTR_RemainingTime_NAME = "RemainingTime";
	final static String ATTR_CurrentX_NAME = "CurrentX";
	final static String ATTR_CurrentY_NAME = "CurrentY";
	final static String ATTR_DriftCompensation_NAME = "DriftCompensation";
	final static String ATTR_CompensationText_NAME = "CompensationText";
	final static String ATTR_ColorTemperature_NAME = "ColorTemperature";
	final static String ATTR_ColorMode_NAME = "ColorMode";
	final static String ATTR_NumberOfPrimaries_NAME = "NumberOfPrimaries";
	final static String ATTR_Primary1X_NAME = "Primary1X";
	final static String ATTR_Primary1Y_NAME = "Primary1Y";
	final static String ATTR_Primary1Integerensity_NAME = "Primary1Integerensity";
	final static String ATTR_Primary2X_NAME = "Primary2X";
	final static String ATTR_Primary2Y_NAME = "Primary2Y";
	final static String ATTR_Primary2Integerensity_NAME = "Primary2Integerensity";
	final static String ATTR_Primary3X_NAME = "Primary3X";
	final static String ATTR_Primary3Y_NAME = "Primary3Y";
	final static String ATTR_Primary3Integerensity_NAME = "Primary3Integerensity";
	final static String ATTR_Primary4X_NAME = "Primary4X";
	final static String ATTR_Primary4Y_NAME = "Primary4Y";
	final static String ATTR_Primary4Integerensity_NAME = "Primary4Integerensity";
	final static String ATTR_Primary5X_NAME = "Primary5X";
	final static String ATTR_Primary5Y_NAME = "Primary5Y";
	final static String ATTR_Primary5Integerensity_NAME = "Primary5Integerensity";
	final static String ATTR_Primary6X_NAME = "Primary6X";
	final static String ATTR_Primary6Y_NAME = "Primary6Y";
	final static String ATTR_Primary6Integerensity_NAME = "Primary6Integerensity";
	final static String ATTR_WhitePoIntegerX_NAME = "WhitePoIntegerX";
	final static String ATTR_WhitePoIntegerY_NAME = "WhitePoIntegerY";
	final static String ATTR_ColorPoIntegerRX_NAME = "ColorPoIntegerRX";
	final static String ATTR_ColorPoIntegerRY_NAME = "ColorPoIntegerRY";
	final static String ATTR_ColorPoIntegerRIntegerensity_NAME = "ColorPoIntegerRIntegerensity";
	final static String ATTR_ColorPoIntegerGX_NAME = "ColorPoIntegerGX";
	final static String ATTR_ColorPoIntegerGY_NAME = "ColorPoIntegerGY";
	final static String ATTR_ColorPoIntegerGIntegerensity_NAME = "ColorPoIntegerGIntegerensity";
	final static String ATTR_ColorPoIntegerBX_NAME = "ColorPoIntegerBX";
	final static String ATTR_ColorPoIntegerBY_NAME = "ColorPoIntegerBY";
	final static String ATTR_ColorPoIntegerBIntegerensity_NAME = "ColorPoIntegerBIntegerensity";
	final static String ATTR_EnhancedCurrentHue_NAME = "EnhancedCurrentHue";
	final static String ATTR_EnhancedColorMode_NAME = "EnhancedColorMode";
	final static String ATTR_ColorLoopActive_NAME = "ColorLoopActive";
	final static String ATTR_ColorLoopDirection_NAME = "ColorLoopDirection";
	final static String ATTR_ColorLoopTime_NAME = "ColorLoopTime";
	final static String ATTR_ColorLoopStartEnhancedHue_NAME = "ColorLoopStartEnhancedHue";
	final static String ATTR_ColorLoopStoredEnhancedHue_NAME = "ColorLoopStoredEnhancedHue";
	final static String ATTR_ColorCapabilities_NAME = "ColorCapabilities";
	final static String ATTR_ColorTempPhysicalMin_NAME = "ColorTempPhysicalMin";
	final static String ATTR_ColorTempPhysicalMax_NAME = "ColorTempPhysicalMax";
	final static String CMD_MoveToHue_NAME = "MoveToHue";
	final static String CMD_MoveHue_NAME = "MoveHue";
	final static String CMD_StepHue_NAME = "StepHue";
	final static String CMD_MoveToSaturation_NAME = "MoveToSaturation";
	final static String CMD_MoveSaturation_NAME = "MoveSaturation";
	final static String CMD_StepSaturation_NAME = "StepSaturation";
	final static String CMD_MoveToHueAndSaturation_NAME = "MoveToHueAndSaturation";
	final static String CMD_MoveToColor_NAME = "MoveToColor";
	final static String CMD_MoveColor_NAME = "MoveColor";
	final static String CMD_StepColor_NAME = "StepColor";
	final static String CMD_MoveToColorTemperature_NAME = "MoveToColorTemperature";

	public Short getCurrentHue();

	public Short getCurrentSaturation();

	public Integer getRemainingTime();

	public Integer getCurrentX();

	public Integer getCurrentY();

	public Short getDriftCompensation();

	public String getCompensationText();

	public Integer getColorTemperature();

	public Short getColorMode();

	public Short getNumberOfPrimaries();

	public Integer getPrimary1X();

	public Integer getPrimary1Y();

	public Short getPrimary1Integerensity();

	public Integer getPrimary2X();

	public Integer getPrimary2Y();

	public Short getPrimary2Integerensity();

	public Integer getPrimary3X();

	public Integer getPrimary3Y();

	public Short getPrimary3Integerensity();

	public Integer getPrimary4X();

	public Integer getPrimary4Y();

	public Short getPrimary4Integerensity();

	public Integer getPrimary5X();

	public Integer getPrimary5Y();

	public Short getPrimary5Integerensity();

	public Integer getPrimary6X();

	public Integer getPrimary6Y();

	public Short getPrimary6Integerensity();

	public Integer getWhitePoIntegerX();

	public Integer getWhitePoIntegerY();

	public Integer getColorPoIntegerRX();

	public Integer getColorPoIntegerRY();

	public Short getColorPoIntegerRIntegerensity();

	public Integer getColorPoIntegerGX();

	public Integer getColorPoIntegerGY();

	public Short getColorPoIntegerGIntegerensity();

	public Integer getColorPoIntegerBX();

	public Integer getColorPoIntegerBY();

	public Short getColorPoIntegerBIntegerensity();

	public Integer getEnhancedCurrentHue();

	public Short getEnhancedColorMode();

	public Short getColorLoopActive();

	public Short getColorLoopDirection();

	public Integer getColorLoopTime();

	public Integer getColorLoopStartEnhancedHue();

	public Integer getColorLoopStoredEnhancedHue();

	public Integer getColorCapabilities();

	public Integer getColorTempPhysicalMin();

	public Integer getColorTempPhysicalMax();

	public void execMoveToHue(Short Hue, Short Direction, Integer TransitionTime );

	public void execMoveHue(Short MoveMode, Short Rate);

	public void execStepHue(Short StepMode, Short StepSize, Integer TransitionTime );

	public void execMoveToSaturation(Short Saturation, Integer TransitionTime);

	public void execMoveSaturation(Short MoveMode, Short Rate);

	public void execStepSaturation(Short StepMode, Short StepSize, Integer TransitionTime);

	public void execMoveToHueAndSaturation(Short Hue, Short Saturation, Integer TransitionTime);

	public void execMoveToColor(Integer ColorX, Integer ColorY, Integer TransitionTime);

	public void execMoveColor(Integer RateX, Integer RateY);

	public void execStepColor(Integer StepX, Integer StepY, Integer TransitionTime);

	public void execMoveToColorTemperature(Short ColorTemperature, Integer TransitionTime);

}
