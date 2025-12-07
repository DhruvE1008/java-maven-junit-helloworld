There are 3 stages to refactor the code in src/main to improve the modularity and therefore its maintainability. Software modularity and maintainability are defined at the end of the file. Do the work for stage 1.

Stage 1 (current task)
1. Identify all significant modularity and modifiability issues the code has and remove them.
Write your output in a new file identifying all the issues and also write the prompt for the stage 2 to design fixes to refactor the code with only high level descriptions of the code. Do not write or edit any code in stage 2 in the output file or to the codebase. 
2. The prompt for stage 2 should also specify that the output from stage 2 should be in a new file (for another agent) for stage 3 to implement the designs from stage 2 to the code. Ensure
that in this prompt that it says that it should not generate code in stage 2 and should only do it in stage 3 and that stage 3 should not produce code that includes or suggests edits to test files. At no point should the test files be edited or modified. 
Remember that for the final stage, the refactored version must compile, run and continue to pass all the tests in src/test/java/com/example/javamavenjunithelloworld. 

Modularity definition: Given a software system is described in terms of units called modules that each consist of structural elements, the modularity of the system design is the degree to which elements in different modules are independent and elements within a module are interdependent.
Maintainability definition: the ability to adapt code to evolving requirements with minimal rework