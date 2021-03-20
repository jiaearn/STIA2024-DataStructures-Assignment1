package ElectricityBillingSystem;

public class ElectricityBillingSystem {

    public static void main(String[] args) {
        ElectricityBillingSystem electricityBillingSystem = new ElectricityBillingSystem();
        electricityBillingSystem.RunningProgram();
    }

    public void RunningProgram(){
        Menu menu = new Menu();
        menu.processChoice();
    }
}
