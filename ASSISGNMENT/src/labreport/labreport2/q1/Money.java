package labreport.labreport2.q1;

import java.util.Random;

public class Money {
    private double money;
    private static double sum=0;
    Random r = new Random();

    public Money(){
        this.money = r.nextDouble()*(10001-1000)+1000;
        sum+=money;
    }

    public Money(double money) {
        this.money = money;
        sum+=money;
    }
    public Money(double[] a){
        money=0;
        for (int i=0;i<a.length;i++){
            money+=a[i];
        }
        sum+=money;
    }

    public void setMoney(double money) {
        sum-=this.money;
        this.money = money;
        sum+=this.money;

    }

    public double getMoney() {
        return money;
    }

    public double getSum(){
        return sum;
    }


    public String toString() {
        double ringgit = money / 100.0;
        int b100 = 0,b50 = 0,b20 = 0,b10 = 0,b5 = 0,b1 = 0,b05=0,b02=0,b01=0,b005=0,b001=0;
        if (ringgit / 100 >= 1) {
            b100 = (int) ringgit / 100;
            ringgit = ringgit % 100;
        }
        if (ringgit / 50 >= 1) {
            b50 = (int) ringgit / 50;
            ringgit = ringgit % 50;
        }
        if (ringgit / 20 >= 1) {
             b20 = (int) ringgit / 20;
            ringgit = ringgit % 20;

        }
        if (ringgit / 10 >= 1) {
             b10 = (int) ringgit / 10;
            ringgit = ringgit % 10;
        }
        if (ringgit / 5 >= 1) {
             b5 = (int) ringgit / 5;
            ringgit = ringgit % 5;
        }
        if (ringgit >= 1) {
             b1 = (int) ringgit;
            ringgit = ringgit % 1;
        }
        if (ringgit >= 0.5) {
             b05 = (int) (ringgit / 0.5);
            ringgit = ringgit % 0.5;
        }
        if (ringgit >= 0.2) {
             b02 = (int) (ringgit / 0.2);
            ringgit = ringgit % 0.2;
        }
        if (ringgit >= 0.1) {
             b01 = (int) (ringgit / 0.1);
            ringgit = ringgit % 0.1;
        }
        if (ringgit >= 0.05) {
             b005 = (int) (ringgit / 0.05);
            ringgit = ringgit % 0.05;
        }
        if (ringgit >= 0.01) {
             b001 = (int) (ringgit / 0.01);
            ringgit = ringgit % 0.01;
        }
        return "Amount = " + money + "(RM" + money / 100 + ")\n"
                + "\nRM100 = " + b100
                + "\nRM50 = " + b50
                + "\nRM20 = " + b20
                + "\nRM10 = " + b10
                + "\nRM5 = " + b5
                + "\nRM1 = " + b1
                + "\nRM0.50 = " + b05
                + "\nRM0.20 = " + b02
                + "\nRM0.10 = " + b01
                + "\nRM0.05 = " + b005
                + "\nRM0.01 = " + b001;
    }
}
