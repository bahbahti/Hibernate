CREATE TABLE shop
(
  shop_id SERIAL PRIMARY KEY NOT NULL,
  shop_name VARCHAR NOT NULL,
  area VARCHAR NOT NULL,
  comissions INT NOT NULL
);
CREATE UNIQUE INDEX shop_id_uidx ON shop (shop_id);

INSERT INTO shop (shop_name, area, comissions) VALUES ('The', 'Sovetskiy',4);
INSERT INTO shop (shop_name, area, comissions) VALUES ('principle', 'Autozavodskiy',8);
INSERT INTO shop (shop_name, area, comissions) VALUES ('Of', 'Nizhegorodskiy',15);
INSERT INTO shop (shop_name, area, comissions) VALUES ('Shops', 'Leninskiy',16);
INSERT INTO shop (shop_name, area, comissions) VALUES ('Naming', 'Sovetskiy',23);
INSERT INTO shop (shop_name, area, comissions) VALUES ('Is', 'Sormovskiy',42);
INSERT INTO shop (shop_name, area, comissions) VALUES ('The', 'Sovetskiy',14);
INSERT INTO shop (shop_name, area, comissions) VALUES ('Same', 'Nizhegorodskiy',17);
INSERT INTO shop (shop_name, area, comissions) VALUES ('fas', 'Sormovskiy',7);
INSERT INTO shop (shop_name, area, comissions) VALUES ('GGG', 'Sormovskiy',17);
INSERT INTO shop (shop_name, area, comissions) VALUES ('Naming', 'Sovetskiy',23);
INSERT INTO shop (shop_name, area, comissions) VALUES ('Is', 'Sormovskiy',42);
INSERT INTO shop (shop_name, area, comissions) VALUES ('The', 'Sovetskiy',14);
INSERT INTO shop (shop_name, area, comissions) VALUES ('Same', 'Nizhegorodskiy',17);
INSERT INTO shop (shop_name, area, comissions) VALUES ('with', 'Autozavodskiy',23);
INSERT INTO shop (shop_name, area, comissions) VALUES ('principle', 'Leninskiy',19);
INSERT INTO shop (shop_name, area, comissions) VALUES ('of', 'Sormovskiy',15);
INSERT INTO shop (shop_name, area, comissions) VALUES ('Books', 'Autozavodskiy',13);


