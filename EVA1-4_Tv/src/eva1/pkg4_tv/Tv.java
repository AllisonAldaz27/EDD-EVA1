package eva1.pkg4_tv;

public class Tv {

    private int volumen;
    private int canal;
    boolean power;

    //constructores
    public Tv() {
        volumen = 2;
        canal =0;
        power = false; //apagado

    }
    //metodos para operar la tv
    //encender y apagar la tv

    public void cambiarEstadotv() {
        //verificar el estado de la tv
        if (power == true) {
            power = false;
            System.out.println("APAGANDO PANTALLA");
        } else {
            power = true;
            System.out.println("ENCENDIENDO PANTALLA");
        }
    }

    //volumen
    public void subirVolumen() {
        if (power == true) {//la tv esta prendida
            if (volumen < 100) {
                volumen = volumen + 1; //acumulador 
                System.out.println("Volumen: " + volumen);
            }
        }
    }

    public void bajarVolumen() {
        if (power == true) {
            if (volumen > 0) {

                volumen = volumen - 1; //acumulador 
                System.out.println("Volumen: " + volumen);
            }
        }
    }

    public void subirdecanal() {
        if (power == true) {
                 canal=0;
                canal = canal + 1;
                if (canal > 100) {
                 canal=0;
                  System.out.println("canal:  " + canal); 
                }
        }
    }

    public void bajardecanal() {
        if (power == true) {
                canal = canal - 1;
                if (canal<0){
                    canal=100;
                System.out.println("Canal:  " + canal);
        }
        }
    }
}
