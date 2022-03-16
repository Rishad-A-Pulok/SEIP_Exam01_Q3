package Employee

import FoodAllowance
import MedicalAllowance
import TransportAllowance

class BaseSalariedEmp(
    name: String,
    var salary: Double
) : Employee(name), FoodAllowance, MedicalAllowance, TransportAllowance {
    override fun calculateSalary(): Double = salary
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