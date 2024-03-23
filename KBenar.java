public class KBenar {
    public static void main(String[] args) {
        // Fakta awal
        boolean A = true;
        boolean E = true;
        boolean K = false; // Nilai awal K
        
        // Iterasi pertama
        boolean B = false;
        boolean C = false;
        boolean F = false;
        boolean G = false;
        boolean D = false;
        boolean H = false;
        boolean I = false;
        boolean J = false;
        
        if (A && B) {
            C = true;
        }
        
        if (C) {
            D = true;
        }
        
        if (A && E) {
            F = true;
        }
        
        if (A) {
            G = true;
        }
        
        if (F && G) {
            D = true;
        }
        
        if (G && E) {
            H = true;
        }
        
        if (C && H) {
            I = true;
        }
        
        if (I && A) {
            J = true;
        }
        
        if (G) {
            J = true;
        }
        
        if (J) {
            K = true;
        }
        
        // Output hasil
        if (K) {
            System.out.println("K bernilai benar");
        } else {
            System.out.println("K bernilai salah");
        }
    }
}
