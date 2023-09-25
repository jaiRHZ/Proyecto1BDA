CREATE DATABASE tiendaVideojuegos;
USE tiendaVideojuegos;

CREATE TABLE Compradores (
id INT PRIMARY KEY AUTO_INCREMENT,
email VARCHAR(50) NOT NULL,
usuario VARCHAR(25) UNIQUE NOT NULL,
nombres VARCHAR(20) NOT NULL,
aPaterno VARCHAR(20) NOT NULL,
aMaterno VARCHAR(20),
calle VARCHAR(20) NOT NULL,
numero INT NOT NULL,
codigoPostal INT NOT NULL,
idCredencial INT NOT NULL,
contrasena VARCHAR(25) NOT NULL
);

CREATE TABLE Compras(
idCompras INT PRIMARY KEY AUTO_INCREMENT,
fechaOrden DATE DEFAULT NULL,
idComprador INT,
FOREIGN KEY (idComprador) REFERENCES Compradores(id)
);

CREATE TABLE Videojuegos(
idJuego INT PRIMARY KEY AUTO_INCREMENT,
estudio VARCHAR(20) NOT NULL,
clasificacion VARCHAR(20) NOT NULL,
titulo VARCHAR(50) NOT NULL,
genero VARCHAR(20) NOT NULL
);

CREATE TABLE Copias(
idCopia INT PRIMARY KEY AUTO_INCREMENT,
precio FLOAT NOT NULL,
idVideojuego INT,
FOREIGN KEY (idVideojuego) REFERENCES Videojuegos(idJuego)
);

CREATE TABLE compraCopias(
idCompraCopias INT PRIMARY KEY AUTO_INCREMENT,
idCompras INT,
idCopia INT,
cantidad INT NOT NULL,
FOREIGN KEY (idCompras) REFERENCES Compras(idCompras),
FOREIGN KEY (idCopia) REFERENCES Copias(idCopia)
);

-- INSERTS --

INSERT INTO videojuegos (estudio, clasificacion, titulo, genero) VALUES ("Ninja Kiwi", "E", "Bloons TD 6", "Estrategia");
INSERT INTO videojuegos (estudio, clasificacion, titulo, genero) VALUES ("Starbreeze Studio", "M", "PAYDAY 2", "Acción, Rol");
INSERT INTO videojuegos (estudio, clasificacion, titulo, genero) VALUES ("Nicalis, Inc.", "T", "The Binding of Isaac: Rebirth", "Acción");
INSERT INTO videojuegos (estudio, clasificacion, titulo, genero) VALUES ("KONAMI", "M", "SILENT HILL 2", "Acción, Aventura");
INSERT INTO videojuegos (estudio, clasificacion, titulo, genero) VALUES ("KONAMI", "M", "METAL GEAR SOLID V: THE DEFINITVE EXPERIENCE", "Acción, Aventura");
INSERT INTO videojuegos (estudio, clasificacion, titulo, genero) VALUES ("Rockstar Games", "M", "Red Dead Redemption 2", "Acción, Aventura");
INSERT INTO videojuegos (estudio, clasificacion, titulo, genero) VALUES ("Rockstar Games", "M", "Grand Theft Auto V", "Acción, Aventura");
INSERT INTO videojuegos (estudio, clasificacion, titulo, genero) VALUES ("Activision", "E 10+", "Crash Bandicoot N. Sane Trilogy", "Acción");


INSERT INTO copias (precio, idVideojuego) VALUES (149.99, 1);
INSERT INTO copias (precio, idVideojuego) VALUES (123.99, 2);
INSERT INTO copias (precio, idVideojuego) VALUES (149.99, 3);
INSERT INTO copias (precio, idVideojuego) VALUES (1499.00, 4);
INSERT INTO copias (precio, idVideojuego) VALUES (799.00, 5);
INSERT INTO copias (precio, idVideojuego) VALUES (1299.00, 6);
INSERT INTO copias (precio, idVideojuego) VALUES (599.00, 7);
INSERT INTO copias (precio, idVideojuego) VALUES (999.00, 8);
