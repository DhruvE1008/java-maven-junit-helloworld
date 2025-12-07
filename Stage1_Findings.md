# Stage 1 Findings: Modularity and Maintainability Issues

## Identified Issues

### 1. Tight Coupling Between Components
- The `HelloApp` class directly instantiates and uses the `Hello` class, creating tight coupling between the application entry point and business logic.
- The `HelloApp` class also directly handles system exit codes and error handling, mixing concerns.

### 2. Poor Separation of Concerns
- The `HelloApp` class handles both:
  - Application entry point and argument parsing
  - Business logic (using `Hello` class)
  - Error handling and system exits
- This violates the single responsibility principle.

### 3. Hardcoded Constants
- Constants like `DEFAULT_TIMES`, `EXIT_STATUS_PARAMETER_NOT_UNDERSTOOD`, and `EXIT_STATUS_HELLO_FAILED` are hardcoded in `HelloApp`.
- These should be moved to a configuration or constants class.

### 4. Limited Extensibility
- The current design makes it difficult to extend functionality without modifying existing classes.
- For example, adding new ways to output "Hello!" would require changes to `HelloApp`.

### 5. Test Dependencies
- The `HelloAppTest` relies on a custom `TestingSecurityManager` to intercept `System.exit()` calls.
- This makes tests more complex and harder to maintain.

### 6. Lack of Interface Abstraction
- There's no interface abstraction for the `Hello` class, making it hard to mock or substitute implementations.

### 7. Global State Usage
- The `Hello` class uses static fields (`HELLO`, `MAXIMUM_AMOUNT_OF_TIMES`) which can lead to issues in concurrent environments.

## Proposed Stage 2 Prompt

Create a high-level design for refactoring the codebase to improve modularity and maintainability. The design should:

1. Separate concerns by creating distinct layers:
   - Application layer (entry point)
   - Business logic layer (Hello class)
   - Output layer (handling of printing)

2. Introduce interfaces to decouple components and enable easier testing.

3. Move constants to appropriate configuration classes.

4. Create a factory or service layer to handle object creation and dependency injection.

5. Ensure that the refactored code continues to compile, run, and pass all existing tests.

Important: This prompt should only generate a high-level design description for Stage 3 implementation. Do not generate any actual code in this stage. The output should be in a new file for another agent to implement in Stage 3.

Also, ensure that Stage 3 implementation does not modify any test files. The test files should remain unchanged and continue to pass after the refactoring.