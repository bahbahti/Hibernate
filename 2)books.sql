CREATE TABLE books
(
    book_id SERIAL PRIMARY KEY NOT NULL,
    name VARCHAR NOT NULL,
    cost INT NOT NULL,
    storage VARCHAR NOT NULL,
    amount INT NOT NULL
);
CREATE UNIQUE INDEX books_id_uidx ON books (book_id);

INSERT INTO books (name, cost, storage, amount) VALUES ('AAndB', 21000,'Sovetskiy',10);
INSERT INTO books (name, cost, storage, amount) VALUES ('1984', 2342,'Nizhegorodskiy',32);
INSERT INTO books (name, cost, storage, amount) VALUES ('SadWindows', 231,'Sormovskiy',5);
INSERT INTO books (name, cost, storage, amount) VALUES ('How', 21,'Sovetskiy',43);
INSERT INTO books (name, cost, storage, amount) VALUES ('I', 342,'Sormovskiy',56);
INSERT INTO books (name, cost, storage, amount) VALUES ('Can', 876,'Leninskiy',3);
INSERT INTO books (name, cost, storage, amount) VALUES ('Rename', 23000,'Nizhegorodskiy',45);
INSERT INTO books (name, cost, storage, amount) VALUES ('It', 654,'Sovetskiy',83);
INSERT INTO books (name, cost, storage, amount) VALUES ('Windows', 654,'Sovetskiy',83);
INSERT INTO books (name, cost, storage, amount) VALUES ('Windows', 611154,'Leninskiy',831);
INSERT INTO books (name, cost, storage, amount) VALUES ('WindowsQQQQQ', 6,'Leninskiy',831);
INSERT INTO books (name, cost, storage, amount) VALUES ('aaaaaWindows', 154,'Leninskiy',831);
