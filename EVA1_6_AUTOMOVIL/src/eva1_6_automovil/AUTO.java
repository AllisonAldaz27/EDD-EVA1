package eva1_6_automovil;

/**
 *
 * @author VOSTRO 3401
 */
public class AUTO {

    private String marca, placas, duenio, modelo;
    private int anio;

    //constructor
    public AUTO() {
        marca = "NISSAN";
        modelo = "F-230";
        placas = "JKAO400";
        anio = 2019;
        duenio = "SIN DUEÑO";
    }

    public AUTO(String marcaAuto, String modeloAuto, int anioAuto, String duenioAuto, String placasAuto) {
        marca = "NISSAN";
        modelo = "";
        placas = "AZK898";
        anio = 2019;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marcaAuto) {
        marca = marcaAuto;
    }

    public String getPlacas() {
        return placas;
    }

    public void setPlacas(String placasAuto) {
        placas = placasAuto;
    }

    public String getDueno() {
        return duenio;
    }

    public void setDueno(String duenioAuto) {
        duenio = duenioAuto;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modeloAuto) {
        modelo = modeloAuto;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anioAuto) {
        anio = anioAuto;
    }

    //calcular revalidacion
    public int calcularRev() {
        int adeudo = 0;
        if (anio <= 2000) {
            adeudo = 1500;
        } else if ((anio >= 2001) && (anio <= 2005)) {
            adeudo = 2000;

        } else if ((anio >= 2006) && (anio <= 2010)) {
            adeudo = 2500;
        } else if ((anio >= 2011) && (anio <= 2015)) {
            adeudo = 3000;
        } else {
            adeudo = 3500;
        }
        return adeudo;
    }

    public void imprimirDatos() {
        System.out.println("ADEUDO VEHICULAR:  ");
        System.out.println("Dueño:  " + duenio);
        System.out.println("Marca: " + marca);
        System.out.println("Modelo:  " + modelo);
        System.out.println("Año: " + anio);
        System.out.println("Placas: " + placas);
        System.out.println("Adeudo: " + calcularRev());
    }

}
