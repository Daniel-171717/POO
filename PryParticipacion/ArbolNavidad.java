package PryParticipacion;

public class ArbolNavidad {
    private int inicio;
    private int Tronco;
    private int alineacion;

    public ArbolNavidad(int inicio) {
        this.inicio=inicio;
    }

    public void forma ()
    {
        for (int i=1;i<=inicio;i++)
        {
            //Espaciado
            for (int j=1;j<=inicio-i;j++)
            {
                System.out.print(" ");
            }
            //Creacion del Arbol
            for (int k=1;k<=(2*i-1);k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        Tronco = inicio/3;
        if (Tronco%2==0)
        {
            Tronco++;
        }
        alineacion=(2*inicio-1-Tronco)/2;

        for(int i=1;i<=Tronco;i++)
        {
            for(int j=1;j<=alineacion;j++)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=Tronco;k++);
            {
                if(inicio>0 && inicio<6)
                    System.out.println("*");
                else
                    System.out.print("***");
            }
            for(int n=1;n<=alineacion;n++)
            {
                System.out.print(" ");
            }
            for(int l=1;l<=Tronco;l++);
            {
                if(inicio>0 && inicio<6)
                    System.out.println("*");
            }
            System.out.println();
        }
    }
    
}
