CREATE DATABASE akademik;
USE akademik;
CREATE TABLE mahasiswa(
Nim Varchar(15) NOT NULL,
Nama Varchar(150) NOT NULL,
Alamat Varchar(150),
Progdi Varchar(10);
show tables;
DESCRIBE mahasiswa;
INSERT INTO mahasiswa VALUES 
('1501530032','Hendrik Nuryanto','Manyaran','Teknik Informatika');
SELECT *FROM mahasiswa;