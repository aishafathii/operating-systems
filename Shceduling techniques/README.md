A java program to simulate the following schedulers: 
1. Non-Preemptive   Priority Scheduling with context switching (with the starvation problem solved) 
2. Non-Preemptive  Shortest- Job  First (SJF) (with the starvation problem solved)
3. Shortest-Remaining Time First (SRTF)  Scheduling with context switching (with the starvation 
problem solved)  
4. AGAT Scheduling :  
a. The Round Robin (RR) CPU scheduling algorithm is a fair scheduling algorithm that gives equal time 
quantum to all processes  So All processes are provided a static time to execute called quantum, but in our 
AGAT scheduling each process will have a different Quantum. 
b. A new factor is suggested to attach with each submitted process in our AGAT scheduling algorithm. 
This factor based on (priority, arrival time and remaining service time). The equation summarizes this 
relation is:  
        • Set V1 as (if last-arrival-time > 10 then (last-arrival-time(all processes) /10) else 1)                                                                             
        • Set V2 as (if max-remaining burst time > 10 then (max-remaining burst time(all processes) /10) else 1) 
             
             
             
                  
                  AGAT-Factor = (10-Priority) + ceiling(Arrival Time/v1) + ceiling(Remaining Burst Time/v2)  
 
 
c. Once a process is executed for given time period, it’s called Non-preemptive AGAT till the finishing of 
(round(40% of quantum time)), after that it’s converted to Pre-emptive AGAT after which it can be 
replaced with the process with the best (least) AGAT factor if any. 

d. We have 3 scenarios for a running process  

        i. The running process used all its quantum time and it still has job to do (add this process to the end of the queue, then increases its quantum time by 2).Next process is picked from queue. 

        ii. The running process didn’t use all its quantum time because it was removed in favor of a process with better AGAT factor (add this process to the end of the queue, then increases its quantum time by the remaining quantum time for it). 

        iii. The running process finished its job (set its quantum time to zero and remove it from ready queue and add it to the dead list).
