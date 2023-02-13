create database mart;
use mart;

create table customers(
customer_number int primary key,
first_name varchar(255) not null,
address varchar(255) null,
city varchar(255) not null
};