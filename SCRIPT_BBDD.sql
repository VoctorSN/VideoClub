create schema videoclub;
USE videoclub;

drop table peliculas;
CREATE TABLE Peliculas (
    id INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(100) NOT NULL,
    protagonista BIGINT,
    tematica ENUM('Accion', 'Aventura', 'Ciencia_Ficcion', 'Romance', 'Terror'),
    guion TEXT,
    disponible BOOL
);

INSERT INTO Peliculas (titulo, protagonista, tematica, guion, disponible) VALUES
    ('Inception', 12345, 'Ciencia_Ficcion', 'Un ladrón que roba secretos se infiltra en los sueños de sus objetivos.', TRUE),
    ('The Matrix', 67890, 'Ciencia_Ficcion', 'Un programador descubre la verdad sobre su realidad.', TRUE),
    ('Titanic', 13579, 'Romance', 'Una historia de amor en el trágico viaje del Titanic.', TRUE),
    ('Avengers: Endgame', 24680, 'Accion', 'Los Vengadores intentan deshacer la destrucción causada por Thanos.', FALSE),
    ('Indiana Jones y los Cazadores del Arca Perdida', 11223, 'Aventura', 'Un arqueólogo busca artefactos valiosos mientras combate a los nazis.', TRUE),
    ('El Conjuro', 33445, 'Terror', 'Una familia es aterrorizada por una presencia sobrenatural en su casa.', FALSE),
    ('The Notebook', 55667, 'Romance', 'Una pareja revive su historia de amor en sus últimos años.', TRUE),
    ('Mad Max: Fury Road', 77889, 'Accion', 'En un mundo post-apocalíptico, un guerrero lucha por sobrevivir.', TRUE),
    ('Jurassic Park', 99000, 'Aventura', 'Científicos crean un parque temático con dinosaurios vivos, pero todo sale mal.', TRUE),
    ('Alien', 10101, 'Terror', 'La tripulación de una nave espacial se enfrenta a una amenaza alienígena mortal.', FALSE);

