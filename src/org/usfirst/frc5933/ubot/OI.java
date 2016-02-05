// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5933.ubot;

import org.usfirst.frc5933.ubot.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc5933.ubot.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton leftBumper;
    public JoystickButton rightBumper;
    public JoystickButton aButton;
    public JoystickButton bButton;
    public JoystickButton xButton;
    public JoystickButton backButton;
    public JoystickButton startButton;
    public JoystickButton leftJoystickButton;
    public JoystickButton rightJoystickButton;
    public Joystick xBoxJoystick;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        xBoxJoystick = new Joystick(0);
        
        rightJoystickButton = new JoystickButton(xBoxJoystick, 10);
        rightJoystickButton.whileHeld(new NullCommand());
        leftJoystickButton = new JoystickButton(xBoxJoystick, 9);
        leftJoystickButton.whileHeld(new NullCommand());
        startButton = new JoystickButton(xBoxJoystick, 8);
        startButton.whileHeld(new NullCommand());
        backButton = new JoystickButton(xBoxJoystick, 7);
        backButton.whileHeld(new NullCommand());
        xButton = new JoystickButton(xBoxJoystick, 3);
        xButton.whileHeld(new NullCommand());
        bButton = new JoystickButton(xBoxJoystick, 2);
        bButton.whileHeld(new NullCommand());
        aButton = new JoystickButton(xBoxJoystick, 1);
        aButton.whileHeld(new NullCommand());
        rightBumper = new JoystickButton(xBoxJoystick, 6);
        rightBumper.whileHeld(new LiftingArmDown());
        leftBumper = new JoystickButton(xBoxJoystick, 5);
        leftBumper.whileHeld(new LiftingArmUp());


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("ArcadeDrive", new ArcadeDrive());
        SmartDashboard.putData("TankDrive", new TankDrive());
        SmartDashboard.putData("LiftingArmUp", new LiftingArmUp());
        SmartDashboard.putData("LiftingArmDown", new LiftingArmDown());
        SmartDashboard.putData("MechDrive", new MechDrive());

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getXBoxJoystick() {
        return xBoxJoystick;
    }


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}

