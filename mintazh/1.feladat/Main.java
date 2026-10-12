class Auto
{
    private String brand;
    private double price;
    private double consumption;

    public Auto(String brand, double price, double consumption) {
        this.brand = brand;
        this.price = price;
        this.consumption = consumption;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    @Override
    public String toString() {
        return  String.format("%s -%.2f millió ft(%s.2f liter /km)",this.brand,this.price,this.consumption);
    }
    public  boolean isPricey()
    {
        //return this.price >=10.0;
        if(this.price >=10)
        {
            return  true;
        }
        return  false;
    }
    public double travelCost(double distanceKm,double fuelPrice)
    {
        return ((distanceKm *this.consumption)* fuelPrice);
    }
}

class Main{
    public static void main(String[] args) 
    {
        Auto a1 = new Auto("Skoda",8.5,6.2 );
        Auto a2 = new Auto("BMW",13.8,8.5 );
        System.out.println(a1);
        System.out.println(a1.isPricey());
        System.out.println(a2.isPricey());
        System.out.println(a1.travelCost(400,650)+ "Ft");            
    }
}