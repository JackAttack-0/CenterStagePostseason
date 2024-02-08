import org.firstinspires.ftc.teamcode.MainMethods;

@TeleOp(name="TeleOp", group="concept")
public class TeleOp extends MainMethods {
    @Override public void runOpMode() throws InterruptedException {
        InitializeRobot();
        waitForStart();
        
        while (opModeIsActive())
        {
            double motor1Power = 0;
            double motor2Power = 0;
            double motor3Power = 0;
            double motor4Power = 0;
            
            double driveScale=-1;
            double sideScale=1;
            double turnScale=0.75;

            double driveInput = gamepad1.left_stick_y;
            double sideInput  = gamepad1.left_stick_x;
            double turnInput  = gamepad1.right_stick_x;

            double speedScale = 1.0;

            motor1Power = driveScale*driveInput
                          +sideScale*sideInput
                          +turnScale*turnInput;
            motor2Power = driveScale*driveInput
                          -sideScale*sideInput
                          -turnScale*turnInput;
            motor3Power = driveScale*driveInput
                          -sideScale*sideInput
                          +turnScale*turnInput;
            motor4Power = driveScale*driveInput
                          +sideScale*sideInput
                          -turnScale*turnInput;

            
            
            speedScale=Math.abs(motor1Power)>speedScale?Math.abs(motor1Power):speedScale;
            speedScale=Math.abs(motor2Power)>speedScale?Math.abs(motor2Power):speedScale;
            speedScale=Math.abs(motor3Power)>speedScale?Math.abs(motor3Power):speedScale;
            speedScale=Math.abs(motor4Power)>speedScale?Math.abs(motor4Power):speedScale;

            motor1.setPower(motor1Power/scale);
            motor2.setPower(motor2Power/scale);
            motor3.setPower(motor3Power/scale);
            motor4.setPower(motor4Power/scale);
            
            YawPitchRollAngles orientation = imu.getRobotYawPitchRollAngles();

            telemetry.addData("motor1",motor1Power);
            telemetry.addData("motor2",motor2Power);
            telemetry.addData("motor3",motor3Power);
            telemetry.addData("motor4",motor4Power);

            telemetry.addData("Heading",orientation.getYaw());
    
}
