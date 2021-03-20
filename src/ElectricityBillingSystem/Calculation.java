package ElectricityBillingSystem;

public class Calculation extends RunningProgram {
    double kadar;
    double blokProrata;

    public void setJumlahBayaranBil(double jumlahBayaranBil) {
        this.jumlahBayaranBil = jumlahBayaranBil;
    }

    public double getJumlahBayaranBil() {
        setJumlahBayaranBil(jumlahBayaranBil);
        return jumlahBayaranBil;
    }

    public void setJumlahUnitKegunaan(int jumlahUnitKegunaan) {
        this.jumlahUnitKegunaan = jumlahUnitKegunaan;
    }

    public int getJumlahUnitKegunaan() {
        setJumlahUnitKegunaan(jumlahUnitKegunaan);
        return jumlahUnitKegunaan;
    }

    public void setCajSemasa(double cajSemasa) {
        this.cajSemasa = cajSemasa;
    }

    public double getCajSemasa() {
        setCajSemasa(cajSemasa);
        return cajSemasa;
    }


    void calculation(double tungakkan, int bacaanMeterDahulu, int bacaanMeterSekarang) {
        jumlahUnitKegunaan = bacaanMeterSekarang - bacaanMeterDahulu;
        if (jumlahUnitKegunaan >= 0 && jumlahUnitKegunaan <= 200) {
            kadar = 0.218;
            cajSemasa = kadar * jumlahUnitKegunaan;
        }
        else if (jumlahUnitKegunaan >= 201 && jumlahUnitKegunaan <= 300) {
            kadar = 0.334;
            blokProrata = jumlahUnitKegunaan-200;
            cajSemasa = 43.6 + blokProrata * kadar;
        }
        else if (jumlahUnitKegunaan >= 301 && jumlahUnitKegunaan <= 600) {
            kadar = 0.516;
            blokProrata = jumlahUnitKegunaan - 300;
            cajSemasa = 77 + blokProrata * kadar;
        }
        else if (jumlahUnitKegunaan>= 601 && jumlahUnitKegunaan <= 900) {
            kadar = 0.546;
            blokProrata = jumlahUnitKegunaan- 600;
            cajSemasa= 231.8 + blokProrata * kadar;
        }
        else if (jumlahUnitKegunaan >= 901) {
            kadar = 0.571;
            blokProrata = jumlahUnitKegunaan - 900;
            cajSemasa = 395.6 + blokProrata * kadar;
        }
        jumlahBayaranBil = tungakkan + cajSemasa;
    }
}
