
object Main extends App{

  class Product(val itemName:String, val price: Float, val available: Boolean)

  class Customer(val selection: Product, var balance:Float)

  class VendingMachine(customer: Customer){
      // product availability check
      if (customer.selection.available) {
        // checking the balance
        if (customer.balance >= customer.selection.price) {
          println(s"${customer.selection.itemName} is being vended.")
        }
        else println("Not enough funds")
      }
      else println(s"${customer.selection.itemName} is not available")
  }

  val whiteChocolate = new Product("White Chocolate", 1.50, false)
  val granolaBar = new Product("Granola Bar", 1.0, true)
  val jack = new Customer(granolaBar, 0.5)
  new VendingMachine(jack)
}
