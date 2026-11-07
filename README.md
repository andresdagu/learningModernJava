# 📘 Learning Modern Java

Welcome to my learning repository! This project documents my transition from **Java 8** to **Modern Java**, targeting **Java 25 (JDK 25)** using **Maven** as the build tool. I am following the open-source book [**"Modern Java" by Ethan McCue**](https://javabook.mccue.dev/) (source code available on [GitHub](https://github.com/bowbahdoe/ModernJava)) to bridge the gap from my **Java 8** background to **Modern Java**.

Along the way, I am also using **Java 21 (LTS)** as a stable reference point: many modern features (records, pattern matching, virtual threads) were finalized in **Java 21**. I use it as a foundation while exploring the newer additions and preview features available in **Java 25**.

The main goal of this repository is to refresh my Java fundamentals, explore how the language has evolved over the last decade, and master modern syntax, best practices, and new features, by following the book's structure, completing its challenges, and documenting my progress.
 
> **Note on methodology:** The exercises in this repository are solved **without using AI**. The goal is to learn by doing, making mistakes, and debugging. AI is only used as a tutor to review code or explain concepts *after* I have attempted the solution myself.

## 🛠️ Environment & Tools
*   **Source Version:** Java 8 (prior knowledge)
*   **Target Version:** Java 25 (JDK 25)
*   **Build Tool:** Maven
*   **IDE:** IntelliJ IDEA
*   **Version Control:** Git, GitHub & GitLab

## 📦 Project Structure & Packages
The project follows the standard Maven architecture. The source code is located in `src/main/java`, and each challenge is organized into sequential packages under `me.andresdagu`:

```text
├── pom.xml               # Maven configuration file
├── src/
│   └── main/
│       └── java/
│           ├── me.andresdagu.section4/   # First Steps
│           │   ├── CHALLENGES.md  <-- Statements and links
│           │   ├── challenge1
│           │   │   └── Main.java 
│           │   ├── challenge2
│           │   │   └── Main.java 
│           │   └── challenge3
│           │       └── Main.java 
│           ├── me.andresdagu.section5/   # Local Variables
│           ├── me.andresdagu.section6/   # Booleans
│           ├── me.andresdagu.section7/   # Integers
│           └── ...                       
└── README.md
```

The package names follow the book's **section numbers**.

## 📚 How to Navigate This Repository
Each package corresponds to a challenge from the book. For example:
* `me.andresdagu.section4.challenge1` → Section 4, Challenge 1
* `me.andresdagu.section5.challenge3` → Section 5, Challenge 3

To find the original challenge statement, refer to the book's section using the link provided in each package's `CHALLENGES.md` (or directly in the book's table of contents).


## 🗺️ Roadmap
This repository follows the book's structure. You can check the book's table of contents for the full list of chapters and challenges:

👉  [**"Modern Java" - Table of Contents**](https://javabook.mccue.dev/)  
👉  [**"Modern Java" - GitHub Repository**](https://github.com/bowbahdoe/ModernJava)

*   **Chapter 1: Modern Java**
    *   [Section 4: First Steps](./src/main/java/me/andresdagu/section4/CHALLENGES.md) - Comments, Semicolons, Formatting
    *   [Section 5: Local Variables](./src/main/java/me/andresdagu/section5/CHALLENGES.md) - Naming, Reassignment, Delayed Assignment, Types, Final Variables, Inferred Types

[//]: # (*   **Chapter 2: Data Types I**)

[//]: # (    *   [Section 6: Booleans]&#40;./src/main/java/me/andresdagu/section6/CHALLENGES.md&#41; - Not, And, Or, Operator Precedence)

[//]: # (    *   [Section 7: Integers]&#40;./src/main/java/me/andresdagu/section7/CHALLENGES.md&#41; - Literals, Addition, Subtraction, Multiplication, Division, Remainder, Equality, Comparison, Chained Comparisons, Operator Precedence, Reassignment, Shorthands, Limits)

[//]: # (    *   [Section 8: Floating Point Numbers]&#40;./src/main/java/me/andresdagu/section8/CHALLENGES.md&#41; - Literals, Accuracy, Addition, Subtraction, Multiplication, Division, Equality, Comparison, Shorthands, NaN, Infinity, Square Root, Conversion)

[//]: # (    *   [Section 9: Characters]&#40;./src/main/java/me/andresdagu/section9/CHALLENGES.md&#41; - Literals, Escape Sequences, Conversion, Unicode)

[//]: # (    *   [Section 10: Strings]&#40;./src/main/java/me/andresdagu/section10/CHALLENGES.md&#41; - Literals, Escape Sequences, Empty String, Multiline, Concatenation, Equality, Length, Access Characters)

[//]: # (*   **Chapter 3: Interactive Programs**)

[//]: # (    *   [Section 11: Standard Input]&#40;./src/main/java/me/andresdagu/section11/CHALLENGES.md&#41; - Prompting, Interpreting Input, Integers, Floating Point, Other Types)

[//]: # (*   **Chapter 4: Control Flow I**)

[//]: # (    *   [Section 12: Branching Paths]&#40;./src/main/java/me/andresdagu/section12/CHALLENGES.md&#41; - If, Nested Ifs, Else, Else If, Delayed Assignment, Scoped Variables, Conditional Operator, Boolean Expressions)

[//]: # (    *   [Section 13: Loops]&#40;./src/main/java/me/andresdagu/section13/CHALLENGES.md&#41; - While, Endless Loops, Break, Continue, Unreachable Code, Do While, Nested Loops, Labeled Break, Labeled Continue, Iteration, Counting Up/Down, Iterate over String)

[//]: # (*   **Chapter 5: Projects**)

[//]: # (    *   [Section 14: Prelude]&#40;./src/main/java/me/andresdagu/section14/CHALLENGES.md&#41; - Project setup)

[//]: # (    *   [Section 15: Calorie Tracker]&#40;./src/main/java/me/andresdagu/section15/CHALLENGES.md&#41; - First guided project)

[//]: # (*   **Chapter 6: Data Types II**)

[//]: # (    *   [Section 16: Arrays]&#40;./src/main/java/me/andresdagu/section16/CHALLENGES.md&#41; - Initializers, Length, Access, Set, Aliasing, Reassignment, Final Variables, Printing, Empty Array, Initializer vs Literal, Initialization with new)

[//]: # (*   **Chapter 7: Control Flow II**)

[//]: # (    *   [Section 17: Loops II]&#40;./src/main/java/me/andresdagu/section17/CHALLENGES.md&#41; - For, Syntax, Counting Up/Down, Iterate over String/Array, Comparison to while, i, Break, Continue, Delayed Assignment, Inferred Types, Empty Initializers/Expressions/Statements, Final Variables, Labeled Break/Continue, Drawing Triangles)

[//]: # (*   **Chapter 8: Code Structure**)

[//]: # (    *   [Section 18: Methods]&#40;./src/main/java/me/andresdagu/section18/CHALLENGES.md&#41; - Declaration, Invocation, Scope, main)

[//]: # (    *   [Section 19: Arguments]&#40;./src/main/java/me/andresdagu/section19/CHALLENGES.md&#41; - Declaration, Invocation, Reassignment, Final Arguments, Aliasing, Overloading, Inferred Types)

[//]: # (    *   [Section 20: Return Values]&#40;./src/main/java/me/andresdagu/section20/CHALLENGES.md&#41; - Declaration, Return Statement, Exhaustiveness, void, Return in void, Conversion, Unreachable Statements)

[//]: # (*   **Chapter 9: Data Types III**)

[//]: # (    *   [Section 21: Multi-Dimensional Arrays]&#40;./src/main/java/me/andresdagu/section21/CHALLENGES.md&#41; - Declaration, Initializers, Initialization with new, Access, Set, Initialization with Size, Default Values, Populate, Ragged Arrays)

[//]: # (*   **Chapter 10: Projects**)

[//]: # (    *   [Section 22: ASCII Art Generator]&#40;./src/main/java/me/andresdagu/section22/CHALLENGES.md&#41; - Guided project)

[//]: # (*   **Chapter 11: Data Types IV**)

[//]: # (    *   [Section 23: null]&#40;./src/main/java/me/andresdagu/section23/CHALLENGES.md&#41; - Null as Absence, Null as Unknown, Checking for null, NullPointerException)

[//]: # (    *   [Section 24: Boxed Primitives]&#40;./src/main/java/me/andresdagu/section24/CHALLENGES.md&#41; - Integer, Double, Character, Boolean, Unboxing, Boxing, Arrays of Boxed)

[//]: # (    *   [Section 25: Arrays II]&#40;./src/main/java/me/andresdagu/section25/CHALLENGES.md&#41; - Initialization with Size, Default Values, Populate)

[//]: # (*   **Chapter 12: Code Structure II**)

[//]: # (    *   [Section 26: Classes]&#40;./src/main/java/me/andresdagu/section26/CHALLENGES.md&#41; - Meaning, Declaration, Naming, Instances, Fields, Field Initialization, Field Access, Default Values, Multiple Instances, Aliasing, Return Multiple Values)

[//]: # (    *   [Section 27: Instance Methods]&#40;./src/main/java/me/andresdagu/section27/CHALLENGES.md&#41; - Invocation, Arguments, Field Access, Field Updates, Derived Values, Invoke Other Methods, this, Disambiguation, Clarity)

[//]: # (*   **Chapter 13: Projects**)

[//]: # (    *   [Section 28: Point of Sale System]&#40;./src/main/java/me/andresdagu/section28/CHALLENGES.md&#41; - Guided project)

[//]: # (*   **Chapter 14: Data Types V**)

[//]: # (    *   [Section 29: Enums]&#40;./src/main/java/me/andresdagu/section29/CHALLENGES.md&#41; - Declaration, Variants, Naming, Usage, Equality, Comparison to boolean)

[//]: # (    *   [Section 30: Strings II]&#40;./src/main/java/me/andresdagu/section30/CHALLENGES.md&#41; - lowercase, UPPERCASE, Equality ignoring case, Check if empty, Check if blank, Strip whitespace)

[//]: # (*   **Chapter 15: Control Flow III**)

[//]: # (    *   [Section 31: Exceptions]&#40;./src/main/java/me/andresdagu/section31/CHALLENGES.md&#41; - throw, Messages, Stack Traces, try/catch)

[//]: # (    *   [Section 32: Switch]&#40;./src/main/java/me/andresdagu/section32/CHALLENGES.md&#41; - Case, Default, Strings, ints, Enums, Omitted Default, Combining Cases, null, Exhaustiveness)

[//]: # (*   **Chapter 16: Interactive Programs II**)

[//]: # (    *   [Section 33: Standard Input II]&#40;./src/main/java/me/andresdagu/section33/CHALLENGES.md&#41; - Reprompting, Enums, Delayed Assignment, Leniency, Aggregating Data)

[//]: # (*   **Chapter 17: Code Structure III**)

[//]: # (    *   [Section 34: Constructors]&#40;./src/main/java/me/andresdagu/section34/CHALLENGES.md&#41; - Declaration, Default Constructor, Arguments, Final Fields, Invariants, Overloads, Delegation)

[//]: # (    *   [Section 35: Global Fields]&#40;./src/main/java/me/andresdagu/section35/CHALLENGES.md&#41; - Default Values, Final Fields, Field Access, Inferred Types)

[//]: # (*   **Chapter 18: Projects**)

[//]: # (    *   [Section 36: Tic-Tac-Toe]&#40;./src/main/java/me/andresdagu/section36/CHALLENGES.md&#41; - Guided project)

[//]: # (*   **Chapter 19: Concepts**)

[//]: # (    *   [Section 37: Code is Read more than Written]&#40;./src/main/java/me/andresdagu/section37/CHALLENGES.md&#41; - Meaning, Implications, Information Density, Audience, Practice)

[//]: # (*   **Chapter 20: Control Flow IV**)

[//]: # (    *   [Section 38: Exceptions II]&#40;./src/main/java/me/andresdagu/section38/CHALLENGES.md&#41; - Checked, Unchecked, throws, Propagating, Exception, RuntimeException, Rethrowing, main)

[//]: # (    *   [Section 39: Switch II]&#40;./src/main/java/me/andresdagu/section39/CHALLENGES.md&#41; - Yield, Omitted Yield, Exhaustiveness, Return a Switch)

[//]: # (*   **Chapter 21: Code Structure IV**)

[//]: # (    *   [Section 40: Multi-File Programs]&#40;./src/main/java/me/andresdagu/section40/CHALLENGES.md&#41; - Sources folder, Main file, Second file, File names, Anonymous Main Class, Global Fields)

[//]: # (    *   [Section 41: Visibility]&#40;./src/main/java/me/andresdagu/section41/CHALLENGES.md&#41; - Private Methods, Private Fields, Invariants, Accessors, Getters and Setters)

[//]: # (    *   [Section 42: Static Fields]&#40;./src/main/java/me/andresdagu/section42/CHALLENGES.md&#41; - Declaration, Initialization, Usage, Constants, Controversy, Naming)

[//]: # (    *   [Section 43: Static Methods]&#40;./src/main/java/me/andresdagu/section43/CHALLENGES.md&#41; - Declaration, Scope, Naming, Usage, Math, Factories)

[//]: # (*   **Chapter 22: Data Structures & Algorithms**)

[//]: # (    *   [Section 44: Growable Arrays]&#40;./src/main/java/me/andresdagu/section44/CHALLENGES.md&#41; - Concept, Simple Implementation, Usage, Performance Problems, Performance Solutions, Optimized Implementation)

[//]: # (*   **Chapter 23: Interactive Programs III**)

[//]: # (    *   [Section 45: Command Line Arguments]&#40;./src/main/java/me/andresdagu/section45/CHALLENGES.md&#41; - Accessing Arguments, Conventions)

[//]: # (*   **Chapter 24: Code Structure V**)

[//]: # (    *   [Section 46: Inner Classes]&#40;./src/main/java/me/andresdagu/section46/CHALLENGES.md&#41; - Type, Instances, New Operator, Scope, Disambiguation, Anonymous Main Class, Static Inner, Private Inner)

[//]: # (    *   [Section 47: Packages]&#40;./src/main/java/me/andresdagu/section47/CHALLENGES.md&#41; - Declaration, Visibility, Public Classes, Fully Qualified Class Name, Import, Package Imports, Default Package, Anonymous Main Class, Public/Package-Private Methods/Fields/Constructors, Subpackages, Reverse Domain Name Notation)

[//]: # (*   **Chapter 25: Data Types VI**)

[//]: # (    *   [Section 48: Records]&#40;./src/main/java/me/andresdagu/section48/CHALLENGES.md&#41; - Declaration, Canonical Constructor, Component Accessors, Visibility, Printing, Equality, Return Multiple Values, Shorthand)

[//]: # (    *   [Section 49: Integers II]&#40;./src/main/java/me/andresdagu/section49/CHALLENGES.md&#41; - from String, to String, Base 16 Literals, from Base 16 String, to Base 16 String, Underscores)

[//]: # (*   **Chapter 26: Interactive Programs IV**)

[//]: # (    *   [Section 50: Files]&#40;./src/main/java/me/andresdagu/section50/CHALLENGES.md&#41; - Paths, IOException, UncheckedIOException, Write, Read, Create Folder)

[//]: # (*   **Chapter 27: Projects**)

[//]: # (    *   [Section 51: Data Visualization]&#40;./src/main/java/me/andresdagu/section51/CHALLENGES.md&#41; - Guided project)

[//]: # (*   **Chapter 28: Code Structure VI**)

[//]: # (    *   [Section 52: Object]&#40;./src/main/java/me/andresdagu/section52/CHALLENGES.md&#41; - Subtypes, instanceof, toString, Override toString, @Override, equals and hashCode, Override equals and hashCode)

[//]: # (    *   [Section 53: Generics]&#40;./src/main/java/me/andresdagu/section53/CHALLENGES.md&#41; - Type Variables, Naming, Instantiation, Inference, Soundness, Raw Types)

[//]: # (    *   [Section 54: Interfaces]&#40;./src/main/java/me/andresdagu/section54/CHALLENGES.md&#41; - Declaration, Implementation, @Override, Naming, Subtypes, Multiple Implementations)

[//]: # (*   **Chapter 29: Data Types VII**)

[//]: # (    *   [Section 55: Time]&#40;./src/main/java/me/andresdagu/section55/CHALLENGES.md&#41; - Instant, Duration, LocalDate, LocalTime, LocalDateTime, Time Zones, ZonedDateTime, OffsetDateTime, Date)

[//]: # (    *   [Section 56: ArrayList]&#40;./src/main/java/me/andresdagu/section56/CHALLENGES.md&#41; - Ubiquity, Add, Size, Get, Loop, Set, Remove)

[//]: # (    *   [Section 57: HashMap]&#40;./src/main/java/me/andresdagu/section57/CHALLENGES.md&#41; - Filing Cabinets, Keys and Values, Put, Get, Hash Functions, Hash Collision, Hash Distribution, Reference Based Identity, Value Based Identity, Appropriate Keys, Ubiquity)

[//]: # (*   **Chapter 30: Concepts II**)

[//]: # (    *   [Section 58: Hyrum's Law]&#40;./src/main/java/me/andresdagu/section58/CHALLENGES.md&#41; - Authority, Validity, Emergent Properties, Importance)

[//]: # (*   **Chapter 31: Control Flow V**)

[//]: # (    *   [Section 59: Switch III]&#40;./src/main/java/me/andresdagu/section59/CHALLENGES.md&#41; - break, fallthrough, return, default, yield)

[//]: # (    *   [Section 60: Recursion]&#40;./src/main/java/me/andresdagu/section60/CHALLENGES.md&#41; - Disclaimer, Base Case, Comparison to Delegation, Comparison to Loops, Counting Down, Accumulators, Recurse Over String/Array)

[//]: # (    *   [Section 61: Loops III]&#40;./src/main/java/me/andresdagu/section61/CHALLENGES.md&#41; - For-each, Arrays, Iterable and Iterator, ArrayList, String, Concurrent Modifications, Inferred Types)

[//]: # (*   **Chapter 32: Concepts III**)

[//]: # (    *   [Section 62: Encapsulation]&#40;./src/main/java/me/andresdagu/section62/CHALLENGES.md&#41; - Implementation Details, Implicit Interfaces, Methods, Classes, Abstraction, Coupling, Leaky Abstractions, Information Hiding)

[//]: # (*   **Chapter 33: Data Types VIII**)

[//]: # (    *   [Section 63: Collections]&#40;./src/main/java/me/andresdagu/section63/CHALLENGES.md&#41; - List, Map, Set, Arrays, UnsupportedOperationException, Factories, Specificity)

[//]: # (*   **Chapter 34: Metaprogramming**)

[//]: # (    *   [Section 64: Reflection]&#40;./src/main/java/me/andresdagu/section64/CHALLENGES.md&#41; - Class Objects, Get all Fields, Get a Field, Read/Write Field, Get all Methods, Get a Method, Invoke Method, Get/Invoke Constructors)

[//]: # (    *   [Section 65: Annotations]&#40;./src/main/java/me/andresdagu/section65/CHALLENGES.md&#41; - Declaration, Usage, Elements, Usage with Elements, Defaults, @Target, @Retention, Reflective Access, @Override)

[//]: # (*   **Chapter 35: Code Structure VII**)

[//]: # (    *   [Section 66: Interfaces II]&#40;./src/main/java/me/andresdagu/section66/CHALLENGES.md&#41; - Default Methods, Interface Extension, Static Methods, Static Fields)

[//]: # (    *   [Section 67: Class Extension]&#40;./src/main/java/me/andresdagu/section67/CHALLENGES.md&#41; - Extend a Class, Inheritance, Override, Protected, Abstract Classes, Abstract Methods, Relation to Interfaces/Encapsulation, Final Classes)

[//]: # (*   **Chapter 36: Data Types IX**)

[//]: # (    *   [Section 68: Niche Numerics]&#40;./src/main/java/me/andresdagu/section68/CHALLENGES.md&#41; - byte, short, long, Unsigned Operations, float)

[//]: # (*   **Chapter 37: Projects**)

[//]: # (    *   [Section 69: Music Maker]&#40;./src/main/java/me/andresdagu/section69/CHALLENGES.md&#41; - Guided project)

[//]: # (*   **Chapter 38: Code Structure VIII**)

[//]: # (    *   [Section 70: Modules]&#40;./src/main/java/me/andresdagu/section70/CHALLENGES.md&#41; - Declaration, Restrictions, Exports, Requires, Module Imports, java.base, Unnamed Module, Multi-Module Directory Layout, Purpose)

[//]: # (    *   [Section 71: Lambdas]&#40;./src/main/java/me/andresdagu/section71/CHALLENGES.md&#41; - Functional Interfaces, @FunctionalInterface, Lambda Expressions, Arguments, Return, Method References, Constructor References, Inference, Built-In Functional Interfaces, Checked Exceptions)

[//]: # (*   **Chapter 39: Sharing Code**)

[//]: # (    *   [Section 72: Compilation]&#40;./src/main/java/me/andresdagu/section72/CHALLENGES.md&#41; - javac, Class Files, Modules, Compile Multiple Files, Clean, -g, Running Compiled Code)

[//]: # (    *   [Section 73: Packaging]&#40;./src/main/java/me/andresdagu/section73/CHALLENGES.md&#41; - jar, Jar Files, --module-path, --main-class, Libraries)

[//]: # (*   **Chapter 40: Tools**)

[//]: # (    *   [Section 74: just]&#40;./src/main/java/me/andresdagu/section74/CHALLENGES.md&#41; - Installation, Justfile, Recipes, Dependencies, Documentation Comments, Further Reading)

[//]: # (*   **Chapter 41: Sharing Code II**)

[//]: # (    *   [Section 75: Documentation]&#40;./src/main/java/me/andresdagu/section75/CHALLENGES.md&#41; - Documentation Comments, Format, javadoc)

[//]: # (*   **Chapter 42: Data Types X**)

[//]: # (    *   [Section 76: Streams]&#40;./src/main/java/me/andresdagu/section76/CHALLENGES.md&#41; - stream, map, filter, Terminal Operations, Collectors, Purpose)

## 💾  Git Workflow
I commit per challenge or per completed chapter, following semantic commit messages:
*   `feat: add section 4 challenge 1 solution`
*   `fix: correct binary search infinite loop`
*   `docs: update README roadmap`
*   `refactor: simplify switch expression`

The `.gitignore` file is configured to exclude Maven's `target/` directory, IntelliJ-specific configuration files inside `.idea/` folder, and compiled `.class` files.

## 🚀 How to Run the Lessons
1. Clone this repository.
2. Open the `pom.xml` file or the project root folder using **IntelliJ IDEA** (select "Open as Project").
3. Make sure your Project SDK is set to **JDK 25** in IntelliJ (`File > Project Structure > Project`).
4. Navigate to the desired challenge package (e.g., `me.andresdagu.section4.challenge1`), right-click the file with the `Main` method, and select **Run**.
