import java.io.*; 
/** 
 * 
 * @author Billy Joel 
 */ 
public class Prueba { 
    public static void main(String args[]) throws IOException{ 
        InputStreamReader is= new InputStreamReader(System.in); 
        BufferedReader bf= new BufferedReader(is); 
        int length = 4; 
        boolean correcto = true; 
        
        String[]titulo = {"CENTRO","ZONA","EQUIPO","CABLE"};
        String[] vec = {"","","",""}; 
        //Leyendo los valores para cada casilla del vector 
        for(int i = 0; i < vec.length; i++){ 
            do{ 
                //try{ 
                System.out.print(titulo[i]+ " : "); 
                vec[i] = bf.readLine(); 
                correcto = true; 
                //}catch(NumberFormatException x){ 
                //    correcto = false; 
                //    System.out.println("Solamente se permiten introducir números"); 
                //} 
            }while(!correcto); 
        } 
        System.out.println("\nImprimiendo el contenido..."); 
        //for(int i = 0; i < vec.length; i++) 
        //    System.out.println("El valor de " + titulo[i] + " es: " + vec[i]); 
        String Param = vec[0]+","+vec[1]+","+vec[2]+","+vec[3];
        System.out.println(Param);

    } 
} 