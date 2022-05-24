ALTER TABLE Pelicula
ADD CONSTRAINT fk_pelicula_director foreign KEY  (director) REFERENCES directores(nombre)


