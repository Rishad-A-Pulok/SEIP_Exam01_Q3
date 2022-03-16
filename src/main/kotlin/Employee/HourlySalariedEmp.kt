package Employee

import MedicalAllowance

class HourlySalariedEmp(
    name: String,
    val totalHour: Double,
    val hourlyRate: Double = 1000.0,
    val project: List<Project>,
    val proManager: ProjectManager
): Employee(name),MedicalAllowance {
    override fun calculateSalary(): Double = totalHour*hourlyRate //compact function
    override fun payMedicalAllowance() {
        println("Paying medical allowance to $name")
    }

    override fun toString(): String {
        return "HourlySalariedEmp(totalHour=$totalHour, hourlyRate=$hourlyRate, proManager=$proManager, project=$project)"
    }


}

class Project(
    val projectName: String,
    val projectDuration: String
){
    override fun toString(): String {
        return "Project(projectName='$projectName', projectDuration='$projectDuration')"
    }
}

class ProjectManager(
    val managerName: String,
    val dept: String
){
    override fun toString(): String {
        return "ProjectManager(managerName='$managerName', department='$dept')"
    }
}