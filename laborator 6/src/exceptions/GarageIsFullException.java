package exceptions;

public class GarageIsFullException  extends RuntimeException{
    public GarageIsFullException() {super("you cannot add more vehicles to this garage");}
}
