/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import java.util.function.BooleanSupplier;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.InstantCommand;
import frc.robot.Robot;
import frc.robot.subsystems.Cannon;


public class OpenValve extends InstantCommand {
  private Cannon m_cannon;

  public OpenValve(Cannon cannon) {
    m_cannon = cannon;
    requires(m_cannon);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    m_cannon.openValve();
  }

  // // Make this return true when this Command no longer needs to run execute()
  // @Override
  // protected boolean isFinished() {
  //   return true;
  // }

}
