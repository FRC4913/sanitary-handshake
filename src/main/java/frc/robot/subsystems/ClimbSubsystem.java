package frc.robot.subsystems;
import edu.wpi.first.wpilibj.command.Subsystem;


import edu.wpi.first.wpilibj.Spark;
import frc.robot.OI;
import frc.robot.RobotMap;


public class ClimbSubsystem extends Subsystem {
    public boolean high;
    public boolean low;
    public double height = -1;
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    Spark climb = new Spark(RobotMap.CLIMB_STUFF);

    @Override
    public void initDefaultCommand() {
      // Set the default command for a subsystem here.
      // setDefaultCommand(new MySpecialCommand());
      //setDefaultCommand(new Drive());
    }


    public void Check2(){
        if (height<-1){
          height=-1;
        }else if (height>1){
          height=1;
        }
      }


    /*public double ClimbDown(){

        low = OI.controller.getRawButton(3);
        if (low == true){
        height=height-0.1;
        Check2();
        }
        climb.set(height);
        return height;
    }*/


    public double MoveHigh(){

        high = OI.controller.getRawButton(2);
        if (high == true){
          height = height + 0.1;
          Check2();
        }
        climb.set(height);
        return height;
      }
    
    public void Stop(){
        climb.set(height);
    }
    public double MoveLow(){

      low = OI.controller.getRawButton(1);
      if (low == true){
        height=height-0.1;
        Check2();
      }
      climb.set(height);
      return height;
     }
}

