package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.*;
import org.firstinspires.ftc.robotcore.external.navigation.*;
import org.firstinspires.ftc.robotcore.external.Telemetry;
import com.qualcomm.robotcore.hardware.*;
import java.util.List;



public class MainMethods extends LinearOpMode {
    DcMotor    motors[]  = new DcMotor[4];

    DcMotor    motor1   = null;
    DcMotor    motor2   = null;
    DcMotor    motor3   = null;
    DcMotor    motor4   = null;

    IMU imu = null;

    void InitializeRobot() {
        imu = hardwareMap.get(IMU.class, "imu");
        
        motor1  = hardwareMap.get(DcMotor.class, "motor1");
        motor2  = hardwareMap.get(DcMotor.class, "motor2");
        motor3  = hardwareMap.get(DcMotor.class, "motor3");
        motor4  = hardwareMap.get(DcMotor.class, "motor4");
        
        motors[0]=(motor1);
        motors[1]=(motor2);
        motors[2]=(motor3);
        motors[3]=(motor4);

        motor1.setDirection(DcMotor.Direction.REVERSE);
        motor2.setDirection(DcMotor.Direction.FORWARD);
        motor3.setDirection(DcMotor.Direction.REVERSE);
        motor4.setDirection(DcMotor.Direction.FORWARD);

        telemetry.setDisplayFormat(Telemetry.DisplayFormat.HTML);
        telemetry.addData(">", "Press Start");
        telemetry.update();        

    }
            
}