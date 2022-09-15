// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;


import edu.wpi.first.wpilibj.motorcontrol.PWMTalonSRX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class shooter extends SubsystemBase {
  public PWMTalonSRX shooterMotor = new PWMTalonSRX(Constants.shooterMotorport);
  public PWMTalonSRX degreeXMotor = new PWMTalonSRX(Constants.degreeXMotorport);
  public PWMTalonSRX degreeYMotor = new PWMTalonSRX(Constants.degreeYMotorport);
  private final double armdegree = 360.0 / 512 * 26 / 42 * 18 / 60 * 18 / 84;

 
  
  /** Creates a new shooter. */
  public shooter() {
    shooterMotor.set(0);
  }
   
  public void shootTheBall(){
    shooterMotor.set(1);
  }
  public void HoldTheball(){
    shooterMotor.set(0);
  }
   
  public void setXdegree(double armValueStickX){
    if(Math.abs(armValueStickX) < 0.1){
      armValueStickX = 0;
    }

    armValueStickX *= 0.5;
    if(armValueStickX * armdegree > 175){
      degreeXMotor.set(0);
    }
    else if(armValueStickX * armdegree <= 0){
      degreeXMotor.set(0);
    }
    else{
      degreeXMotor.set(armValueStickX);
    }
    
      
  }

  public void setYdegree(double armValueStickY){
    if(Math.abs(armValueStickY) < 0.1){
      armValueStickY = 0;
    }

    armValueStickY *= 0.5;
    if(armValueStickY * armdegree > 175){
      degreeXMotor.set(0);
    }
    else if(armValueStickY * armdegree <= 0){
      degreeXMotor.set(0);
    }
    else{
      degreeXMotor.set(armValueStickY);
    }
  }

   
  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
