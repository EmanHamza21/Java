package Chapter11;
/*
create a product interface
create a book class that implements product
 */
public interface ProductInterface {
    double getPrice ();
    void setPrice(double price);

    String getName();
    void setName (String name);

    String getColor();
    void setColor(String color);
}
