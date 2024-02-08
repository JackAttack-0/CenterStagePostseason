import org.firstinspires.ftc.teamcode.MainMethods;

public class AutonomousTemplate  extends MainMethods{
    
    boolean blue = true;
    boolean back = false;
    String name = "BlueFront";


    public void giveParameters() {
        blue = true;
        back = false;
        name = "BlueFront";

    }

    int mirror = (blue) ? 1 : -1;

    @Override public void runOpMode() throws InterruptedException {
        super.InitializeRobot();

        telemetry.addData("Mode", name+" mirror:"+mirror+" back:"+back+" left:"+leftField);
        telemetry.addData(">", "Press Start");
        telemetry.update();  

        waitForStart();
        autonomous();
    }

    void autonomous() {

    }

}
