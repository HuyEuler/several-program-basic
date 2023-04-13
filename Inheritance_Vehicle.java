class Vehicle{
    double speed;
    public String color;

    void current_speed(double speed){
        this.speed = speed;
    }

    void display(){
        System.out.println("Thong so car : " + speed + "(km/h)  " + color);
    }

}

class Motorbike extends  Vehicle{
    static int gear = 0;

    void shifter(){
        if(gear < 4){
            gear = gear + 1;
        }
        else{
            gear = 0;
        }
    }

    void display_gear(){
        System.out.println("Current gear is " + gear);
    }
}

class Inheritance_Vehicle{
    public static void main(String[] args) {
        Motorbike a = new Motorbike();
        a.current_speed(50);
        a.color = "Red";
        
        a.shifter();
        a.shifter();
        a.shifter();
        a.shifter();
        a.shifter();
        a.shifter();
    
        a.display();
        a.display_gear();    
    }
}