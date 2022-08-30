# Springboot_CRUD-Operation

import this source code into your IDE, then create a database in mysql workbench using below query 

Query : create database data

then, provide url,username,password in application.properties as I have given in the code

then, run the source code it will generate a employee table in the DB

then add the data either by postman (update url) or add it directly in the mysql workbench

Sample data :
{
    "empId": 1,
    "name": "Ganesh",
    "role": "Associate",
    "salary": 22000,
    "dept_id": 101
  }

Query : insert into employee(empID,name,role,salary) values(01,"Jeyapriya","Associate",45000
