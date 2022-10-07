package IntroduccionProgramacion;

import java.util.Scanner;

public class CalculoDepreciacionActivos {

	public static void main(String[] args) {
	
		int MetodoUti,CostoAct,AVU,VR;
		int Metododep1,Metododep2,Metododep3,Metododep4;
		
				
Scanner SC = new Scanner(System.in);

System.out.println("Bienvenido.Este programa puede calcular la depreciacion de activos de una empresa. ");
System.out.println("Existen 4 tipos de metodo para calcular la depreciacion.Son los siguientes:");
System.out.println("1.Metodo de linea recta");
System.out.println("2.Metodo de la suma de los digitos por año");
System.out.println("3.Metodo de las unidades producidas");
System.out.println("4.Metodo de reduccion de saldo");
System.out.println("¿ Cual metodo desea utilizar ?");
MetodoUti = SC.nextInt();

switch (MetodoUti) {
case 1: {
	
	System.out.println("-------- Metodo de linea recta --------");
	System.out.print("Ingrese el costo del activo: ");
	CostoAct=SC.nextInt();
	
	System.out.print("Ingrese los años de vida util: ");
    AVU=SC.nextInt();
    
    System.out.print(" Ingrese el valor residual estimado: ");
    VR=SC.nextInt();
    
    
    Metododep1=(CostoAct-VR)/AVU;
    
    System.out.println("La depreciacion anual es de: " +Metododep1);
    
    
}break;

case 2: {
	
	System.out.println("-------- Metodo de la suma de los digitos por año --------");
	System.out.print("Ingrese el costo del activo: ");
	CostoAct=SC.nextInt();
	
	System.out.print("Ingrese los años de vida util: ");
    AVU=SC.nextInt();
    
    System.out.print(" Ingrese el valor residual estimado: ");
    VR=SC.nextInt();
    
    int suma=0;
	
	  
	  
	  for(int i=1;i <=AVU; i++) {
		  
		  suma=suma+i;
	  }
	
	  System.out.println("La suma de los "+ AVU +" años de vida  es: "+ suma);
    
    int ImpDep=(CostoAct-VR);
    int Fraccion=(AVU/suma);
    double por=(33*100);
   
    Metododep2=(ImpDep*Fraccion);
    
    double Metododep2_5=(Metododep2*por); 
    
	System.out.println("La depreciacion anual es de: "+Metododep2_5);
	
	
	
}break;







}


		
		
SC.close();		
	}

}
