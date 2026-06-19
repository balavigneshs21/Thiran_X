# HandyX - Work Management System

HandyX is a comprehensive console-based Work Management System (WMS) designed to streamline organizational operations. It provides a robust suite of features for managing employees, projects, tasks, shifts, leaves, and performance reviews within a unified command-line interface.

## 🚀 Key Features

### For Managers
- **Employee Management:** Create, list, and manage employee profiles and roles.
- **Project Oversight:** Define projects, assign managers, and track overall progress.
- **Task Delegation:** Assign tasks to team members with specific priority levels and deadlines.
- **Shift Scheduling:** Assign and monitor employee work shifts to ensure coverage.
- **Leave Management:** Review and approve or reject leave requests from the team.
- **Performance Reviews:** Conduct evaluations and provide feedback to employees using a star-rating system.
- **Internal Announcements:** Post updates and announcements to keep the entire organization informed.

### For Employees
- **Personal Dashboard:** View personal assigned tasks, shifts, and project involvement.
- **Task Management:** Update status and track progress on assigned tasks.
- **Leave Requests:** Submit leave applications and track their approval status.
- **Performance Feedback:** View personal performance reviews and ratings.
- **Stay Informed:** Access organization-wide announcements and updates.

## 🛠️ Technologies Used
- **Language:** Java 8+
- **Architecture:** Model-View-Controller (MVC)
- **Data Persistence:** In-memory Database (Singleton Pattern)
- **Interface:** Command Line Interface (CLI)

## 📁 Project Structure

```text
com.handyx
├── Main.java               # Application Entry Point & Initialization
├── data
│   ├── dto                 # Data Transfer Objects (Employee, Task, Project, etc.)
│   └── repository          # Data Access Layer & In-memory Storage (HandyXDB)
├── features                # Functional Modules (MVC Pattern)
│   ├── announcement        # Management of company-wide announcements
│   ├── home                # Dashboards for Manager and Employee roles
│   ├── leave               # Leave request and approval system
│   ├── performance         # Employee performance evaluation module
│   ├── project             # Project creation and tracking
│   ├── shift               # Work shift scheduling and viewing
│   ├── signin              # Authentication logic
│   ├── signup              # New employee registration
│   └── task                # Task assignment and status management
└── util                    # Shared Utilities (DateHelper, ConsoleInput)
```

## 🏁 Getting Started

### Prerequisites
- **Java Development Kit (JDK) 8** or higher.
- A terminal or an IDE (IntelliJ IDEA, Eclipse, etc.).

### Installation
1. Clone the repository or download the source code.
2. Open the project in your preferred IDE or navigate to the root directory in your terminal.

### Running the Application

**Using an IDE:**
1. Open the project in your IDE.
2. Locate `src/com/handyx/Main.java`.
3. Right-click and select **Run 'Main.main()'**.

**Using Terminal:**
```bash
# Navigate to the project root
cd HandyX_V1_0_0

# Compile the project
javac -d out -sourcepath src src/com/handyx/Main.java

# Run the project
java -cp out com.handyx.Main
```

## 🔑 Usage & Authentication
The system uses role-based access control. On the very first run, a **Default Manager** account is automatically seeded into the in-memory database.

1. **First Login:** Use the default manager credentials to access the system and begin adding projects and employees.
2. **Date Format:** The system expects dates in the format `dd-MM-yyyy` (e.g., `25-12-2026`).
3. **Role Switching:** The interface dynamically changes based on whether the logged-in user is a **MANAGER** or an **EMPLOYEE**.

## 📝 License
This project is provided for educational and internal management purposes.
