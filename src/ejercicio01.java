import java.util.Arrays;


public class ejercicio01 {
	static String[] matriz = {
			"NNYN",
			"NNYN",
			"NNNN",
			"NYYN"};

	//String[] matriz = {"N"};
		
	
	static int salario[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = matriz.length; // número de empleados
	    
	    salario = new int[n]; // arreglo para guardar los salarios de los empleados
	    Arrays.fill(salario, 0); // todos los empleados sin subordinados tienen salario 0
	    
	    int res = 0;
	    for(int i = 0; i < n; i++)
	        if (salario[i] == 0) salarioRecursivo(i);

	    for(int i = 0; i < n; i++)
	    	res += salario[i];
	    

	    System.out.print("Total de Salarios: "+res); 
	}
	
	public static int salarioRecursivo(int i)

	  {
	    int j;

	    if (salario[i] > 0) return salario[i];
	    
	    for(j = 0; j < matriz.length; j++)
	      if (matriz[i].charAt(j) == 'Y') salario[i] += salarioRecursivo(j);
	    
	    if (salario[i] == 0) salario[i] = 1;
	    return salario[i];

	  }

}
