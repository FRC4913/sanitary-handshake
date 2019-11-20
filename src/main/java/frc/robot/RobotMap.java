/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;

  public static int LEFT_MOTOR_ID1 = 1;
  public static int LEFT_MOTOR_ID2 = 2;
  public static int RIGHT_MOTOR_ID1 = 3;
  public static int RIGHT_MOTOR_ID2 = 4;


  public static int FIRST_PCM_ID = 0;
  public static int SECOND_PCM_ID = 9;

  public static int XBOX_CONTROLLER = 0;

  // PWM port for servo and new single solenoid
  public static int AIM_STUFF = 2;
  public static int CLIMB_STUFF = 1;
  public static int SHOOT_FORWARD = 0;


  //button 
  public static int AIM_UP_BUTTON = 4;
  public static int AIM_DOWN_BUTTON = 1;
  public static int CLIMB_HIGH_BUTTON = 2;
  public static int CLIMB_LOW_BUTTON = 3;
  public static int SHOOT_BUTTON = 6;
  // first PCM
  /*public static int ARM_FORWARD = 6;
  public static int ARM_BACKWARD = 7;

  public static int FRONT_LIFTER_FORWARD = 0;
  public static int FRONT_LIFTER_BACKWARD = 1;

  public static int REAR_LIFTER_FORWARD = 2;
  public static int REAR_LIFTER_BACKWARD = 3;

  public static int PUSHER_FORWARD = 0;
  public static int PUSHER_BACKWARD = 1;

  // second PCM
  public static int GRABBER_FORWARD = 5;
  public static int GRABBER_BACKWARD = 4;*/



}
