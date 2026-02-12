package task_dequeProject;

public class Task 
{
	private static int count = 0;
	private int taskId;
	private String taskName;
	private String taskDescription;
	private String priority;
	
	public Task( String taskName, String taskDescription, String priority) 
	{
		this.taskId = ++count;
		this.taskName = taskName;
		this.taskDescription = taskDescription;
		this.priority = priority;
	}

	@Override
	public String toString() {
		 return "[Task#" + taskId + "] " + taskName + " - " + taskDescription + " (" + priority + ")";
	}
	
	
}
