package Seman2;

public class Ejercicio1 {
    public static void main(String[] args) {
        //forma1 -> definiendo directamente los valores del arreglo
        int[] a = {4,8,9,6,1,2,10};

        for(int i = 0; i < a.length; i++){
            System.out.println("a["+ i +"]="+ a[i]);
        }
        
            int par = 0;
            int impar = 0;
            for(int i = 0; i < a.length; i++){
                if (a [i]%2 ==0){
                    par +=a[i];
                }else{
                    impar  +=a[i];
                   }
                }
           
                System.out.println("la suma numeros pares es =" + par);
              System.out.println("la suma numeros impar es =" + impar );
        }

    }

