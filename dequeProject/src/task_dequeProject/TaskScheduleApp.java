package task_dequeProject;

import java.util.Scanner;

public class TaskScheduleApp 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		TaskSchedule scheduler = new TaskSchedule();
		
		
		while(true)
		{
			 System.out.println("\n========== Task Scheduler Menu ==========");
            System.out.println("1. Add Normal Task");
            System.out.println("2. Add High-Priority Task");
            System.out.println("3. Execute Next Task");
            System.out.println("4. Show All Pending Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice (1-5): ");
            int choice = sc.nextInt();
            sc.nextLine();
            
            switch (choice) {
			case 1: {
				    System.out.print("Enter Task Name: ");
                    String name1 = sc.nextLine();
                    System.out.print("Enter Task Description: ");
                    String desc1 = sc.nextLine();
                    
                    scheduler.addNormalTask(name1, desc1);
				
			}break; 
			case 2: {
					System.out.print("Enter Task Name: ");
                    String name2 = sc.nextLine();
                    System.out.print("Enter Task Description: ");
                    String desc2 = sc.nextLine();
                    
                    scheduler.addHighPriorityTask(name2, desc2);
				
			}break;
			case 3: {
				 
				 scheduler.executeNaxtTask();
				
			}break;
			case 4: {
				
				scheduler.showAllTasks();
					
			}break;
			case 5: {
				System.out.println("👋 Exiting Task Scheduler. Goodbye!");
				System.exit(0);
				
			}break;
			default:
					System.out.println("❌ Invalid choice. Please try again.");
			}
		}
	}
}
