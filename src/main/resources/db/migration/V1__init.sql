create table if not exists users
(
    id      UUID  PRIMARY KEY,
    login       varchar(30),
    password    varchar(50),
    mail        varchar(30),
    phone       int8
);