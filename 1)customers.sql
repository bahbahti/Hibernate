CREATE TABLE customers
(
  customer_id SERIAL PRIMARY KEY NOT NULL,
  last_name VARCHAR NOT NULL,
  area VARCHAR NOT NULL,
  discount INT NOT NULL
);
CREATE UNIQUE INDEX customer_id_uidx ON customers (customer_id);

INSERT INTO customers (last_name, area, discount) VALUES ('Ivanov', 'Nizhegorodskiy',15);
INSERT INTO customers (last_name, area, discount) VALUES ('Petrov', 'Sormovskiy',10);
INSERT INTO customers (last_name, area, discount) VALUES ('Sidorov', 'Sovetskiy',30);
INSERT INTO customers (last_name, area, discount) VALUES ('Malinin', 'Leninskiy',5);
INSERT INTO customers (last_name, area, discount) VALUES ('Myakishev', 'Nizhegorodskiy',50);
INSERT INTO customers (last_name, area, discount) VALUES ('Erovenko', 'Autozavodskiy',13);
INSERT INTO customers (last_name, area, discount) VALUES ('Nikitin', 'Nizhegorodskiy',13);
INSERT INTO customers (last_name, area, discount) VALUES ('Kirkorov', 'Nizhegorodskiy',24);
INSERT INTO customers (last_name, area, discount) VALUES ('Trump', 'Autozavodskiy',10);
INSERT INTO customers (last_name, area, discount) VALUES ('Putin', 'Autozavodskiy',9);
INSERT INTO customers (last_name, area, discount) VALUES ('Gromov', 'Nizhegorodskiy',16);
INSERT INTO customers (last_name, area, discount) VALUES ('Danelevskiy', 'Nizhegorodskiy',13);
INSERT INTO customers (last_name, area, discount) VALUES ('Kozlovskiy', 'Sovetskiy',31);
INSERT INTO customers (last_name, area, discount) VALUES ('Artemyev', 'Sormovskiy',32);
INSERT INTO customers (last_name, area, discount) VALUES ('Ivanov', 'Leninskiy',12);
INSERT INTO customers (last_name, area, discount) VALUES ('Nepalov', 'Sormovskiy',5);
INSERT INTO customers (last_name, area, discount) VALUES ('Zastoev', 'Sormovskiy',12);
INSERT INTO customers (last_name, area, discount) VALUES ('Mandarinov', 'Leninskiy',16);
INSERT INTO customers (last_name, area, discount) VALUES ('Mnogov', 'Sormovskiy',30);
INSERT INTO customers (last_name, area, discount) VALUES ('Pravdin', 'Leninskiy',20);

