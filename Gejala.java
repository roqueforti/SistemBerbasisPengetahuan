public class Gejala {
    public static void main(String[] args) {
        // Fakta 
        boolean A1 = true; 
        boolean A2 = true; 
        boolean A4 = true; 
        
        // Hipotesis awal
        boolean P4 = false; 
        boolean P5 = false; 
        
        // Proses backward chaining
        if (P4 || P5) {
            if (P4) {
                if (P3() && A4) {
                    P4 = true;
                } else {
                    P4 = false;
                }
            }
            
            if (P5) {
                if (P3() && A5()) {
                    P5 = true;
                } else {
                    P5 = false;
                }
            }
        }
        
        if (P4 && !P5) {
            System.out.println("Hipotesis yang benar adalah batuk rejan (P4)");
        } else if (!P4 && P5) {
            System.out.println("Hipotesis yang benar adalah infeksi saluran nafas (P5)");
        } else if (P4 && P5) {
            System.out.println("Kedua hipotesis (P4 dan P5) mungkin benar, perlu pemeriksaan lebih lanjut");
        } else {
            System.out.println("Tidak dapat menentukan hipotesis yang benar");
        }
    }
    
    // Pengecekan rule R3
    static boolean P3() {
        return true; 
    }
    
    // Pengecekan rule R5
    static boolean A5() {
        return true; 
    }
}
