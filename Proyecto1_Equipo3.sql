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
numero VARCHAR(20) NOT NULL,
codigoPostal varchar(20) NOT NULL,
contrasena VARCHAR(200) NOT NULL
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
precio INT NOT NULL,
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