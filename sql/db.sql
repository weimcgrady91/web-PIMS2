create table user (
	id int auto_increment,
    username varchar(40) not null ,
    password varchar(40) not null,
    sex int ,
    birth date,
    nation varchar(40),
    edu varchar(40),
    phone varchar(20),
    place varchar(20),
    email varchar(40),
    primary key (id)
);