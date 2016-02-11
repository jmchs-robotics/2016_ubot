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
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.Victor;

import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc5933.ubot.Robot;

/**
 *
 */
public class DriveTrain extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final CANTalon frontLeftMotor = RobotMap.driveTrainFrontLeftMotor;
    private final CANTalon rearLeftMotor = RobotMap.driveTrainRearLeftMotor;
    private final CANTalon frontRightMotor = RobotMap.driveTrainFrontRightMotor;
    private final CANTalon rearRightMotor = RobotMap.driveTrainRearRightMotor;
    private final RobotDrive robotDrive = RobotMap.driveTrainRobotDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    private boolean isReversed = false;
    public static final double RIGHT_DRIVE_MULTIPLIER = 1.0;
    public static final double LEFT_DRIVE_MULTIPLIER = 1.08;
    
    public static final double TURBO_FAST_MULTIPLIER = 1.0;
    public static final double TURBO_SLOW_MULTIPLIER = 0.5;
    private double turboMultiplier = TURBO_FAST_MULTIPLIER;
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    public void arcadeDrive(Joystick stick) {
    	double y = stick.getY();
    	double x = stick.getX();
    	if (isReversed) {
    		y *= -1;
    		x *= -1;
    	}

    	y *= turboMultiplier;
    	x *= turboMultiplier;
    	
    	// TODO: if we want the arcade to drive straight, we will need
    	// to scale x by some factor.
    	// I think the best way to do this is to temporarily set x to zero,
    	// drive the robot using only the y value and slowly change x by some
    	// multiplier value until it goes straight. Then let the value of
    	// x remain like it should and see how well it works. Make sure to handle
    	// the cases where x is: 0, -, +.
    	robotDrive.arcadeDrive(y, x);
    }

    public void driveStraight(double speed) {
    	double left = speed * LEFT_DRIVE_MULTIPLIER;
    	double right = speed * RIGHT_DRIVE_MULTIPLIER;
    	
    	if (isReversed) {
    		left *= -1;
    		right *= -1;
    	}
    	
    	left *= turboMultiplier;
    	right *= turboMultiplier;
    	
    	robotDrive.tankDrive(left, right);
    }
    
    public void toggleTurbo() {
    	if (turboMultiplier == TURBO_FAST_MULTIPLIER) {
    		turboMultiplier = TURBO_SLOW_MULTIPLIER;
    	} else {
    		turboMultiplier = TURBO_FAST_MULTIPLIER;
    	}
    }
    
    public void reverseControls() {
    	robotDrive.tankDrive(0, 0);
    	Timer.delay(1.0);
    	isReversed = !isReversed;
    }
    
    public void turnDegrees(double speed, double degrees) {
    	robotDrive.arcadeDrive(speed, degrees);
    }
}

