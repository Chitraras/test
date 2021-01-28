
public class ProjectMain {
	public static void main(String[] args) {
		Project myProject=new Project(261, "Aruba", "Gopi", 15 );
		
		System.out.println("Project Id is: "+myProject.getProjectId());
		System.out.println("Name of the Project:  "+myProject.getProjectName());
		System.out.println("Name of the Project Head: "+myProject.getProjectHead());
		System.out.println("Number of Resourses: "+myProject.getNoOfResources());
		
	}

}
