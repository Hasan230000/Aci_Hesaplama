

package aci;
import java.util.Scanner;
/**
 *
 * @author Costa
 */
public class Aci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner veri=new Scanner(System.in);
        int a1,a2,a3 = 0;
        System.out.print("1. açı=");
        a1=veri.nextInt();
        System.out.print("\n2. açı=");
        a2=veri.nextInt();
        if(a1>=1 && a2>=1 && (a1+a2)<=178){
            a3=(180-(a1+a2));
        }
        System.out.print("\n3. açı:"+a3);
    }
    
}
