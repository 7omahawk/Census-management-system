# Census Management System
The Census Management System is an open-source code designed to streamline the collection, organization, and analysis of census data. It provides a user-friendly interface for managing demographic information, generating reports, and extracting valuable insights about population characteristics and trends.

# Features
**Data Collection:** Easily capture and store demographic data from individuals or households, including personal details. <br />
**Data Validation:** Implement validation rules to ensure data accuracy and completeness during the collection process. <br />
**Data Storage:** Securely store and manage collected census data in a local database or file system. <br />
**User Management:** Assign user roles and permissions to control access to the system, ensuring data privacy and security. <br />
**Customization:** Extend and customize the system according to specific requirements, such as adding additional data fields.

# Technologies:
* Java
* Java GUI
* MySQL

# How to use
* First, you need an **IDE** which can run **Java**. **[Recommended: NetBeans]**
* Second, you need to use a **MySQL** server to store data in your local host. For this project you need to create three table to store data. Here is the schema:
  1. **register_admin_account (Name, Admin_UserName, Email,Phone, Pass_Word)**
  2. **register_user_account (Name ,User_UserName ,Email ,Phone,Pass_Word,Admin_UserName)**
  3. **addinformation (RegID, Name, FatherName, DateofBirth, NIDNo, Gender, BloodGroup, Address, ContactNumber,Nationality,User_UserName)**
* Download this project in your pc and open it with your **IDE** at the same time you need to start your **MySQL** server otherwise the code will show **error** when you need to find any people with their information.
* Here you go to run the project well.

# Contact
The project is created by <a href="https://github.com/7omahawk" target="_blank"> @7omahawk </a> & <a href="https://github.com/Abdullah-Al-Sami" target="_blank"> @Abdullah-Al-Sami </a>. <br />
If you have any questions, feedback, or inquiries regarding the Census Management System, please contact our team at [ahulr.official@gmail.com, abdullah.al.sami05@gmail.com].
