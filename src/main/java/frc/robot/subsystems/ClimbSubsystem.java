package frc.robot.subsystems;
import edu.wpi.first.wpilibj.command.Subsystem;

// import static org.junit.Assume.assumeTrue;

import edu.wpi.first.wpilibj.Spark;
import frc.robot.OI;
import frc.robot.RobotMap;


public class ClimbSubsystem extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    Spark climb = new Spark(RobotMap.CLIMB_STUFF);
    private double climbSpeedUp=0.8;
    private double climbSpeedDown=-0.8;
    private double climbSpeedStop=0;

    public boolean high;
    public boolean low;
    public boolean stop;

    @Override
    public void initDefaultCommand() {
      // Set the default command for a subsystem here.
      // setDefaultCommand(new MySpecialCommand());
      //setDefaultCommand(new Drive());
    }
    public void moveHigh(){
        high = OI.controller.getRawButton(2);
        if (high == true){
            climb.set(climbSpeedUp);
        }
           
    }
    public void moveLow(){
        low = OI.controller.getRawButton(3);
        if(low == true){
            climb.set(climbSpeedDown);
        }
    }
    public void moveStop(){
        climb.set(climbSpeedStop);
    }

}