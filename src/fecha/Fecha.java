
package fecha;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Fecha {

    private int dia;
    private int mes;
    private int anyo;
    
public Fecha(){

}



  public Fecha(int dia, int mes, int anyo) {
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }
  

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }

    public static void main(String[] args) {

        int dia;
        int mes;
        int anyo;

        System.out.println("Dame una Fecha");

        System.out.println("Dame un año valido");
        Scanner sc = new Scanner(System.in);
        anyo = sc.nextInt();
        System.out.println("el mejor");

        System.out.println("Dame un mes valido");
        Scanner sc1 = new Scanner(System.in);
        mes = sc.nextInt();

        System.out.println("Dame un día valido");
        Scanner sc2 = new Scanner(System.in);
        dia = sc.nextInt();

        Fecha bisi = new Fecha(dia, mes, anyo);

        System.out.print("la Fecha es correcta? ");
         System.out.println(bisi.fechaCorrecta());
        
        if (bisi.fechaCorrecta() == true){ 
        
            System.out.print("La fecha es Bisiesta? ");
            System.out.println(bisi.esBisiesto());
            
       }

    }

  //version 3

    public boolean fechaCorrecta() {
        boolean diaCorrecto,mesCorrecto,añoCorrecto;
        añoCorrecto=anyo>0;
        mesCorrecto=mes>0 & mes<13;

        if (anyo > 0000 & anyo <= 2016) {

            if (mes >= 1 & mes <= 12) {

                switch (mes) {
                    case 2:

                        if (this.esBisiesto() & dia > 0 & dia <= 29) {
                            return true;
                        }
                        if (!this.esBisiesto() & dia > 0 & dia <= 28) {
                            return true;
                        }
                        return false;

                    case 4:
                    case 6:
                    case 9:
                        if (dia > 0 & dia <= 30) {
                            return true;

                        }

                    default:
                        if (dia>0 & dia<= 31) {
                            return true;
                        }

                }
                return false;

            }
        }
        return false;

    }

    private boolean esBisiesto() {

        return anyo % 4 == 0 && anyo %100 != 0 || anyo % 400 == 0;

    }

    //private boolean diaSiguiente() {
    //    return anyo;
    //}

}

