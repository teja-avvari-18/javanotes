
class Laptop
{
     int price;
     String model;

     public String toString()
     {
        return model+ " : "+price;
     }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + price;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (price != other.price)
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        return true;
    }

    //  public boolean equals (Laptop that)
    //  {
    //     return (this.model.equals(that.model) && this.price == that.price);
    //  }

    
}

public class Objects 
{
    public static void main(String[] args) 
    {
        Laptop obj1 = new Laptop();
        obj1.model = "HP";
        obj1.price = 50000;

        Laptop obj2 = new Laptop();
        obj2.model = "Lenova";
        obj2.price = 50000;

        // System.out.println(obj);

        boolean result1 = obj1 == obj2;
        System.out.println(result1);

        boolean result2 = obj1.equals(obj2);
        System.out.println(result2);
    }
}
