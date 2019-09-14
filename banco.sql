create table post (
        id SERIAL PRIMARY KEY,
        titulo varchar(100) NOT NULL,
        subtitulo varchar(150),
        texto varchar (4000) NOT NULL,
        autor varchar (25) NOT NULL,
        fonte varchar (400),
        imagem varchar (250) NOT NULL,
        data_criacao date NOT NULL
        );
        
 create table comentario (
        id SERIAL PRIMARY KEY,
        autor varchar (35) NOT NULL,
        texto varchar (350) NOT NULL,
        data_coment timestamp NOT NULL, 
        post_id int, 
        status varchar (25) NOT NULL,
        FOREIGN KEY (post_id) REFERENCES post (id)
        );       