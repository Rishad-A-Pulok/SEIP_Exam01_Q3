import Employee.Project
import Employee.ProjectManager

val managerList = listOf<ProjectManager>(
    ProjectManager(managerName = "ABC", dept = "TE"),
    ProjectManager(managerName = "DEF", dept = "CSE"),
    ProjectManager(managerName = "XYZ", dept = "EEE"),
    ProjectManager(managerName = "PQR", dept = "BBA")
)

val projectList = mapOf(
    "ABC" to listOf<Project>(
        Project(projectName = "P01", projectDuration = "3 months"),
        Project(projectName = "P02", projectDuration = "1 months"),
        Project(projectName = "P03", projectDuration = "4 months"),
        Project(projectName = "P04", projectDuration = "5 months"),
    ),
    "DEF" to listOf<Project>(
        Project(projectName = "P01", projectDuration = "3 months"),
        Project(projectName = "P02", projectDuration = "1 months"),
        Project(projectName = "P03", projectDuration = "4 months"),
    ),
    "XYZ" to listOf<Project>(
        Project(projectName = "P01", projectDuration = "3 months"),
        Project(projectName = "P02", projectDuration = "1 months"),
    ),
    "PQR" to listOf<Project>(
        Project(projectName = "P01", projectDuration = "3 months"),
        Project(projectName = "P02", projectDuration = "1 months"),
        Project(projectName = "P03", projectDuration = "4 months"),
        Project(projectName = "P04", projectDuration = "5 months"),
        Project(projectName = "P05", projectDuration = "6 months"),
    ),


)