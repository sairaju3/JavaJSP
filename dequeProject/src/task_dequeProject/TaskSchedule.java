package task_dequeProject;

import java.util.Deque;
import java.util.LinkedList;

public class TaskSchedule 
{

	private Deque<Task> dq ;
	public TaskSchedule() 
	{
	     dq = new LinkedList<>();
	}
	public void addNormalTask(String name,String description)
	{
		Task task = new Task(name, description, "Normal");
		dq.addLast(task);
		System.out.println("Normal Task");
	}
	public void addHighPriorityTask(String name,String description)
	{
		Task task = new Task(name, description, "High");
		dq.addFirst(task);
		System.out.println("High Task");
	}
	public  void executeNaxtTask()
	{
		if(dq.isEmpty())
			System.out.println("No tasks available to execute");
		else
		{
			Task Ntask = dq.removeFirst();
			System.out.println(Ntask);
		}
	}
	public void showAllTasks()
	{
		if(dq.isEmpty())
		{
			System.out.println("No pending Tasks");
		}
		else
		{
			for(Task task:dq)
			{
				System.out.println(task);
			}
		}
	}
}
