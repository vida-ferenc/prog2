class Movie
{
    public String title;
    public int year;
    public double score;
    
    public Movie(String title, int year, double score) 
    {
        this.title = title;
        this.year = year;
        this.score = score;
    }
    @Override
    public String toString()
    {
        return String.format("%s;%.1f (%d)",this.title,this.score,this.year);
    }
}


public  class Main
{

    public static void main(String[] args) 
    {
     
        Movie m1= new Movie("Pókember", 2026, 8.8);
        System.out.println(m1.title);
        //Movie m2= new Movie("Remény rabjai", 2025, 9.8);
        //Movie m3= new Movie("Pókember", 2026, 8.8);

    }
}