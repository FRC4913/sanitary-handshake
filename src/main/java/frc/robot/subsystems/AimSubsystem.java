/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

//import com.sun.tools.javac.comp.Check;

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
  public double vertical;
  public double change =0.01;
  // vertical is the value of the height of the aimer

  Servo aim = new Servo(RobotMap.AIM_STUFF);//placeholders
  public boolean up = true;
  public boolean down = true;
  public void Check(){
    if (vertical<0){
      vertical=0;
    }else if (vertical>1){
      vertical=1;
    }else{
    }
  }
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

  //check if vertical reaches min(0) or max(1)


  //While the button 1 is pressed, it adds 0.1 to vertical. After the while loop, it sets the value of aim
  //since this is an if statement, it should be called every millisecond in OI.java
  public double MoveDown(){

    down = OI.controller.getRawButton(1);
    if (down == true){
      vertical=vertical-change;
      Check();
      aim.set(vertical);
    }
    System.out.print(vertical);
    return vertical;
   }

  //While the button 4 is pressed, it subtracts 0.1 from vertical. After the while loop, it sets the value of aim
  //since this is an if statement, it should be called every millisecond in OI.java
  public double MoveUp(){

    up = OI.controller.getRawButton(4);
    if (up == true){
      vertical = vertical + change;
      Check();
      aim.set(vertical);
    }
    System.out.print(vertical);
    return vertical;
  }

  public void Stop(){
    aim.set(vertical);
    System.out.print(vertical);
  }
  
}
