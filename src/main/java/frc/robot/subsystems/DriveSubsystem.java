/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX; 
//import com.ctre.phoenix.motorcontrol.can.TalonSRX;
//import edu.wpi.first.wpilibj.PWMTalonSRX;


import edu.wpi.first.wpilibj.command.Subsystem;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.GenericHID.Hand;
//import edu.wpi.first.wpilibj.XboxController;

import frc.robot.RobotMap; 
import frc.robot.OI; 
import frc.robot.commands.Drive;

/**
 * An example subsystem. You can replace me with your own Subsystem.
 */
public class DriveSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  SpeedController left1 = new WPI_TalonSRX(RobotMap.LEFT_MOTOR_ID1);
  SpeedController left2 = new WPI_TalonSRX(RobotMap.LEFT_MOTOR_ID2);

  SpeedController right1 = new WPI_TalonSRX(RobotMap.RIGHT_MOTOR_ID1);
  SpeedController right2 = new WPI_TalonSRX(RobotMap.RIGHT_MOTOR_ID2);



  SpeedControllerGroup left = new SpeedControllerGroup(left2, left1);
  SpeedControllerGroup right = new SpeedControllerGroup(right1, right2);
  private final DifferentialDrive BoiDrive = new DifferentialDrive(left, right);


  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new Drive());
  }

  public void DifferentialDrive() {
    //robotDrive.arcadeDrive(OI.controller.getX(Hand.kLeft), -OI.controller.getY(Hand.kRight),
        //OI.controller.getX(Hand.kRight));
    double leftValue = OI.controller.getY(Hand.kLeft);
    double rightValue = OI.controller.getY(Hand.kRight);
    BoiDrive.tankDrive(leftValue*-1, rightValue*-1);
    //*-1 is because, welp, the controller is stupid
  }
  

}
