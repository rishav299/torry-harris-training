create table regions(
region_id int NOT NULL,
region_name varchar(225),
primary key(region_id));

select * from regions;

insert into regions values(1,'Europe');
insert into regions values(1,'Europe');
commit;







create table countries(
country_id char not null,
country_name varchar(225),
region_id int not null,
primary key(country_id),
foreign key(region_id) references regions(region_id));

alter table countries modify column country_id char(225);
insert into  countries values('A','India',1);
drop table countries;

create table locations(
location_id int(250) not null auto_increment,
street_address varchar(225),
postal_code varchar(225),
city varchar(225) not null,
state_province varchar(225),
country_id char not null,
primary key(location_id),
foreign key(country_id) references countries(country_id));

alter table locations modify column country_id char(225);
alter table locations add foreign key (country_id) references countries(country_id);

insert into locations values(1200,'2017 Shinjuku_ku','1689','Tokyo','Tokyo Prefecture','A');
commit;


create table departments(
department_id int not null,
department_name varchar(225) not null,
manager_id int,
location_id int,
primary key(department_id),
foreign key(location_id) references locations(location_id));



insert into departments values(10,'Admin',3,1200);

drop table departments;
commit;

create table jobs(
job_id varchar(225) not null,
job_title varchar(225) not null,
min_salary decimal,
max_salary decimal,
primary key(job_id));

insert into jobs values('AD_VP','Admin VP',15000,30000);

create table employees(
employee_id int not null,
first_name varchar(225),
last_name varchar(225) not null,
email varchar(225) not null,
phone_number varchar(12) not null,
hire_date date not null,
job_id varchar(225) not null,
salary decimal not null,
commission_pct decimal,
manager_id int,
department_id int,
primary key(employee_id),
foreign key(job_id) references jobs(job_id),
foreign key(department_id) references departments(department_id),
foreign key(manager_id) references employees(employee_id));

insert into employees values(121,'Rishav Kr','Chourasia','abc@gmail.com','12345','2021/01/01','AD_VP',50000,null,null,10);
commit;

create table job_history(
employee_id int not null,
start_date date not null,
end_date date not null,
job_id varchar(225) not null,
department_id int not null,
foreign key(employee_id) references employees(employee_id),
foreign key(department_id) references departments(department_id));
 commit;
 show tables;
 
 insert into job_history values(121,'2021/02/12','2022/02/12','AD_VP',10);
 desc employees;
 select * from employees;
 select * from regions;
 select * from countries;
 select * from locations;
 select * from departments;
 select * from jobs;
 select * from employees;
 select * from job_history;
 drop table employee2;
 
 
 
 