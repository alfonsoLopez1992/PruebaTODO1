--Creacion dde usuarios
insert into usuarios(id, nombre, apellido, email, password, create_at ) values(1, 'Alfonso', 'Lopez', 'viclopalfguz@gmail.com', '1234', '2021-02-15');
insert into usuarios(id, nombre, apellido, email, password, create_at ) values(2, 'Ioshi', 'Lopez', 'viclopalfguz13@gmail.com', '1234', '2021-02-15');

--Creacion de productos
insert into productos(id, nombre, nombre_corto, descripcion, cantidad, costo, imagen, create_at ) values(1, 'Camiseta de spiderman', 'Camiseta spiderman', 'Camiseta de spiderman en todos los colores', 20, 22.00, '/1.jpg',  '2021-02-15');
insert into productos(id, nombre, nombre_corto, descripcion, cantidad, costo, imagen, create_at ) values(2, 'Pantalón de spiderman', 'Pantalón spiderman', 'Pantalón de spiderman en todos los colores', 10, 35.00, '/2.jpg',  '2021-02-15');
insert into productos(id, nombre, nombre_corto, descripcion, cantidad, costo, imagen, create_at ) values(3, 'Abrigo de spiderman', 'Abrigo spiderman', 'Abrigo de spiderman en todos los colores', 15, 75.00, '/3.jpg',  '2021-02-15');
insert into productos(id, nombre, nombre_corto, descripcion, cantidad, costo, imagen, create_at ) values(4, 'Bermuda de spiderman', 'Bermuda spiderman', 'Bermuda de spiderman en todos los colores', 15, 35.00, '/4.jpg',  '2021-02-15');
