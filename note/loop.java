/*
The While loop

int counter = 0;
while(counter < 3){
    System.out.println("m"+counter);
    counter++
}

this code loops 3 times.C

hapter 5 Loops
Second Exam makes you write programs

A loop is a code container that can run more than once based on a conditional test.
there are several types of loops that work slightly differently. 
The ‘while loop’: while a condition is true it continually runs.
Note that you cannot declare in the same scope. so the counter must be visible outside


WHile (boolean-condition)
body
incremental
break

infintie loops is a loop that cannot stop.
If the boolean is always true, it will rerun infinitely.

The ugly short hand: 
Int c=0
while ()
    system.out.println("")
    works but makes things really unclear
    
A Sentinel variable is a test variable that determines whether or not the loop is complete
ex in this case it is capacity
        int counter = 0, capacity = 5;
        while(counter < capacity){
        counter++
        }
        
        How to design a While Loop:
        identify the statements needed to be repeated
        Wrap em in a loop
        
        A break statement inside an if statement would break the loop
        a break statement inside of a while loop that is in turn inside an exterior while loop
        only affects the innermost while loop in which it is located.
        
        
        
        
        