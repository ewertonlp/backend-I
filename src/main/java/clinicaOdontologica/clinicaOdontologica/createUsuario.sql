CREATE TABLE IF NOT EXISTS Usuario (
    idUsuario          INT  AUTO_INCREMENT PRIMARY KEY,
    nome               VARCHAR(100) NOT NULL,
    email              VARCHAR(100) NOT NULL,
    senha              VARCHAR(100) NOT NULL,
    nivelAcesso        VARCHAR(60) NOT NULL
);