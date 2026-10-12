import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Adj meg szavakat(vege a kilepeshez)");
        String szo;
        int darab=0;
        int osszhossz=0;
        int leghosszabb=0;
        String leghosszabSzo="";
        double atlag=0.0;
        while(true)
            {
                szo=sc.nextLine();
                if(szo.equals("vege"))
                {
                    break;
                }
                darab++;
                osszhossz +=szo.length();
                
                if(szo.length()> leghosszabb)
                {
                    leghosszabb= szo.length();
                    leghosszabSzo = szo;
                }
            } 
    
        System.out.println("szavak száma" +darab);
        atlag= (double)osszhossz/darab;
        System.out.println("atlagos hossz" +atlag);
        System.out.println("leghosszabb szo " +leghosszabSzo);
    }
    sc.close
    
}
