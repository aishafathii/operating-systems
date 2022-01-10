/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment.pkg3.os;


/**
 *
 * @author 4G
 */
import java.util.*;
import java.awt.Color;
import java.lang.reflect.Field;

 
public class Assignment3Os {

    
    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        int contextSwitching = 0;
        int BurstTime;
        int ArrivalTime;
        int Priority;
        String ProcessName;
        String color;
        System.out.println("Enter context Switching Time :");
	contextSwitching = in.nextInt();
        
        ShortestJobFirst sjf = new ShortestJobFirst();
        ShortestRemainingTimeFirst srtf = new ShortestRemainingTimeFirst(contextSwitching);
        Priority priority = new Priority(contextSwitching);
        AGAT agat = new AGAT();
        
        System.out.println("Enter the number of processes");
        int NumberOfProcesses = in.nextInt();
        for(int i = 0; i < NumberOfProcesses; i++) 
        { 
            System.out.println("Enter Process Name "); 
            ProcessName = sc.nextLine();
            System.out.println("Enter AT for process " + (i+1)); 
            ArrivalTime = in.nextInt(); 
            System.out.println("Enter BT for process " + (i+1)); 
            BurstTime = in.nextInt();
            System.out.println("Enter the priority of process " + (i+1)); 
            Priority = in.nextInt(); 
            System.out.println("Enter the Color of process " + (i+1)); 
            color = sc.nextLine(); 
            Color color2;
            try {
                Field field = Class.forName("java.awt.Color").getField(color);
                color2 = (Color)field.get(null);
            } catch (Exception e) {
                color2 = null; // Not defined
            }
            Process process = new Process(ProcessName, ArrivalTime, BurstTime, Priority , color2);
            System.out.println("color = " + color2);
            sjf.AddProcess(process);
            srtf.AddProcess(process);
            priority.AddProcess(process);
            //AGAT.
        }
        //priority.PriorityScheduling();
        //priority.Print();
        sjf.ShortestJobFirstScheduling();
        sjf.Print();
        //srtf.ShortestRemainingTimeFirstScheduling();
        //srtf.Print();
    }
}*/
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        int numOfProcesses;
        int contextSwitching = 0;
        int BurstTime;
        int ArrivalTime;
        int Priority;
        String ProcessName;
        String color;
        int quantum;

        System.out.println("Choose The Scheduler You Want to Use : " );
        System.out.println("-------------------------------------------------" );
        System.out.println("1-Priority Scheduling ");
        System.out.println("2-Shortest-Job First (SJF)");
        System.out.println("3-Shortest-Remaining Time First (SRTF)");
        System.out.println("4-AGAT Scheduling ");
        int choice = in.nextInt();


        if(choice==1)
        {
            System.out.println("Priority Scheduling");
            System.out.println("-------------------------------------------");
            System.out.println("Enter the number of processes");
            numOfProcesses = in.nextInt();
            System.out.println("Enter context Switching Time :");
            contextSwitching = in.nextInt();
            Priority priority = new Priority(contextSwitching);
            for(int i = 0; i < numOfProcesses; i++)
            {
            System.out.println("Enter Process Name ");
            ProcessName = sc.nextLine();
            System.out.println("Enter AT for process " + (i+1));
            ArrivalTime = in.nextInt();
            System.out.println("Enter BT for process " + (i+1));
            BurstTime = in.nextInt();
            System.out.println("Enter the priority of process " + (i+1));
            Priority = in.nextInt();
            System.out.println("Enter the Color of process " + (i+1));
            color = sc.nextLine();
            Color color2;
            try {
                Field field = Class.forName("java.awt.Color").getField(color);
                color2 = (Color)field.get(null);
            } catch (Exception e) {
                color2 = null; // Not defined
            }
            Process process = new Process(ProcessName, ArrivalTime, BurstTime, Priority , color2);
            System.out.println("color = " + color2);
            priority.AddProcess(process);
        }
        priority.PriorityScheduling();
        priority.Print();
    }

        else if(choice==2)
        {
            System.out.println("Shortest- Job First (SJF) Scheduling");
            System.out.println("-------------------------------------------");
            System.out.println("Enter the number of processes");
            numOfProcesses = in.nextInt();
            ShortestJobFirst sjf = new ShortestJobFirst();
            for(int i = 0; i < numOfProcesses; i++)
            {
            System.out.println("Enter Process Name ");
            ProcessName = sc.nextLine();
            System.out.println("Enter AT for process " + (i+1));
            ArrivalTime = in.nextInt();
            System.out.println("Enter BT for process " + (i+1));
            BurstTime = in.nextInt();
            System.out.println("Enter the priority of process " + (i+1));
            Priority = in.nextInt();
            System.out.println("Enter the Color of process " + (i+1));
            color = sc.nextLine();
            Color color2;
            try {
                Field field = Class.forName("java.awt.Color").getField(color);
                color2 = (Color)field.get(null);
            } catch (Exception e) {
                color2 = null; // Not defined
            }
            Process process = new Process(ProcessName, ArrivalTime, BurstTime, Priority , color2);
            System.out.println("color = " + color2);
            sjf.AddProcess(process);
        }
        sjf.ShortestJobFirstScheduling();
        sjf.Print();
    }

        else if(choice==3)
        {
            System.out.println("Shortest-Remaining Time First (SRTF) Scheduling");
            System.out.println("------------------------------------");
            System.out.println("Enter the number of processes");
            numOfProcesses = in.nextInt();
            System.out.println("Enter context Switching Time :");
            contextSwitching = in.nextInt();
            ShortestRemainingTimeFirst srtf = new ShortestRemainingTimeFirst(contextSwitching);
            for(int i = 0; i < numOfProcesses; i++)
            {
                System.out.println("Enter Process Name ");
                ProcessName = sc.nextLine();
                System.out.println("Enter AT for process " + (i+1));
                ArrivalTime = in.nextInt();
                System.out.println("Enter BT for process " + (i+1));
                BurstTime = in.nextInt();
                System.out.println("Enter the priority of process " + (i+1));
                Priority = in.nextInt();
                System.out.println("Enter the Color of process " + (i+1));
                color = sc.nextLine();
                Color color2;
                try {
                    Field field = Class.forName("java.awt.Color").getField(color);
                    color2 = (Color)field.get(null);
                } catch (Exception e) {
                    color2 = null; // Not defined
                }
                Process process = new Process(ProcessName, ArrivalTime, BurstTime, Priority , color2);
                System.out.println("color = " + color2);
                srtf.AddProcess(process);
            }
            srtf.ShortestRemainingTimeFirstScheduling();
            srtf.Print();
        }


        else if(choice==4)
        {
            AGAT A = new AGAT();
            A.AGATmain();
        }


        }

   }
