// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5933.ubot.subsystems;

import org.usfirst.frc5933.ubot.RobotMap;
import org.usfirst.frc5933.ubot.commands.*;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.SpeedController;

import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Arm extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController windowMotor = RobotMap.armWindowMotor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS


    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }
    
    public void up() {
    	windowMotor.set(.25);
    }

    public void down() {
    	windowMotor.set(-0.25);
    }
    
    public void stop() {
    	windowMotor.set(0);
    }
    
    public boolean isStopped() {
    	
    	// TODO: This code is commented out until we figure out why the jaguar 
    	// kills the can bus. We really want to use the can bus, since can get more info
    	// from the speed controller than if we only used PWM. Some of these methods only exist
    	// if we use the CAN bus, so we will remove them for now.
    	
    	// if true the motor can turn.
    	/*    	
  		boolean forward_limit = windowMotor.getForwardLimitOK();
    	boolean reverse_limit = windowMotor.getReverseLimitOK();
    	double speed = windowMotor.get();
    	
    	if (speed == 0) {
    		System.out.println("Motor is stopped since speed is zero");
    		return true;
    	}
    	
    	if (!forward_limit && (speed != 0)) {
    		System.out.println("Motor stopped by forward limit switch");
    		stop();
    		return true;
    	}
    	
    	if (!reverse_limit && (speed != 0)) {
    		System.out.println("Motor stopped by reverse limit switch");
    		stop();
    		return true;
    	}
    	*/    	
    	return false;
    }
}

