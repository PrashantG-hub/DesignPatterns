package FacadeDesignPattern;

//Places Order can checks status

class PlaceOrder{
public void orderStatus ( ) {
 System . out . println ( "Order is Placed!" ) ;
}
}

//Checks payment status
class Payment{
 public void payStatus ( ) {
   System . out . println ( "Payment Loading" ) ;
 }
}

//Checks delivery Status

class Delivering{
 public void deliverStatus ( ) {
   System . out . println ( "Delivering..." ) ;
 }
}

//Facade 
class Operator{

 private PlaceOrder placeOrder;
 private Payment payment;
 private Delivering delivering;

 public Operator(){
     placeOrder = new PlaceOrder();
     payment = new Payment();
     delivering = new Delivering();
 }

 public void completeOrder ( ) {
   placeOrder.orderStatus ( ) ;
   payment.payStatus ( ) ;
   delivering.deliverStatus ( ) ;
 }

}

//To be accessed by User

public class Solution{

 public static void main (String[] args) {
     Operator op = new Operator();
     op.completeOrder();
 }
}

