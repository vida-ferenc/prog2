import java.util.ArrayList;
import java.util.List;

class Versenyzo
{
    private  String nev;
    private  String orszag;
    private  double ido;
    public Versenyzo(String nev, String orszag, double ido) {
        this.nev = nev;
        this.orszag = orszag;
        this.ido = ido;
    }
    public String getNev() {
        return nev;
    }
    public void setNev(String nev) {
        this.nev = nev;
    }
    public String getOrszag() {
        return orszag;
    }
    public void setOrszag(String orszag) {
        this.orszag = orszag;
    }
    public double getIdo() {
        return ido;
    }
    public void setIdo(double ido) {
        this.ido = ido;
    }
}

public class Main {
    public static void main(String[] args)
    {
        List<String> sorok= FileUtils.readLines("versenyzok.txt");
        List<Versenyzo> versenyzok = new ArrayList<>();
        for (String sor : sorok) 
        {
            String[] parts =sor.split(":");
            String nev = parts[0];
            String orszag= parts[1];
            double ido =Double.parseDouble(parts[2]);
            versenyzok.add(new Versenyzo(nev, orszag , ido));    
        }
        Versenyzo leggyorsabb =versenyzok.get(0);
        for (int i = 1; i < versenyzok.size(); i++) {
            if (versenyzok.get(i).getIdo() < leggyorsabb.getIdo()) {
                leggyorsabb =versenyzok.get(i);
            }
        }
        System.out.println("leggyorsabb versenyzo: " + leggyorsabb.getNev() + leggyorsabb.getOrszag() + leggyorsabb.getIdo());
        int magyarok=0;
        for(Versenyzo v:versenyzok)
        {
            if(v.getOrszag().equals("HUN"))
            {
                magyarok++;
            }
        }
        System.out.println("magyarok száma:" +magyarok);
    }
}
