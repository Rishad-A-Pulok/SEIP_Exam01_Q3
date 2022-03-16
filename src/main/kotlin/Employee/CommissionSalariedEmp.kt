package Employee

import FoodAllowance
import MedicalAllowance
import TransportAllowance

class CommissionSalariedEmp(
    name: String,
    val salary: Double,
    val totalSale: Double,
    val commissionRate: Double

): Employee(name), FoodAllowance, MedicalAllowance, TransportAllowance{
    override fun calculateSalary(): Double = salary+((totalSale*commissionRate)/100);
    override fun payFoodAllowance() {
        println("Paying food allowance to $name")
    }

    override fun payMedicalAllowance() {
        println("Paying medical allowance to $name")
    }

    override fun payTransportAllowance() {
        println("Paying transport allowance to $name")
    }

}