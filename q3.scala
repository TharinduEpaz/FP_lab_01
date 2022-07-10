// Company XYZ & Co. pays all its employees Rs.250 per normal working hour
// and Rs. 85 per OT hour. A typical employee works 40 (normal) and 30(OT)
// hours per week has to pay 12% tax. Develop a functional program that
// determines the take home salary of an employee from the number of
// working hours and OT hours given.

object ScalaLab1_Question3 {
  def main(args: Array[String]) = {
    println(salary(100,30));
  }
  
  def salary(hours: Int, OT: Int):Int = hours * 250 + OT * 85;

  def tax(income: Int):Double = income * 0.12;

  def takeHome(hours: Int,OT: Int):Double = salary(hours,OT) - tax(salary(hours, OT));


}
