show databases;

create database qualitasDB;

use qualitasDB;



create database q11;
DROP DATABASE q11;

CREATE TABLE Persons (
    PersonID int,
    LastName varchar(255),
    FirstName varchar(255),
    Address varchar(255),
    City varchar(255),
);


show tables;

select * from Persons;   -- * means everything 

select FirstName from Persons;   -- column specific

select FirstName,city from Persons; 


INSERT INTO Persons (PersonID, LastName, FirstName, Address)
VALUES (22,'man','spider','usa');


INSERT INTO Persons 
VALUES (11,'man','spider','india','delhi');

INSERT INTO Persons 
VALUES (11,'man','spider','india','delhi');

INSERT INTO Persons 
VALUES (14,'abc','america','captain','turkey');

INSERT INTO Persons 
VALUES (100,'strange','dr','australia','delhi');

select * from persons;

select distinct(firstname) from persons;

DELETE FROM persons WHERE city='turkey';

SET sql_safe_updates=0;

DELETE FROM persons WHERE city='turkey';

select * from persons;
-- selecting a particular record
select * from persons where personID = 100;  --  // perfered
select * from persons where firstname = 'dr';
-- updating a rcord
select * from persons;

update persons 
set address = 'newzealand' 
where personid  = 100;



INSERT INTO Persons 
VALUES (4,'hero','hulk','india','chennai');
select * from persons 
where address = 'india' and city = 'chennai';
select * from persons 
where address = 'india' or lastname = 'strange';


select * from persons 
order by city desc;