package ElectricityBillingSystem;

import java.util.ArrayList;

public class RunningProgram extends Menu{
    String tarikhBil,namaPengguna,alamatPengguna;
    double tungakkan,cajSemasa, jumlahBayaranBil;
    int jumlahUnitKegunaan, bacaanMeterDahulu, bacaanMeterSekarang;
    long nomborAkaun,invoisCukai,noMeter;

    static ArrayList<CustomerInfo> customerInfo = new ArrayList<>();

    public int addItem(int count){
        System.out.print("\nHow many customer you do you want to input : ");
        int size = sc.nextInt();
        while(size<=0||size>3) {
            System.out.println("You can enter up to 3 customers at a time. ");
            System.out.print("Please enter again: ");
            size=sc.nextInt();
        }
        for (int i=0; i < size; i++) {
            System.out.println("\nCustomer "+ (count+1));
            System.out.print("-------------");
            System.out.print("\nNombor Akaun             : ");
            nomborAkaun = sc.nextLong();
            System.out.print("Invois Cukai             : ");
            invoisCukai = sc.nextLong();
            System.out.print("Nama Pengguna            : ");
            namaPengguna = sc.next()+sc.nextLine();
            namaPengguna = namaPengguna.toUpperCase();
            System.out.print("Alamat Pengguna          : ");
            alamatPengguna = sc.next()+sc.nextLine();
            alamatPengguna = alamatPengguna.toUpperCase();
            System.out.print("Tarikh Bil               : ");
            tarikhBil = sc.next()+sc.nextLine();
            tarikhBil = tarikhBil.toUpperCase();
            System.out.print("Tunggakan                : ");
            tungakkan = sc.nextDouble();
            System.out.print("No Meter                 : ");
            noMeter = sc.nextLong();
            System.out.print("Bacaan Meter Dahulu      : ");
            bacaanMeterDahulu = sc.nextInt();
            while(bacaanMeterDahulu<0) {
                System.out.println("Enter again a positive number");
                System.out.print("Bacaan Meter Dahulu      : ");
                bacaanMeterDahulu = sc.nextInt();
            }
            System.out.print("Bacaan Meter Sekarang    : ");
            bacaanMeterSekarang= sc.nextInt();
            while(bacaanMeterSekarang<bacaanMeterDahulu){
                System.out.println("Bacaan meter sekarang must bigger than bacaan meter dahulu.");
                System.out.print("Enter again the Bacaan Meter Sekarang : ");
                bacaanMeterSekarang = sc.nextInt();
            }
            Calculation calculation = new Calculation();
            calculation.calculation(tungakkan, bacaanMeterDahulu, bacaanMeterSekarang);
            jumlahBayaranBil = calculation.getJumlahBayaranBil();
            cajSemasa = calculation.getCajSemasa();
            jumlahUnitKegunaan= calculation.getJumlahUnitKegunaan();
            count++;
            customerInfo.add(new CustomerInfo(nomborAkaun, invoisCukai, namaPengguna, alamatPengguna, tarikhBil, tungakkan, noMeter, bacaanMeterDahulu, bacaanMeterSekarang, jumlahBayaranBil,cajSemasa,jumlahUnitKegunaan));
        }
        System.out.println("\nData Has Been Successfully Save into Array List");
        return count;
    }

    public void displayData(int count){
        int time = 0;
        if(count==0){
            System.out.println("\nList is empty.");}
        else {
            for (CustomerInfo customerInfo : RunningProgram.customerInfo) {
                System.out.println("\nCustomer " + (time+1));
                System.out.print("-------------");
                System.out.print("\n------------------------------------------------\n");
                System.out.print("\t\t\t\t\tReceipt:\n");
                System.out.println("------------------------------------------------");
                System.out.printf("%n%s%d%n", "Nombor Akaun             : ", customerInfo.nomborAkaun);
                System.out.printf("%s%d%n", "Invois Cukai             : ", customerInfo.invoisCukai);
                System.out.printf("%s%s%n", "Nama Pengguna            : ", customerInfo.namaPengguna);
                System.out.printf("%s%s%n", "Alamat Pengguna          : ", customerInfo.alamatPengguna);
                System.out.printf("%s%s%n", "Tarikh Bil               : ", customerInfo.tarikhBil);
                System.out.printf("%s%d%n", "No Meter                 : ", customerInfo.noMeter);
                System.out.printf("%s%d%n", "Bacaan Meter Dahulu      : ", customerInfo.bacaanMeterDahulu);
                System.out.printf("%s%d%n", "Bacaan Meter Sekarang    : ", customerInfo.bacaanMeterSekarang);
                System.out.printf("%s%d%n", "Jumlah Unit Kegunaan     : ", customerInfo.jumlahUnitKegunaan);
                System.out.printf("%s%.2f%n", "Tungakkan                : ", customerInfo.tungakkan);
                System.out.printf("%s%.2f%n", "Caj Semasa               : ", customerInfo.cajSemasa);
                System.out.println("------------------------------------------------");
                System.out.printf("%s%.2f%n", "Jumlah Bayaran Bil       : ", customerInfo.jumlahBayaranBil);
                System.out.println("------------------------------------------------");
                time++;
            }
            System.out.println("Thank You!");
        }
    }
}
