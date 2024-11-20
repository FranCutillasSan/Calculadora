import java util Scanner;

lass Calculadora{
        public static void main(String[] args) {
        system.out.println("Escriba un numero: ") 
        Scanner sc1 = new Scanner (system.in);
        int a = sc1.nextInt();
        system.out.println("Escriba otro numero: ") 
        int b = sc1.nextInt();
        int suma=a+b;
        int resta=a-b;
        int multiplicacion=a*b;
        int division=a/b;  
        
        System.out.println("La suma de " + a + " más "  + b + " es igual a "  + suma);
        System.out.println("La resta de " + a + " menos "  + b + " es igual a "  + resta);
        System.out.println("La multipación de " + a + " por "  + b + " es igual a "  + multiplicacion);
        System.out.println("La division de " + a + " entre "  + b + " es igual a "  + division);
     }
    }
    
    
}
