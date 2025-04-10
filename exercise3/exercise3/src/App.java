public class App {
    public static void main(String[] args) throws Exception {
       
        // HybridVehicle HybridSedan = new HybridVehicle( "Hybrid Sedan");
 
        // System.out.println("car name : " + HybridSedan.getCarname());
        // HybridSedan.chargebattery();
        // HybridSedan.fillgas();
 
        // HybridVehicle HybridPickup = new HybridVehicle ("Hybrid pickup");
 
        // System.out.println("car name : " + HybridPickup.getCarname());
        // HybridPickup.chargebattery();
        // HybridPickup.fillgas();    

        HybridVehicle car1 = new HybridSedan();
        car1.carName = "Hybrid Sedan";

        HybridVehicle car2 = new HybridPickup();
        car2.carName = "Hybrid Pickup";
        
        Carwash wash1 = new Carwash();
        Carwash wash2 = new Carwash();

        wash1.wash(car1);
        wash2.wash(car2);
    }
}