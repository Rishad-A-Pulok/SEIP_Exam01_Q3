import Employee.*
import java.util.Scanner

fun main() {

    var scanner = Scanner(System.`in`)
    var managerName = scanner.nextLine()
    val manager: ProjectManager = managerList.first{
        it.managerName == managerName
    }
    val proList = projectList.get(managerName)
    val bse = BaseSalariedEmp("Rishad",500000.0)
    val bse1 = BaseSalariedEmp("Rishad123",500000.0)
    val hse = HourlySalariedEmp("Siam",60.0, proManager = manager, project = proList!!)
    val hse1 = HourlySalariedEmp("Siam123",60.0, proManager = manager, project = proList)
    val cse = CommissionSalariedEmp("Pulok",20000.0,50000.0,5.0)
    val cse1 = CommissionSalariedEmp("Pulok123",20000.0,50000.0,5.0)
    val employees: ArrayList<Employee> = arrayListOf(bse,bse1,hse,hse1,cse,cse1)
    for(employee in employees){
        println("Salary of ${employee.name}: ${employee.calculateSalary()}")
    }
    println(hse)
    println(hse1)

    for(employee in employees){
        if(employee is FoodAllowance){
            employee.payFoodAllowance()
        }
        if(employee is MedicalAllowance){
            employee.payMedicalAllowance()
        }
        if(employee is TransportAllowance){
            employee.payTransportAllowance()
        }
    }


}

interface FoodAllowance{
    fun payFoodAllowance()
}

interface MedicalAllowance{
    fun payMedicalAllowance()
}

interface TransportAllowance{
    fun payTransportAllowance()
}