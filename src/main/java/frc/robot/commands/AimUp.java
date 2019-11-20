/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.*;
//import frc.robot.Robot;
//import frc.robot.subsystems.ShootSubsystem;

//import frc.robot.Robot;
import static frc.robot.Robot.aimSub;

/**
 * An example command. You can replace me with your own command.
 */
public class AimUp extends Command {
  public AimUp() {
    // Use requires() here to declare subsystem dependencies
    requires(aimSub);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    //timeout is placeholder  
}

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    aimSub.MoveUp();
  }
  
  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    //return false;
    return !aimSub.up;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    aimSub.Stop();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}