// QuizViewModel.kt
package com.example.quizapp.viewmodels

import androidx.lifecycle.ViewModel
import com.example.quizapp.models.Question

class QuizViewModel : ViewModel() {

    private val computerNetworksQuestions = listOf(
        Question("What is TCP/IP?", "A programming language", "A network protocol suite", "A file format", "A computer virus", "A network protocol suite"),
        Question("What is DNS?", "Dynamic Network System", "Domain Name System", "Data Network Service", "Digital Network Security", "Domain Name System"),
        Question("What is the main purpose of ARP (Address Resolution Protocol)?", "To map IP addresses to MAC addresses", "To route packets between networks", "To encrypt data during transmission", "To establish a secure connection", "To map IP addresses to MAC addresses"),
        Question("Which layer of the OSI model is responsible for end-to-end communication and error recovery?", "Data Link Layer", "Transport Layer", "Network Layer", "Physical Layer", "Transport Layer"),
        Question("What is the function of a router in a computer network?", "To connect devices within the same local network", "To connect different networks and route data between them", "To filter and forward data frames within a network", "To provide IP addresses to devices on the network", "To connect different networks and route data between them"),
        Question("Which protocol is used for secure communication over the internet?", "HTTP", "FTP", "SSL/TLS", "SMTP", "SSL/TLS"),
        Question("What is the purpose of a subnet mask in networking?", "To identify the network portion of an IP address", "To prevent unauthorized access to a network", "To encrypt data during transmission", "To map domain names to IP addresses", "To identify the network portion of an IP address"),
        Question("In networking, what does the acronym DHCP stand for?", "Dynamic Host Configuration Protocol", "Domain Hosting Control Panel", "Digital Home Computer Platform", "Data Hub Control Protocol", "Dynamic Host Configuration Protocol"),
        Question("What is the role of a firewall in a computer network?", "To prevent unauthorized access and protect against security threats", "To connect devices within the same local network", "To manage IP addresses and routing tables", "To ensure reliable data transmission", "To prevent unauthorized access and protect against security threats"),
        Question("Which device operates at the Data Link Layer of the OSI model?", "Router", "Switch", "Hub", "Bridge", "Switch"),
        Question("What is the purpose of the Domain Name System (DNS) in networking?", "To translate domain names to IP addresses", "To route data between networks", "To establish secure connections", "To manage IP addresses in a local network", "To translate domain names to IP addresses") ,
        Question("Which TCP/IP protocol is responsible for sending email?", "SMTP (Simple Mail Transfer Protocol)", "HTTP (Hypertext Transfer Protocol)", "FTP (File Transfer Protocol)", "TCP (Transmission Control Protocol)", "SMTP (Simple Mail Transfer Protocol)")
    )

    // Define a map for each field with questions as keys and correct answers as values
    private val computerNetworksAnswers = mapOf(
        "What is TCP/IP?" to "A network protocol suite",
        "What is DNS?" to "Domain Name System",
        "What is the main purpose of ARP (Address Resolution Protocol)?" to "To map IP addresses to MAC addresses",
        "Which layer of the OSI model is responsible for end-to-end communication and error recovery?" to "Transport Layer",
        "What is the function of a router in a computer network?" to "To connect different networks and route data between them",
        "Which protocol is used for secure communication over the internet?" to "SSL/TLS",
        "What is the purpose of a subnet mask in networking?" to "To identify the network portion of an IP address",
        "In networking, what does the acronym DHCP stand for?" to "Dynamic Host Configuration Protocol",
        "What is the role of a firewall in a computer network?" to "To prevent unauthorized access and protect against security threats",
        "Which device operates at the Data Link Layer of the OSI model?" to "Switch",
        "What is the purpose of the Domain Name System (DNS) in networking?" to "To translate domain names to IP addresses",
        "Which TCP/IP protocol is responsible for sending email?" to "SMTP (Simple Mail Transfer Protocol)"
    )

    private val pythonQuestions = listOf(
        Question("What is Python?", "A compiled language", "An interpreted language", "A markup language", "An assembly language", "An interpreted language"),
        Question("What is the purpose of PEP 8 in Python?", "Package management", "Code style guide", "Concurrency", "Exception handling", "Code style guide"),
        Question("What is a Python decorator used for?", "Mathematical operations", "Creating GUI applications", "Modifying or extending functions or methods", "Data encryption", "Modifying or extending functions or methods"),
        Question("What is the difference between '==' and 'is' in Python?", "No difference", "Used for assignment", "Used for identity testing", "Used for bitwise operations", "Used for identity testing"),
        Question("What is a lambda function in Python?", "A function with no parameters", "An anonymous function", "A function with unlimited parameters", "A function with default parameters", "An anonymous function"),
        Question("How do you open a file in Python?", "file.open()", "open(file)", "file.open_file()", "open(file, mode)", "open(file, mode)"),
        Question("What is the purpose of the 'self' parameter in Python class methods?", "To represent the class itself", "To represent the instance of the class", "To declare a variable", "To access class attributes", "To represent the instance of the class"),
        Question("What does the 'pass' statement do in Python?", "Exits the loop", "Continues to the next iteration", "Skips a condition", "Indicates no action", "Indicates no action"),
        Question("How do you comment multiple lines in Python?", "# Comment", "/* Comment */", "// Comment //", "''' Comment '''", "''' Comment '''"),
        Question("What is a virtual environment in Python used for?", "Installing Python packages", "Creating isolated Python environments", "Running Python scripts", "Connecting to databases", "Creating isolated Python environments"),
        Question("What is the purpose of the 'else' clause in a try-except block?", "To catch exceptions", "To define the exception type", "To execute code when no exception occurs", "To ignore exceptions", "To execute code when no exception occurs"),
        Question("What is the main purpose of the 'yield' keyword in Python?", "Returning a value from a function", "Interrupting the program", "Creating a generator", "Handling exceptions", "Creating a generator"),
        Question("What is the purpose of the '__init__' method in Python classes?", "To initialize a variable", "To define class methods", "To create an instance of the class", "To handle exceptions", "To create an instance of the class"),
        Question("How do you handle errors in Python?", "try-catch blocks", "if-else statements", "throw exceptions", "raise exceptions", "try-catch blocks"),
        Question("What is the purpose of the 'super()' function in Python?", "To call a superclass method", "To create a new instance", "To define a subclass", "To initialize a variable", "To call a superclass method"),
        Question("How do you convert a string to lowercase in Python?", "str.toLower()", "lowercase(str)", "str.lowercase()", "str.lower()", "str.lower()")
    )

    private val pythonAnswers = mapOf(
        "What is Python?" to "An interpreted language",
        "What is the purpose of PEP 8 in Python?" to "Code style guide",
        "What is a Python decorator used for?" to "Modifying or extending functions or methods",
        "What is the difference between '==' and 'is' in Python?" to "Used for identity testing",
        "What is a lambda function in Python?" to "An anonymous function",
        "How do you open a file in Python?" to "open(file, mode)",
        "What is the purpose of the 'self' parameter in Python class methods?" to "To represent the instance of the class",
        "What does the 'pass' statement do in Python?" to "Indicates no action",
        "How do you comment multiple lines in Python?" to "''' Comment '''",
        "What is a virtual environment in Python used for?" to "Creating isolated Python environments",
        "What is the purpose of the 'else' clause in a try-except block?" to "To execute code when no exception occurs",
        "What is the main purpose of the 'yield' keyword in Python?" to "Creating a generator",
        "What is the purpose of the '__init__' method in Python classes?" to "To create an instance of the class",
        "How do you handle errors in Python?" to "try-catch blocks",
        "What is the purpose of the 'super()' function in Python?" to "To call a superclass method",
        "How do you convert a string to lowercase in Python?" to "str.lower()"
    )

    private val cppQuestions = listOf(
        Question("What does '++' in C++ stand for?", "Plus Plus", "Positive Positive", "Increment", "C Plus", "Increment"),
        Question("What is the syntax for declaring a pointer in C++?", "*var", "&var", "int* var", "ptr var", "int* var"),
        Question("Which C++ keyword is used to allocate memory for a variable at runtime?", "new", "malloc", "alloc", "allocate", "new"),
        Question("What is the purpose of the 'const' keyword in C++?", "To declare a constant variable", "To define a function", "To include a header file", "To specify a loop condition", "To declare a constant variable"),
        Question("How is a reference variable declared in C++?", "ref int x = y;", "int& x = y;", "int x & = y;", "reference x = y;", "int& x = y;"),
        Question("What is the default access specifier in a C++ class?", "private", "public", "protected", "static", "private"),
        Question("What does the 'sizeof' operator in C++ return?", "Size of the variable", "Memory address of the variable", "Type of the variable", "Number of elements in an array", "Size of the variable"),
        Question("What is the purpose of the 'virtual' keyword in C++?", "To declare a variable", "To define a constant", "To create a virtual machine", "To enable polymorphism in classes", "To enable polymorphism in classes"),
        Question("What is the purpose of the 'friend' keyword in C++?", "To declare a friend function", "To declare a friend class", "To include a friend library", "To specify a friend variable", "To declare a friend function"),
        Question("In C++, what is the role of the 'break' statement?", "To exit a loop or switch statement", "To end a function", "To skip the next iteration of a loop", "To continue to the next case in a switch", "To exit a loop or switch statement"),
        Question("Which header file is used for input and output operations in C++?", "stdio.h", "iostream.h", "inputoutput.h", "io.h", "iostream.h"),
        Question("What is the correct syntax for creating an object in C++?", "class objectName;", "new ClassName();", "objectName = new ClassName();", "ClassName objectName;", "ClassName objectName;"),
        Question("What is the purpose of the 'this' pointer in C++?", "To refer to the current object", "To point to the next object", "To access static members", "To call a function", "To refer to the current object"),
        Question("Which C++ keyword is used to inherit a class?", "base", "extends", "inherit", "class", "class"),
        Question("What is the syntax for a single-line comment in C++?", "//", "/*", "#", "--", "//"),
        // Add more questions as needed
    )

    private val cppAnswers = mapOf(
        "What does '++' in C++ stand for?" to "Increment",
        "What is the syntax for declaring a pointer in C++?" to "int* var",
        "Which C++ keyword is used to allocate memory for a variable at runtime?" to "new",
        "What is the purpose of the 'const' keyword in C++?" to "To declare a constant variable",
        "How is a reference variable declared in C++?" to "int& x = y;",
        "What is the default access specifier in a C++ class?" to "private",
        "What does the 'sizeof' operator in C++ return?" to "Size of the variable",
        "What is the purpose of the 'virtual' keyword in C++?" to "To enable polymorphism in classes",
        "What is the purpose of the 'friend' keyword in C++?" to "To declare a friend function",
        "In C++, what is the role of the 'break' statement?" to "To exit a loop or switch statement",
        "Which header file is used for input and output operations in C++?" to "iostream.h",
        "What is the correct syntax for creating an object in C++?" to "ClassName objectName;",
        "What is the purpose of the 'this' pointer in C++?" to "To refer to the current object",
        "Which C++ keyword is used to inherit a class?" to "class",
        "What is the syntax for a single-line comment in C++?" to "//",
        // Add answers for more questions as needed
    )


    private val dataStructuresQuestions = listOf(
        Question("What is the purpose of a stack data structure?", "To store data in a sorted order", "To perform recursive function calls", "To implement dynamic memory allocation", "To follow a Last In First Out (LIFO) order", "To follow a Last In First Out (LIFO) order"),
        Question("Which data structure is used to represent a hierarchical structure with a root value and subtrees?", "Array", "Queue", "Graph", "Tree", "Tree"),
        Question("What is the time complexity of searching an element in a binary search tree (BST)?", "O(1)", "O(n)", "O(log n)", "O(n log n)", "O(log n)"),
        Question("What is the purpose of a hash table in data structures?", "To store data in a sorted order", "To perform recursive function calls", "To implement dynamic memory allocation", "To provide constant time average complexity for key lookup operations", "To provide constant time average complexity for key lookup operations"),
        Question("Which data structure is suitable for implementing a LIFO (Last In First Out) queue?", "Queue", "Stack", "Array", "Linked List", "Stack"),
        Question("What is the time complexity of appending an element to the end of an array?", "O(1)", "O(n)", "O(log n)", "O(n log n)", "O(1)"),
        Question("Which sorting algorithm has a quadratic time complexity in the worst case?", "Merge Sort", "Quick Sort", "Bubble Sort", "Heap Sort", "Bubble Sort"),
        Question("What is the purpose of a linked list data structure?", "To store data in a two-dimensional array", "To implement dynamic memory allocation", "To represent a hierarchical structure", "To store data in a sequential order with dynamic size", "To store data in a sequential order with dynamic size"),
        Question("What is the time complexity of searching an element in a hash table?", "O(1)", "O(n)", "O(log n)", "O(n log n)", "O(1)"),
        Question("Which data structure is used to implement a breadth-first search (BFS)?", "Queue", "Stack", "Heap", "Linked List", "Queue"),
        Question("What is the purpose of a binary heap data structure?", "To implement a priority queue", "To perform recursive function calls", "To represent a hierarchical structure", "To store data in a sorted order", "To implement a priority queue"),
        Question("Which data structure is suitable for implementing a First In First Out (FIFO) queue?", "Queue", "Stack", "Array", "Linked List", "Queue"),
        Question("What is the time complexity of the quicksort algorithm in the average case?", "O(1)", "O(n)", "O(log n)", "O(n log n)", "O(n log n)"),
        Question("Which data structure is used to store and manage a collection of elements with no duplicates?", "Array", "Linked List", "Set", "Map", "Set"),
        Question("What is the purpose of a graph data structure?", "To store data in a sorted order", "To implement dynamic memory allocation", "To represent a hierarchical structure", "To model relationships between entities", "To model relationships between entities"),
        // Add more questions as needed
    )

    private val dataStructuresAnswers = mapOf(
        "What is the purpose of a stack data structure?" to "To follow a Last In First Out (LIFO) order",
        "Which data structure is used to represent a hierarchical structure with a root value and subtrees?" to "Tree",
        "What is the time complexity of searching an element in a binary search tree (BST)?" to "O(log n)",
        "What is the purpose of a hash table in data structures?" to "To provide constant time average complexity for key lookup operations",
        "Which data structure is suitable for implementing a LIFO (Last In First Out) queue?" to "Stack",
        "What is the time complexity of appending an element to the end of an array?" to "O(1)",
        "Which sorting algorithm has a quadratic time complexity in the worst case?" to "Bubble Sort",
        "What is the purpose of a linked list data structure?" to "To store data in a sequential order with dynamic size",
        "What is the time complexity of searching an element in a hash table?" to "O(1)",
        "Which data structure is used to implement a breadth-first search (BFS)?" to "Queue",
        "What is the purpose of a binary heap data structure?" to "To implement a priority queue",
        "Which data structure is suitable for implementing a First In First Out (FIFO) queue?" to "Queue",
        "What is the time complexity of the quicksort algorithm in the average case?" to "O(n log n)",
        "Which data structure is used to store and manage a collection of elements with no duplicates?" to "Set",
        "What is the purpose of a graph data structure?" to "To model relationships between entities",
        // Add answers for more questions as needed
    )

    private val cQuestions = listOf(
        Question("What is the purpose of '#include' in C programming?", "To include standard input/output functions", "To define a macro", "To declare a variable", "To import external libraries", "To include standard input/output functions"),
        Question("Which data type is used to store single characters in C?", "int", "char", "float", "double", "char"),
        Question("What is the size of the 'int' data type in C on most systems?", "4 bytes", "2 bytes", "8 bytes", "Depends on the system", "Depends on the system"),
        Question("What does the 'sizeof' operator in C return?", "Memory size of a variable or data type", "Address of a variable", "Value stored in a variable", "Number of elements in an array", "Memory size of a variable or data type"),
        Question("What is the purpose of the 'break' statement in C?", "To end the program", "To exit a loop or switch statement", "To skip the current iteration of a loop", "To skip the current case in a switch statement", "To exit a loop or switch statement"),
        Question("What is the syntax for declaring a pointer in C?", "int* ptr;", "int ptr;", "ptr int;", "pointer int;", "int* ptr;"),
        Question("What is the purpose of 'malloc' in C?", "To declare a function", "To allocate memory", "To free memory", "To define a macro", "To allocate memory"),
        Question("Which function is used to read a character from the standard input in C?", "scanchar()", "getchar()", "readchar()", "scanf()", "getchar()"),
        Question("What is the role of 'void' in a function declaration in C?", "It indicates the function has no parameters", "It indicates the function returns no value", "It specifies the function is a variable", "It is used for exception handling", "It indicates the function returns no value"),
        Question("What does the 'const' keyword do in C?", "Declares a constant variable", "Declares a variable with a constant value", "Denotes a constant function", "Indicates a constant loop", "Declares a constant variable"),
        Question("In C, how do you open a file in binary mode for writing?", "fopen(file, 'wb')", "open(file, 'wb')", "fileopen(file, 'binary write')", "binary_open(file, 'write')", "fopen(file, 'wb')"),
        Question("What is the purpose of the 'typedef' keyword in C?", "To define a new data type", "To declare a variable", "To include standard input/output functions", "To create a constant", "To define a new data type"),
        Question("What is the use of 'strlen' function in C?", "To calculate the size of an array", "To find the length of a string", "To concatenate two strings", "To compare two strings", "To find the length of a string"),
        Question("Which operator is used for pointer dereferencing in C?", "&", "*", "#", "->", "*"),
        Question("What is the purpose of 'fprintf' function in C?", "To read from a file", "To format and write data to a file", "To close a file", "To scan input from a file", "To format and write data to a file"),
        // Add more questions as needed
    )

    private val cAnswers = mapOf(
        "What is the purpose of '#include' in C programming?" to "To include standard input/output functions",
        "Which data type is used to store single characters in C?" to "char",
        "What is the size of the 'int' data type in C on most systems?" to "Depends on the system",
        "What does the 'sizeof' operator in C return?" to "Memory size of a variable or data type",
        "What is the purpose of the 'break' statement in C?" to "To exit a loop or switch statement",
        "What is the syntax for declaring a pointer in C?" to "int* ptr;",
        "What is the purpose of 'malloc' in C?" to "To allocate memory",
        "Which function is used to read a character from the standard input in C?" to "getchar()",
        "What is the role of 'void' in a function declaration in C?" to "It indicates the function returns no value",
        "What does the 'const' keyword do in C?" to "Declares a constant variable",
        "In C, how do you open a file in binary mode for writing?" to "fopen(file, 'wb')",
        "What is the purpose of the 'typedef' keyword in C?" to "To define a new data type",
        "What is the use of 'strlen' function in C?" to "To find the length of a string",
        "Which operator is used for pointer dereferencing in C?" to "*",
        "What is the purpose of 'fprintf' function in C?" to "To format and write data to a file",
        // Add answers for more questions as needed
    )

    private val softwareEngineeringQuestions = listOf(
        Question("What is software engineering?", "The process of writing computer programs", "The application of a systematic, disciplined, and quantifiable approach to software development", "The study of computer hardware", "The design of algorithms", "The application of a systematic, disciplined, and quantifiable approach to software development"),
        Question("What is the software development life cycle (SDLC)?", "A programming language", "The process of writing computer programs", "A set of processes or phases that guide the development of software applications", "A database management system", "A set of processes or phases that guide the development of software applications"),
        Question("What is the purpose of requirement analysis in software engineering?", "To design the user interface", "To identify and understand the needs and constraints of the end-users", "To write test cases", "To fix bugs in the code", "To identify and understand the needs and constraints of the end-users"),
        Question("What is version control in software development?", "A method for controlling software piracy", "A system that manages changes to source code over time", "A tool for testing software applications", "A type of software license", "A system that manages changes to source code over time"),
        Question("What is the Agile methodology in software development?", "A linear and sequential approach to software development", "A flexible and iterative approach that emphasizes collaboration and customer feedback", "A type of programming language", "A method for debugging code", "A flexible and iterative approach that emphasizes collaboration and customer feedback"),
        Question("What is the purpose of a UML diagram?", "To draw flowcharts for software algorithms", "To model the structure and behavior of a system", "To write code in a high-level language", "To analyze data in a database", "To model the structure and behavior of a system"),
        Question("What is the role of a software architect?", "To write code for software applications", "To design the user interface", "To plan and oversee the overall software development process", "To handle customer support", "To plan and oversee the overall software development process"),
        Question("What is software testing?", "The process of finding and fixing bugs in the code", "The process of writing software documentation", "The process of validating and verifying that a software application works as intended", "The process of designing algorithms", "The process of validating and verifying that a software application works as intended"),
        Question("What is the purpose of code reviews in software development?", "To write code for software applications", "To find and fix bugs in the code", "To ensure code quality and share knowledge among team members", "To design user interfaces", "To ensure code quality and share knowledge among team members"),
        Question("What is the concept of continuous integration?", "A method for testing software applications", "A practice of frequently integrating code changes into a shared repository", "A type of software license", "A programming language", "A practice of frequently integrating code changes into a shared repository"),
        Question("What is refactoring in software engineering?", "The process of writing code for the first time", "The process of rewriting existing code to improve its structure and maintainability", "The process of debugging code", "A type of software testing", "The process of rewriting existing code to improve its structure and maintainability"),
        Question("What is a software requirement specification (SRS)?", "A document that defines the overall architecture of a software system", "A document that lists the features and functions of a software application", "A tool for managing software versions", "A programming language", "A document that lists the features and functions of a software application"),
        Question("What is the waterfall model in software development?", "A flexible and iterative approach to software development", "A linear and sequential approach with phases like requirements, design, implementation, testing, and maintenance", "A type of database management system", "A method for designing algorithms", "A linear and sequential approach with phases like requirements, design, implementation, testing, and maintenance"),
        Question("What is DevOps?", "A software development methodology", "A practice that combines software development (Dev) and IT operations (Ops)", "A type of software license", "A method for writing code", "A practice that combines software development (Dev) and IT operations (Ops)"),
        Question("What is the purpose of a feasibility study in software development?", "To find and fix bugs in the code", "To determine whether a project is viable and achievable", "To plan the overall development process", "To design user interfaces", "To determine whether a project is viable and achievable"),
        // Add more questions as needed
    )

    private val softwareEngineeringAnswers = mapOf(
        "What is software engineering?" to "The application of a systematic, disciplined, and quantifiable approach to software development",
        "What is the software development life cycle (SDLC)?" to "A set of processes or phases that guide the development of software applications",
        "What is the purpose of requirement analysis in software engineering?" to "To identify and understand the needs and constraints of the end-users",
        "What is version control in software development?" to "A system that manages changes to source code over time",
        "What is the Agile methodology in software development?" to "A flexible and iterative approach that emphasizes collaboration and customer feedback",
        "What is the purpose of a UML diagram?" to "To model the structure and behavior of a system",
        "What is the role of a software architect?" to "To plan and oversee the overall software development process",
        "What is software testing?" to "The process of validating and verifying that a software application works as intended",
        "What is the purpose of code reviews in software development?" to "To ensure code quality and share knowledge among team members",
        "What is the concept of continuous integration?" to "A practice of frequently integrating code changes into a shared repository",
        "What is refactoring in software engineering?" to "The process of rewriting existing code to improve its structure and maintainability",
        "What is a software requirement specification (SRS)?" to "A document that lists the features and functions of a software application",
        "What is the waterfall model in software development?" to "A linear and sequential approach with phases like requirements, design, implementation, testing, and maintenance",
        "What is DevOps?" to "A practice that combines software development (Dev) and IT operations (Ops)",
        "What is the purpose of a feasibility study in software development?" to "To determine whether a project is viable and achievable",
        // Add answers for more questions as needed
    )


    fun getQuestionsForField(field: String): List<Question> {
        return when (field) {
            "Data Structures" -> dataStructuresQuestions.shuffled().take(10)
            "Computer Networks" -> computerNetworksQuestions.shuffled().take(10)
            "Python" -> pythonQuestions.shuffled().take(10)
            "C" -> cQuestions.shuffled().take(10)
            "C++" -> cppQuestions.shuffled().take(10)
            "Software Engineering" -> softwareEngineeringQuestions.shuffled().take(10)
            // Add more cases for other fields
            else -> emptyList() // Return an empty list for unknown fields
        }
    }

    // Function to get the map of questions and correct answers for a given field
    fun getAnswersForField(field: String): Map<String, String> {
        return when (field) {
            "Data Structures" -> dataStructuresAnswers
            "Computer Networks" -> computerNetworksAnswers
            "Python" -> pythonAnswers
            "C" -> cAnswers
            "C++" -> cppAnswers
            "Software Engineering" -> softwareEngineeringAnswers
            // Add more cases for other fields
            else -> emptyMap() // Return an empty map for unknown fields
        }
    }
}
