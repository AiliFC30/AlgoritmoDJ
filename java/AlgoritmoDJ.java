/**
 * @author: Ing. Noé Vásquez Godínez
 * @email: noe-vg@outlook.com
 * @about: Clase para implementar Dijkstra's algorithm
 */
class AlgoritmoDJ{
    /**
     * @about:
     * En este metodo se iniciara sel setup del algoritmo
     */
    public void init(){
        this.start();
    }
    /**@about: 
     * En este metodo se incia el algoritmo
     */
    private void start(){
        //algoritmo 
    public static void main(String args[]) throws IOException{
		int nodos,x,j,aux=0,valor=0,origen;
        int matriz[][]=new int[nodos][nodos];
		String tmp;
		InputStreamReader l1;
		BufferedReader l2;
		int flagError=0;
        System.out.println("Ingrese el numero de nodos: ");
        nodos=Integer.parseInt(leer.readLine());
		System.out.println("Ingrese los valores... ");
		 while (flagError==0){
			  try{
					 for (x=1;x<matriz.lenght; x++)
					{
						for (j=1;j<matriz.lenght; j++) 
						{
							System.out.println("Ingresar valor de distancia:  ");
							valor=Integer.parseInt(leer.readLine());
							while (valor <=0 ||valor >=100)
							{
									System.out.println("VALOR incorrecto...");
									System.out.println("Ingresar valor:  ");
									valor=Integer.parseInt(leer.readLine()); 
							}
							valor=matriz[x][j];
						}
					}
				flagError=1;
					}
			catch (Exception e){
					System.out.print("Debe ingresar numeros positivos") ;
					flagError=0;
		   }
		 }
			
	System.out.println("Ingresar el  nodo de origen : ");
	  origen=in.nextInt();
	  d.calcalculo(nodos,origen,matriz[][]);
			for(x=1;x<=nodos;x++)
			  if(x!=origen)
	  System.out.println(" Origen :"+origen+"\t Destino :"+x+"\t Minimo :"+d.distancia[x]+"\t");
	}
	
	public void calculo(int n,int s, int matriz[][] ){
	int distancia[] = new int[nodos]; 
	  int flag[] = new int[n+1];
	  int i,minpos=1,k,c,minimum;
	  for(i=1;i<=n;i++)
	  {  
		flag[i]=0; 
		this.distancia[i]=this. matriz[s][i]; 
	  }
	  c=2;
	  while(c<=n)
	  {
		minimum=99;
		for(k=1;k<=n;k++){ 
			if(this.distancia[k]<minimum && flag[k]!=1){
			minimum=this.distancia[i];
			minpos=k;
		   }
		} 
		  flag[minpos]=1;
		  c++;
			for(k=1;k<=n;k++){
				if(this.distancia[minpos]+this. matriz[minpos][k] <  this.distancia[k] && flag[k]!=1 )
					this.distancia[k]=this.distancia[minpos]+this. matriz[minpos][k];
			}   
		}
	}

        System.out.println("[OK] starting . . .");
       
      
Status.startMessage();
        Gui guiInterface = new Gui();
        guiInterface.setVisible(true);
    
    } 
    public static void main(String[] args) {
        AlgoritmoDJ algoritmoDJ = new AlgoritmoDJ();
        algoritmoDJ.init();
    }
}