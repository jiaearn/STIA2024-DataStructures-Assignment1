package ElectricityBillingSystem;

public class CustomerInfo extends RunningProgram {

    public CustomerInfo(long nomborAkaun, long invoisCukai, String namaPengguna, String alamatPengguna, String tarikhBil, double tungakkan, long noMeter, int bacaanMeterDahulu, int bacaanMeterSekarang, double jumlahBayaranBil, double cajSemasa, int jumlahUnitKegunaan) {
        this.nomborAkaun = nomborAkaun;
        this.invoisCukai = invoisCukai;
        this.namaPengguna = namaPengguna;
        this.alamatPengguna = alamatPengguna;
        this.tarikhBil = tarikhBil;
        this.tungakkan = tungakkan;
        this.bacaanMeterDahulu = bacaanMeterDahulu;
        this.bacaanMeterSekarang = bacaanMeterSekarang;
        this.noMeter = noMeter;
        this.jumlahBayaranBil= jumlahBayaranBil;
        this.cajSemasa= cajSemasa;
        this.jumlahUnitKegunaan=jumlahUnitKegunaan;
    }
}
