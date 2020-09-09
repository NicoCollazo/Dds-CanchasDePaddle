
    create table canchas (
        id_cancha bigint not null auto_increment,
        esta_iluminada bit,
        nombre varchar(255),
        cod_color_cod_color bigint,
        primary key (id_cancha)
    )

    create table colores (
        cod_color bigint not null auto_increment,
        descripcion varchar(255),
        primary key (cod_color)
    )

    create table constructores (
        cod_constructor bigint not null auto_increment,
        domicilio varchar(255),
        nombre varchar(255),
        primary key (cod_constructor)
    )

    create table jugadores (
        id_jugador bigint not null auto_increment,
        apellido varchar(255),
        domicilio varchar(255),
        nacimiento varchar(255),
        nombre varchar(255),
        id_paleta_cod_paleta bigint,
        primary key (id_jugador)
    )

    create table paletas (
        cod_paleta bigint not null auto_increment,
        grosor integer,
        nombre varchar(255),
        cod_color_cod_color bigint,
        cod_constructor_cod_constructor bigint,
        primary key (cod_paleta)
    )

    create table participacion (
        id_partido_id_partido bigint not null,
        id_jugador_id_jugador bigint not null,
        id_paleta_cod_paleta bigint,
        primary key (id_partido_id_partido, id_jugador_id_jugador)
    )

    create table partidos (
        id_partido bigint not null auto_increment,
        cod_color_cancha_cod_color bigint,
        id_reserva_id_reserva bigint,
        primary key (id_partido)
    )

    create table reservas (
        id_reserva bigint not null auto_increment,
        fin_partido tinyblob,
        inicio_partido tinyblob,
        id_cancha_id_cancha bigint,
        responsable_id_jugador bigint,
        primary key (id_reserva)
    )

    alter table canchas 
        add constraint FK_dwk74ngrdqpklvbls9auoc26c 
        foreign key (cod_color_cod_color) 
        references colores (cod_color)

    alter table jugadores 
        add constraint FK_1egf8vti2clxxcsln6w75yny7 
        foreign key (id_paleta_cod_paleta) 
        references paletas (cod_paleta)

    alter table paletas 
        add constraint FK_onktrpwwejby1j7e51vgb2h6y 
        foreign key (cod_color_cod_color) 
        references colores (cod_color)

    alter table paletas 
        add constraint FK_b71x70vmxa2yt6mrm48w1y4gr 
        foreign key (cod_constructor_cod_constructor) 
        references constructores (cod_constructor)

    alter table participacion 
        add constraint FK_8s61ap9by8a3pkfyia5nihxdk 
        foreign key (id_partido_id_partido) 
        references partidos (id_partido)

    alter table participacion 
        add constraint FK_5839jajljmdhse1kt4td5o5l6 
        foreign key (id_jugador_id_jugador) 
        references jugadores (id_jugador)

    alter table participacion 
        add constraint FK_3nuaxsj6ko3h5d0plsa8oayri 
        foreign key (id_paleta_cod_paleta) 
        references paletas (cod_paleta)

    alter table partidos 
        add constraint FK_ido5oqbk9g569us37hkw70r05 
        foreign key (cod_color_cancha_cod_color) 
        references colores (cod_color)

    alter table partidos 
        add constraint FK_blyrxwr9lvyceu5yum9y370bi 
        foreign key (id_reserva_id_reserva) 
        references reservas (id_reserva)

    alter table reservas 
        add constraint FK_ryi8hbhwqi2l3tlppjudy0g2n 
        foreign key (id_cancha_id_cancha) 
        references canchas (id_cancha)

    alter table reservas 
        add constraint FK_blwq2xucjti1ebdvgjpsym1w0 
        foreign key (responsable_id_jugador) 
        references jugadores (id_jugador)
