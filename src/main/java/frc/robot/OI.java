/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import frc.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {

  public static XboxController controller = new XboxController(RobotMap.XBOX_CONTROLLER);


  /**Control Gary
   * FrontLifter back
   * RearLefter start
   * GrabberOpen B
   * GrabberClose X
   * ArmUp RB
   * ArmDown LB
   * PusherPull Y
   * PusherPush A
   */

  //4 is A in green. 1 is Y in yellow. 3 is X in blue. 2 is B in red. 6 is rb

  public Button AimerUpButton = new JoystickButton(controller, RobotMap.AIM_UP_BUTTON);
  public Button AimerDownButton = new JoystickButton(controller, RobotMap.AIM_DOWN_BUTTON);
  public Button ClimbHighButton = new JoystickButton(controller, RobotMap.CLIMB_HIGH_BUTTON);
  public Button ClimbLowButton = new JoystickButton(controller, RobotMap.CLIMB_LOW_BUTTON);
  public Button ShootButton = new JoystickButton(controller, RobotMap.SHOOT_BUTTON);


  public OI() {
    
    AimerUpButton.whileHeld(new AimUp());
    AimerDownButton.whileHeld(new AimDown());
    ClimbHighButton.whenPressed(new ClimbHigh());
    ClimbLowButton.whenPressed(new ClimbLow());
    ShootButton.whenPressed(new Shoot());
}
}