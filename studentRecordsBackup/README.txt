CS542 Design Patterns
Spring 2016
PROJECT 3 README FILE

Due Date: Tuesday, March 22, 2016
Submission Date: Tuesday, March 22, 2016
Grace Period Used This Project: 0 Days
Grace Period Remaining: N/A Days
Author(s): VIRAJ DILIP NIMBALKAR
e-mail(s): vnimbal1@binghamton.edu


PURPOSE:

To apply and implement Observer pattern.

PERCENT COMPLETE:

As per my understanding, all the requirements for this assignment are getting completed. So 100% complete.

PARTS THAT ARE NOT COMPLETE:

I believe all the parts are completed.

BUGS:

None.

FILES:

Included with this project are 11 files:

README.txt the text file you are presently reading
Driver.java the main file associated with the program also contains main
BSTBuilder.java reads a line from the input file, and calls the insert method of the BST
EvenFilterImpl.java which checks if number is even
OddFilterImpl.java which checks if number is odd
Node.java which store the B-Number
SubjectI.java interface for adding,removing, and notifying observers.
ObserverI.java interface for updating values in a node
BST.java which store Nodes in accordance with the BST rules applied to the B-Number of each Node.
FileProcessor.java which reads line by line from file.
FileProcessorInterface.java

SAMPLE OUTPUT:

remote00:~/cs542/ass3/viraj_nimbalkar_assign3/studentRecordsBackup> ant -buildfile src/build.xml clean
Buildfile: /import/linux/home/vnimbal1/cs542/ass3/viraj_nimbalkar_assign3/studentRecordsBackup/src/build.xml

clean:
   [delete] Deleting directory /import/linux/home/vnimbal1/cs542/ass3/viraj_nimbalkar_assign3/studentRecordsBackup/BUILD

BUILD SUCCESSFUL
Total time: 0 seconds
remote00:~/cs542/ass3/viraj_nimbalkar_assign3/studentRecordsBackup> date
Tue Mar 22 23:23:12 EDT 2016
remote00:~/cs542/ass3/viraj_nimbalkar_assign3/studentRecordsBackup> ant -buildfile src/build.xml all
Buildfile: /import/linux/home/vnimbal1/cs542/ass3/viraj_nimbalkar_assign3/studentRecordsBackup/src/build.xml

prepare:
    [mkdir] Created dir: /import/linux/home/vnimbal1/cs542/ass3/viraj_nimbalkar_assign3/studentRecordsBackup/BUILD
    [mkdir] Created dir: /import/linux/home/vnimbal1/cs542/ass3/viraj_nimbalkar_assign3/studentRecordsBackup/BUILD/classes

studentRecordsBackup:
    [javac] Compiling 12 source files to /import/linux/home/vnimbal1/cs542/ass3/viraj_nimbalkar_assign3/studentRecordsBackup/BUILD/classes

compile_all:

all:

BUILD SUCCESSFUL
Total time: 2 seconds
remote00:~/cs542/ass3/viraj_nimbalkar_assign3/studentRecordsBackup> ant -buildfile src/build.xml run -Darg0=input.txt -Darg1=2
Buildfile: /import/linux/home/vnimbal1/cs542/ass3/viraj_nimbalkar_assign3/studentRecordsBackup/src/build.xml

jar:
    [mkdir] Created dir: /import/linux/home/vnimbal1/cs542/ass3/viraj_nimbalkar_assign3/studentRecordsBackup/BUILD/jar
      [jar] Building jar: /import/linux/home/vnimbal1/cs542/ass3/viraj_nimbalkar_assign3/studentRecordsBackup/BUILD/jar/studentRecordsBackup.jar

run:
     [java] main-BST---------->>
     [java]
     [java] -9  2       5       11      33
     [java]
     [java] The sum of all the B-Numbers is: 42
     [java]
     [java] backup-1---------->>
     [java]
     [java] -9  2       5       11      33
     [java]
     [java] The sum of all the B-Numbers is: 42
     [java]
     [java] backup-2---------->>
     [java]
     [java] -9  2       5       11      33
     [java]
     [java] The sum of all the B-Numbers is: 42
     [java]
     [java]
     [java] <------------------------Post Increment------------------->>
     [java]
     [java] main-BST---------->>
     [java]
     [java] -7  4       7       13      37
     [java]
     [java] The sum of all the B-Numbers is: 54
     [java]
     [java] backup-1---------->>
     [java]
     [java] -7  4       7       13      35
     [java]
     [java] The sum of all the B-Numbers is: 52
     [java]
     [java] backup-2---------->>
     [java]
     [java] -9  2       5       11      33
     [java]
     [java] The sum of all the B-Numbers is: 42
     [java]
     [java] The sum of all the B-Numbers in all three trees is: 148

BUILD SUCCESSFUL
Total time: 1 second
remote00:~/cs542/ass3/viraj_nimbalkar_assign3/studentRecordsBackup>



TO COMPILE:

[
  Extract.
  Follow Path: viraj_nimbalkar_assign3/studentRecordsBackup/
  Assuming you are in the directory containing this README

  ## To compile: 
  ant -buildfile src/build.xml all
]

Extract 

TO RUN:

[
ant -buildfile src/build.xml run -Darg0=input.txt -Darg1=5 
]

EXTRA CREDIT:

"N/A"

BIBLIOGRAPHY:
I have used HashMap to store obervers which helps me to apply filter to each node.

This serves as evidence that I am in no way intending Academic Dishonesty.
Viraj Nimbalkar

