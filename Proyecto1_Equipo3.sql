CREATE DATABASE tiendaVideojuegos;
USE tiendaVideojuegos;

CREATE TABLE Compradores (
id INT PRIMARY KEY AUTO_INCREMENT,
email VARCHAR(50),
usuario VARCHAR(25) UNIQUE,
nombres VARCHAR(20),
aPaterno VARCHAR(20),
aMaterno VARCHAR(20),
calle VARCHAR(20),
numero INT,
codigoPostal INT,
idCredencial INT,
contrasena VARCHAR(25)
);

CREATE TABLE Compras(
idCompras INT PRIMARY KEY AUTO_INCREMENT,
fechaOrden DATE DEFAULT NULL,
idComprador INT,
FOREIGN KEY (idComprador) REFERENCES Compradores(id)
);

CREATE TABLE Videojuegos(
idJuego INT PRIMARY KEY AUTO_INCREMENT,
estudio VARCHAR(20),
clasificacion VARCHAR(20),
titulo VARCHAR(50),
genero VARCHAR(20)
);

CREATE TABLE Copias(
idCopia INT PRIMARY KEY AUTO_INCREMENT,
precio INT,
idVideojuego INT,
FOREIGN KEY (idVideojuego) REFERENCES Videojuegos(idJuego)
);

CREATE TABLE compraCopias(
idCompraCopias INT PRIMARY KEY AUTO_INCREMENT,
idCompras INT,
idCopia INT,
cantidad INT,
FOREIGN KEY (idCompras) REFERENCES Compras(idCompras),
FOREIGN KEY (idCopia) REFERENCES Copias(idCopia)
);

DROP DATABASE tiendaVideojuegos;