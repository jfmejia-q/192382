import java.util.Scanner;

public class Logica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double sueldo1, sueldo2, sueldo3, sueldo4, sueldo5, sueldo6, sueldo7 = 0, sueldo8, sueldo9, sueldo10;
        float sueldototal;
        
        System.out.println("por favor los 10 empleados pueden ingresar sus sueldos");
        
       
        sueldo1=entrada.nextDouble();
        sueldo2=entrada.nextDouble();
        sueldo3=entrada.nextDouble();
        sueldo4=entrada.nextDouble();
        sueldo5=entrada.nextDouble();
        sueldo7=entrada.nextDouble();
        sueldo6=entrada.nextDouble();
        sueldo8=entrada.nextDouble();
        sueldo9=entrada.nextDouble();
        sueldo10=entrada.nextDouble();
        if (sueldo1<=0 && sueldo2<=0 && sueldo3<=0 && sueldo4<=0 && sueldo5<=0 && sueldo6<=0 && sueldo7<=0 && sueldo8<=0 && sueldo9<=0 && sueldo10<=0) {
            System.out.println("valor de sueldo no aceptado");
        }else {
            System.out.println("sueldo aceptado");
        } 
       
            
            if (sueldo1>=100 && sueldo1<300) {
            System.out.println("eres un guerrero del equilibrio y los extremos tambien tienen derecho"   +sueldo1);
        }  
            if (sueldo1>300) {
                System.out.println("tienes un sueldo VIP"   +sueldo1);
            }
            if (sueldo2>=100 && sueldo2<300) {
                System.out.println("eres un guerrero del equilibrio y los extremos tambien tienen derecho"   +sueldo2);

            } if (sueldo2>300) {
                System.out.println("tienes un sueldo VIP"   +sueldo2);
                
            }if (sueldo3>=100 && sueldo3<300) {
                System.out.println("eres un guerrero del equilibrio y los extremos tambien tienen derecho"   +sueldo3);
            }
            if (sueldo3>300) {
                System.out.println("tienes un sueldo VIP"   +sueldo3);
                
            }if (sueldo4>=100 && sueldo4<300) {
                System.out.println("eres un guerrero del equilibrio y los extremos tambien tienen derecho" +sueldo4);
                
             }if (sueldo4>300) {
                System.out.println("tienes un sueldo VIP" +sueldo4);

                
             }if (sueldo5>=100 && sueldo5<300) {
                System.out.println("eres un guerrero del equilibrio y los extremos tambien tienen derecho" +sueldo5);
            }  if (sueldo5>300) {
                System.out.println("tienes un sueldo VIP" +sueldo5);
                
            }if (sueldo6>=100 && sueldo6<300) {
                System.out.println("eres un guerrero del equilibrio y los extremos tambien tienen derecho" +sueldo6);

            }if (sueldo6>300) {
                System.out.println("tienes un sueldo VIP" +sueldo6);
                
            } if (sueldo7>=100 && sueldo7<300) {
                System.out.println("eres un guerrero del equilibrio y los extremos tambien tienen derecho" +sueldo7);

            }if (sueldo7>300) {
                System.out.println("tienes un sueldo VIP" +sueldo7);
            }if (sueldo8>=100 && sueldo8<300) {
                System.out.println("eres un guerrero del equilibrio y los extremos tambien tienen derecho"  +sueldo8);
            }  if (sueldo8>300) {
                System.out.println("tienes un sueldo VIP" +sueldo8);
                
            }if (sueldo9>=100 && sueldo9<300) {
                System.out.println("eres un guerrero del equilibrio y los extremos tambien tienen derecho" +sueldo9);
            }  if (sueldo9>300) {
                System.out.println("tienes un sueldo VIP" +sueldo9);
                
            }if (sueldo10>=100 && sueldo10<300) {
                System.out.println("eres un guerrero del equilibrio y los extremos tambien tienen derecho" +sueldo10);
            }  if (sueldo10>300) {
                System.out.println("tienes un sueldo VIP" +sueldo10);
                
            } sueldototal=(float) (sueldo1+sueldo2+sueldo3+sueldo4+sueldo5+sueldo6+sueldo7+sueldo8+sueldo9+sueldo10);
            System.out.println("el sueldo total es" +sueldototal);
        }
    }