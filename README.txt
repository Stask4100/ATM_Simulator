----------------------------------------------

Use these commands in MySQL to correctly work

----------------------------------------------

create database bankmanagementsystem;

use bankmanagementsystem;

create table signup(formno varchar(20), name varchar(20), surname varchar(20), dob varchar(20), gender varchar(20), email varchar(30), marital_status varchar(20), address varchar(40), city varchar(25), pincode varchar(20), state varchar(25));

create table signuptwo(formno varchar(20), religion varchar(20), spheresOfsociety varchar(30), income varchar(20), education varchar(50), occupation varchar(20), tin varchar(20), document varchar(20), seniorcitizen varchar(20), existingaccount varchar(20));

create table signupthree(formno varchar(20), accountType varchar(40), cardnumber varchar(25), pin varchar(10), facility varchar(100));

create table login(formno varchar(20), cardnumber varchar(25), pin varchar(10));

create table bank(pin varchar(10), date varchar(50), type varchar(20), amount varchar(20));