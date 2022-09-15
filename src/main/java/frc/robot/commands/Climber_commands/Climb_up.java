// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.Climber_commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class Climb_up extends CommandBase {
  /** Creates a new Climb_up. */
  public Climb_up() {
    addRequirements(Robot.m_climb);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    Robot.m_climb.getAir();

    Robot.m_climb.climberUp();
  }
  
   
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
