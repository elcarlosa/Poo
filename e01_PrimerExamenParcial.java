import java.util.Scanner;

public class e01_PrimerExamenParcial {
    public static void main(String[] args) {
        String nombre;
        double PE;
        Character R,G,participante;
        int CA=0,A=0, CD=0,CT=0, T=0, E = 0, CE=0,CH=0,CM=0,DD=0,TI=0,TD,P;
        Scanner obj = new Scanner(System.in);
        do{
            TI++;
            System.out.println("Dime tu nombre");nombre = obj.next();
            System.out.printf("Hola ", nombre);
            System.out.println("Dime tu edad");E=obj.nextInt();
            do{
            if(E>=18){
                CE= CE + E;
            }
            else{
                System.out.println("La edad es incorrecta, escriba otra");E= obj.nextInt();
            }
            }while(E<18);

            System.out.println("Escribe cual es tu sexo");G=Character.toUpperCase(obj.next().charAt(0));
            do{
                P=0;
                if(G=='H'){
                    CH=CH+1;
                    P++;
                }
                else if(G=='M'){
                    CM++;
                    P++;
                }
            }while(P!=1);
            System.out.println("Que tipo de participante es usted? [D]docente [A]alumno [T]trabajador ");participante=Character.toUpperCase(obj.next().charAt(0));
            do{
                P=0;
                if(participante=='D'){
                    CD=CD+1;
                    DD=DD+80;
                    P++;
                }
                else if(participante=='A'){
                    A++;
                    CA=CA+50;
                    P++;
                }
                else if(participante=='T'){
                    T++;
                    CT=CT+60;
                    P++;
                }
            }while(P!=1);
            System.out.println("Si desea agregar otra persona escriba S, de lo contrario escriba cualquier letra");R = Character.toUpperCase(obj.next().charAt(0));
        }while (R=='S');
        System.out.printf("El total de alumnos es: ");
        System.out.println(A);
        System.out.printf("El total de docentes es: ");
        System.out.println(CD);
        System.out.printf("El total de trabajadores es: ");
        System.out.println(T);
        System.out.printf("El total de hombres es: ",CH);
        System.out.println(CH);
        System.out.printf("El total de mujeres es: ");
        System.out.println(CM);
        System.out.printf("El total de participantes es: ");
        System.out.println(TI);
        PE=CE/TI;
        System.out.printf("El promedio de edad es: ",PE);
        System.out.println("...");
        System.out.printf("El total recaudado de alumnos es: ");
        System.out.println(CA);
        System.out.printf("El total recaudado de docentes es: ");
        System.out.println(DD);
        System.out.printf("El total recaudado de trabajadores es: ");
        System.out.println(CT);
        TD=CA+DD+CT;
        System.out.printf("El recaudado total es: ");
        System.out.println(TD);

        if(TD<100)
        System.out.println("El evento concluye con ganancias bajas");
        else if(TD>100&&TD<200)
        System.out.println("El evento concluye con ganancias moderadas");
        else if(TD>200)
        System.out.println("El evento concluye con BUENAS ganancias");
        System.out.println("Fin del programa");
    }
}
