--drop table if exists users;
--drop table if exists add_info;
--drop table if exists fruits;
--drop table if exists users_info;
--drop table if exists users_fruits;

create table if not exists fruits (
	fruit_id bigint primary key auto_increment,
    fruit_name varchar(100) not null,
    unique(fruit_name)
);

create table if not exists add_info (
	info_id bigint primary key auto_increment,
    first_name varchar(50),
    last_name varchar(150),
    email varchar(250),
    phone_number varchar(15),
    unique(email, phone_number)
);

create table if not exists users (
	userId bigint primary key auto_increment,
    uuid varchar(36) not null,
    username varchar(100) not null,
    password varchar(255) not null,
--    user_info,
    user_role varchar(20) not null default 'USER',
    user_status varchar(20) not null default 'ACTIVE',
--    fruits,
    unique(uuid, username)

);

create table if not exists users_info (

);

create table if not exists users_fruits (

);