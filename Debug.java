import org.firstinspires.ftc.teamcode.MainMethods;


public class Debug extends TeleOp {
    super.InitializeRobot();
    waitForStart();

    @TeleOp(name="Debug", group="concept")
    public void runOpMode() throws InterruptedException {

        while(opModeIsActive) {
            displayFullTelemetry();
        }
    }
    
    public void displayFullTelemetry() {
        telemetry.addData("motor1: power=" + motor1Power + ", encoder position=" + motor1.getCurrentPosition(), "Front Left")
        telemetry.addData("motor2: power=" + motor2Power + ", encoder position=" + motor2.getCurrentPosition(), "Front Right")
        telemetry.addData("motor3: power=" + motor3Power + ", encoder position=" + motor3.getCurrentPosition(), "Back Left")
        telemetry.addData("motor4: power=" + motor4Power + ", encoder position=" + motor4.getCurrentPosition(), "Back Right")

        telemetry.addData("Heading",super.getAngle())

        telemetry.addData(">","Gamepad1");

        telemetry.addData("Left Stick: x=" + gamepad1.left_stick_x + "(Usage Not Set), y=" + gamepad1.left_stick_y, "Usage not set");
        telemetry.addData("Right Stick: x=" + gamepad1.right_stick_x + "(Usage Not Set), y=" + gamepad1.right_stick_y, "Usage not set");
        telemetry.addData("dPad: up=" + gamepad1.dpad_up + ", left=" + gamepad1.dpad_left + ", right=" + gamepad1.dpad_right + ", left=" + gamepad1.dpad_down, "Usage not set");
        telemetry.addData("Buttons: y=" + gamepad1.y + "(Usage not set), X=" + gamepad1.x + "(Usage not set), B=" + gamepad1.b + "(Usage not set), A=" + gamepad1.a, "Usage not set");
        telemetry.addData("Bumpers: left=" + gamepad1.left_bumper + "(Usage Not Set), right=" + gamepad1.right_bumper, "Usage not set");
        telemetry.addData("Triggers: left=" + gamepad1.left_trigger + "(Usage Not Set), right=" + gamepad1.right_trigger, "Usage not set");

        telemetry.addData(">","Gamepad2");

        telemetry.addData("Left Stick: x=" + gamepad2.left_stick_x + "(Usage Not Set), y=" + gamepad2.left_stick_y, "Usage not set");
        telemetry.addData("Right Stick: x=" + gamepad2.right_stick_x + "(Usage Not Set), y=" + gamepad2.right_stick_y, "Usage not set");
        telemetry.addData("dPad: up=" + gamepad2.dpad_up + ", left=" + gamepad2.dpad_left + ", right=" + gamepad2.dpad_right + ", left=" + gamepad2.dpad_down, "Usage not set");
        telemetry.addData("Buttons: y=" + gamepad2.y + "(Usage not set), X=" + gamepad2.x + "(Usage not set), B=" + gamepad2.b + "(Usage not set), A=" + gamepad2.a, "Usage not set");
        telemetry.addData("Bumpers: left=" + gamepad2.left_bumper + "(Usage Not Set), right=" + gamepad2.right_bumper, "Usage not set");
        telemetry.addData("Triggers: left=" + gamepad2.left_trigger + "(Usage Not Set), right=" + gamepad2.right_trigger, "Usage not set");
    }
}
