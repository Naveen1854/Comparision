class vehicle{
    int now, mileage,capacity;
    double hp;
    String com_name,vehicle_no,color,fuel_type;
    void run(){
        System.out.println("Running");
    }
}
class pulsar extends vehicle{
    String owner_name;
    pulsar(){
        now = 2;
        mileage = 20;
        capacity = 2;
        com_name = "Bajaj";
        vehicle_no = "TS 24 7578";
        color = "Black";
        fuel_type = "petrol";
        owner_name = "Naveen";
    }
    void driver(){
        System.out.println("Driving");
    }
}
public class InheritanceDemo{
    public static void main(String args[]){
        pulsar p = new pulsar();
        p.run();
        p.driver();
        System. out.println(p.now + ","+ p.color + "," + p.owner_name);
    }
}