# Grand_Strand_System

## Module Eight Journal Entry

>How can I ensure that my code, program, or software is functional and secure?

This is a multi-stage endeavor which requires both static and dynamic testing.
From static testing:
- Peer Reviews
- Static code analysis
  - CheckStyle (Enforces code standards)
  - PMD (Finds unused variables, empty catch blocks, unnecessary object creation,etc)
  - FindBugs (Just like it sounds. It is a static code analyzer that searches for bugs based on a ruleset)
  - Security Scanner (Scans Java code for any known vulnerabilities)
From dynamic testing:
- Unit tests (Tests small units of your code such as a method)
- Code Coverage (Report generated that shows if your unit tests fully cover all units in your code)
- Integration tests (individual software modules are combined and tested as a group)
>How do I interpret user needs and incorporate them into a program?

By having iterative conversations to gather requirements from the users or project manager. While requirements can be gathered at the initial stage as one gets deeper into a project they may hit areas where something may not be doable in the way originally discussed. This is a moment where a followup conversation is required. 
>How do I approach designing software?

From the requirements, I write out a plan and diagram mapping out the various components of the software. Once the plan and diagram are complete, I start to write out each section, usually broken up into multiple files to keep some form of organization. As each section or method is created I'll write out a unit test to verify the code works as expected. 
