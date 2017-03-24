class StreetLights {
    
    int lightNumbers, m, k, turnedOnLight = 0;
    int[] lights;
    
    StreetLights(int[] lights, int m, int k) {
        this.lightNumbers = lights.length;
        this.m = m;
        this.k = k;
        this.lights = lights;
    }
    
    void checkLights () {
        int i_mod_m, checkLight = 0;
        for (int i = 0; i < this.lightNumbers; i++) {
            i_mod_m = i % this.m;
            if (i_mod_m == 0) {
                checkLight = 0;
                System.out.println("i: " + i);
            }
            checkLight += this.lights[i];
            if (this.k + i_mod_m - checkLight >= this.m) {
                this.lights[i] = 1;
                turnedOnLight++;
            }
        }
    }
}

public class AntiqueStreetLights {

    public static void main(String[] args) throws InterruptedException {
        int[] l1 = {0, 1, 0, 0, 1};
        StreetLights sl1 = new StreetLights(l1, 2, 1);
        sl1.checkLights();
        System.out.println(Arrays.toString(sl1.lights) + sl1.turnedOnLight);
        
        int[] l2 = {0, 0, 0, 0, 1, 0, 1, 0, 0, 0, 1, 0};
        StreetLights sl2 = new StreetLights(l2, 4, 2);
        sl2.checkLights();
        System.out.println(Arrays.toString(sl2.lights) + sl2.turnedOnLight);
    }
}
