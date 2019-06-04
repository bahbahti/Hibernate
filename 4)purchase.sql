CREATE TABLE purchase
(
  purchase_id SERIAL PRIMARY KEY NOT NULL,
  date DATE,
  seller INT NOT NULL,
  customer INT NOT NULL,
  book INT NOT NULL,
  amount INT NOT NULL,
  cost INT NOT NULL,
  CONSTRAINT purchase_customer_fk FOREIGN KEY (customer) REFERENCES customers (customer_id)
  MATCH FULL ON UPDATE CASCADE ON DELETE CASCADE,
  CONSTRAINT purchase_shop_fk FOREIGN KEY (seller) REFERENCES shop (shop_id)
  MATCH FULL ON UPDATE CASCADE ON DELETE CASCADE,
  CONSTRAINT purchase_book_fk FOREIGN KEY (book) REFERENCES books (book_id)
  MATCH FULL ON UPDATE CASCADE ON DELETE CASCADE
);
CREATE UNIQUE INDEX purchase_id_uidx ON purchase (purchase_id);

INSERT INTO purchase(date, seller, customer, book, amount, cost) VALUES ('2018-02-23',2,3,1,3,21000*3);
INSERT INTO purchase(date, seller, customer, book, amount, cost) VALUES ('2018-08-12',6,6,2,13,2342*13);
INSERT INTO purchase(date, seller, customer, book, amount, cost) VALUES ('2018-08-21',8,2,6,1,876);
INSERT INTO purchase(date, seller, customer, book, amount, cost) VALUES ('2018-01-02',1,4,3,4,231*4);
INSERT INTO purchase(date, seller, customer, book, amount, cost) VALUES ('2018-06-14',7,5,3,2,231*2);
INSERT INTO purchase(date, seller, customer, book, amount, cost) VALUES ('2018-05-17',4,5,2,1,2342);
INSERT INTO purchase(date, seller, customer, book, amount, cost) VALUES ('2018-01-03',17,6,2,5,2342*5);
INSERT INTO purchase(date, seller, customer, book, amount, cost) VALUES ('2018-10-17',12,4,2,1,2342);
INSERT INTO purchase(date, seller, customer, book, amount, cost) VALUES ('2018-11-11',3,4,3,1,231);
INSERT INTO purchase(date, seller, customer, book, amount, cost) VALUES ('2018-11-11',8,4,7,1,23000);
INSERT INTO purchase(date, seller, customer, book, amount, cost) VALUES ('2018-06-14',7,8,3,2,231*2);
INSERT INTO purchase(date, seller, customer, book, amount, cost) VALUES ('2018-05-17',10,5,2,1,2342);
INSERT INTO purchase(date, seller, customer, book, amount, cost) VALUES ('2018-02-01',15,11,11,3,68643*3);
INSERT INTO purchase(date, seller, customer, book, amount, cost) VALUES ('2018-01-03',17,6,2,5,2342*5);
INSERT INTO purchase(date, seller, customer, book, amount, cost) VALUES ('2018-10-17',12,5,2,1,2342);
INSERT INTO purchase(date, seller, customer, book, amount, cost) VALUES ('2018-11-11',3,6,3,1,231);
INSERT INTO purchase(date, seller, customer, book, amount, cost) VALUES ('2018-11-11',8,6,7,1,23000);