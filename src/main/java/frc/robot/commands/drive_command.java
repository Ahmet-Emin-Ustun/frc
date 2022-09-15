// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Robot;

public class drive_command extends CommandBase {
  /** Creates a new drive_command. */
  public drive_command() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(Robot.m_DriveSubsytem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
     double move = -Robot.oi.stick.getY();
     double turn = Robot.oi.stick.getX();

     Robot.m_DriveSubsytem.driving(move,turn);
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
