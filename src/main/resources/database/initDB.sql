CREATE TABLE IF NOT EXISTS users
(
   id    SERIAL PRIMARY KEY ,
   name  VARCHAR(200) NOT NULL ,
   email VARCHAR(254) NOT NULL
);