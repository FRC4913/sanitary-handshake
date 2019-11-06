/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Servo;
//import edu.wpi.first.wpilibj.GenericHID.Hand;
import frc.robot.OI;
import frc.robot.RobotMap;

//import static org.junit.Assume.assumeTrue;

//import edu.wpi.first.wpilibj.Joystick;
/**
 * An example subsystem. You can replace me with your own Subsystem.
 */

public class AimSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public double vertical = 0;

  Servo aim = new Servo(RobotMap.AIM_STUFF);//placeholders

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    //setDefaultCommand(new Drive());
  }
/*
  public void MoveUp(){
      aim.set(OI.controller.getTriggerAxis(Hand.kRight));
  }

  public void MoveDown(){
      aim.set(OI.controller.getTriggerAxis(Hand.kLeft));
  }
  */ 
  public void Check(){
     if (vertical<0){
       vertical=0;
     }else if (vertical>1){
       vertical=1;
     }
   }
  public double Move(){

    boolean up = OI.controller.getRawButton(4);
    boolean down = OI.controller.getRawButton(1);
    while (up == true || down == true || vertical < 0 || vertical > 1){
      if (up == true){
        vertical=vertical+0.1;
        Check();
      }
      else{
        vertical=vertical-0.1;
        Check();
      }
    }
    aim.set(vertical);
    return vertical;
  }


}
