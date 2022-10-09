package IntroduccionProgramacion;


import java.util.Scanner;

public class CalculoDepreciacionActivos {

	public static void main(String[] args) {
	
		int MetodoUti,CostoAct,AVU,VR;
		int Metododep1;
		int a=0;		
		double Metododep2,Metododep3,Metododep4;
Scanner SC = new Scanner(System.in);
while (a<100) {
	
	System.out.println(" ");
System.out.println("Bienvenido.Este programa puede calcular la depreciacion de activos de una empresa. ");
System.out.println("Existen 4 tipos de metodo para calcular la depreciacion.Son los siguientes:");
System.out.println("1.Metodo de linea recta");
System.out.println("2.Metodo de la suma de los digitos por año");
System.out.println("3.Metodo de las unidades producidas");
System.out.println("4.Metodo de reduccion de saldo");
System.out.println("5.Salir de la app");
System.out.println("¿ Cual metodo desea utilizar ?");
MetodoUti = SC.nextInt();

switch (MetodoUti) {
case 1: {
	
	//Linea Recta
	
	System.out.println("-------- Metodo de linea recta --------");
	

	System.out.print("Ingrese el costo del activo: ");
	CostoAct=SC.nextInt();
		
			
	
	System.out.print("Ingrese los años de vida util: ");
    AVU=SC.nextInt();
    
    System.out.print(" Ingrese el valor residual estimado: ");
    VR=SC.nextInt(); 
    
    
Metododep1=(CostoAct-VR)/AVU;
    
    
    System.out.println("La depreciacion anual es de: " +Metododep1);
    System.out.println("");
    System.out.println("");
   
    
    
}break;

case 2: {
	//Suma de los digitos de los anios
	
	
	System.out.println("-------- Metodo de la suma de los digitos por año --------");
	System.out.print("Ingrese el costo del activo: ");
	CostoAct=SC.nextInt();
	
	System.out.print("Ingrese los años de vida util: ");
    AVU=SC.nextInt();
    
    System.out.print(" Ingrese el valor residual estimado: ");
    VR=SC.nextInt();
    
double suma=0;
	  
	  
	  for(int i=1;i <=AVU; i++) {
		  
		  suma=suma+i;
		  
	  }
	    int ImpDep=(CostoAct-VR);

	  System.out.println("La suma de los "+ AVU +" años de vida util es: "+ suma);
	  System.out.println(" ");
	  
	    System.out.println("El importe de depreciacion es de:" +ImpDep);

    
System.out.println(" ");



for( int k=AVU; k>=1 ;k--) {
    

  	double fraccion=k/suma;

  	Metododep2=(ImpDep*fraccion);
  	
  	
System.out.println("La depreciacion anual es : " +String.format("%.2f",Metododep2)+ " aproximadamente ");

        
}
  

     
  
	
}break;

case 3: {
	
	//Unidades producidas
	double UNIPRO;
	int ImpDep2;

	System.out.println("-------- Metodo de unidades producidas --------");
	System.out.print("Ingrese el costo del activo: ");
	CostoAct=SC.nextInt();
	
	System.out.print("Ingrese los años de vida util: ");
    AVU=SC.nextInt();
    
    System.out.print(" Ingrese el valor residual estimado: ");
    VR=SC.nextInt();
    
	System.out.println("Ingrese EL VALOR PRODUCIDO");
	UNIPRO=SC.nextDouble();
	  
    double PDA=(CostoAct-VR)/UNIPRO;
    double IPA=UNIPRO/AVU;
System.out.println("Producciones por anios: "+String.format("%.2f",IPA));    
   System.out.println(" ");
     
   
   for( int k=AVU; k>=1 ;k--) {
	    

	   double fraccion=UNIPRO/k;
	  	

	  	Metododep3=(fraccion*PDA);
	  	
	  	
   
  System.out.println("La depreciacion anual es : " +String.format("%.2f",Metododep3)+ " aproximadamente ");
	
	   
   }
    
	  
    
}break;

case 4:{
	//Metodo de reduccion de saldo o acelerada
	
	System.out.println("-------- Metodo de reduccion de saldo --------");
	System.out.print("Ingrese el costo del activo: ");
	CostoAct=SC.nextInt();
	
	System.out.print("Ingrese los años de vida util: ");
    AVU=SC.nextInt();
    
    System.out.print(" Ingrese el valor residual estimado: ");
    VR=SC.nextInt();
    double []Vect = new double[7];
	
	int suma=0;
	double VUA, DTD, TD;
	double DPA,VL;
	VUA=1.0/AVU;
	DTD=VUA*2;
	TD=1-(Math.pow((VR/CostoAct), VUA));
	System.out.println(TD);
	Metododep4=((CostoAct-VR)/AVU);
	VL=CostoAct;
	DPA=0;
	System.out.println("Tasa del doble saldo: "+DTD+"%");
	
	System.out.println(" ");
	
    System.out.println("Deprecion Anual   ");
    for(int j=0;j<=AVU;j++) {
	     VL=VL-DPA;
	     DPA=VL*DTD;
	     

	     Vect[j]=DPA;
	     suma+= Vect[j];
	     System.out.println( +(DPA)  );
    }
    }break;
    
    
    
    
    
    
case 5:{
	
	System.out.println("Saliendo de la app....");
	System.out.println("FIn del programa.Te amo Eliiiiiii<<<<3");
	a=101;
	break;
}



default: {
	
	System.out.println("Ingrese una opcion valida.Intente nuevamente... ");
    System.out.println(" ");
    
	
}

}
		
}
SC.close();		
	}

}
