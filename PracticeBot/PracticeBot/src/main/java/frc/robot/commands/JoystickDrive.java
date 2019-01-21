package main.java.frc.robot.commands;


public class JoystickDrive extends Command {

    public JoystickDrive(){
        requires(Robot.m_subsystem);
    }

    @Override
    protected void initialize() {
    }

    @Override
    protected void execute() {
    }

    @Override
    protected boolean isFinished() {
      return false;
    }

    @Override
    protected void end() {
    }

    @Override
    protected void interrupted() {
    }
}