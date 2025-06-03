# LibraryMan**agementProject
**Objective**
To develop a full-stack application that operates entirely within the console, providing functionalities such as:
1.Managing book inventories.
2.Handling user registrations and authentications.
3.Issuing and returning books.
4.Maintaining transaction records.


**Features**
1.User Authentication:
Role-based access for Admins, Librarians, and Members.

2.Book Management:
Add, update, delete, and search books.

3.User Management:
Register new users, update user information, and manage user roles.

4.Transaction Handling:
Issue and return books with due date tracking.

**Learning Outcomes**
By working on this project, you will:
1.Understand the integration of frontend and backend  environment.
2.Gain experience with database operations using Mysql.
3.Implement role-based access control.
4.Enhance skills in structuring and organizing code for scalability.

# 🛠️ Technologies Used

| Layer        | Technologies                |
|--------------|-----------------------------|
| Frontend     | HTML, CSS, JSP              |
| Backend      | Java (Servlets, JSP)        |
| Database     | MySQL                       |
| Server       | Apache Tomcat               |
| Tools        | Eclipse IDE, MySQL Workbench|

---

## 📂 Project Structure

LibraryManagementProject/
│
├── src/
│ ├── admin/ # Admin servlets
│ ├── user/ # User servlets
│ ├── dao/ # Data Access Objects
│ └── model/ # JavaBeans (POJOs)
│
├── WebContent/
│ ├── css/ # Custom stylesheets
│ ├── jsp/ # JSP pages (views)
│ └── WEB-INF/web.xml # Servlet mappings
│
└── sql/
└── schema.sql # MySQL table definitions

yaml
Copy code

---

## 🧪 How to Run the Project

1. **Clone the Repository**
   ```bash
   git clone https://github.com/seepanasateeshchandra/LibraryManagementProject.git
Import Project in Eclipse

Open Eclipse.

Go to File > Import > Existing Projects into Workspace.

Select the project folder.

Setup Database

Open MySQL Workbench.

Create a new database (e.g., librarydb).

Run schema.sql to create tables.

Configure DB Connection

Update DB credentials in DBConnection.java.

Deploy on Apache Tomcat

Add the project to your local Tomcat server in Eclipse.

Start the server and access the app:

http://localhost:8080/LibraryManagementProject/
#🧑‍💼 **Admin Credentials**
Use these credentials to log in as admin (set manually in DB):
Username: admin
Password: admin123


**#Future Enhancements**
1.Integrate Spring Boot for better structure.

2.Use Hibernate or JPA for ORM.

3.Add password encryption for better security.

4.Implement pagination and search filtering.

5.Add email notifications for due/return alerts.

Password: admin123

