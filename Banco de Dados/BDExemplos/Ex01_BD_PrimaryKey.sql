create table musico(
	cod integer primary key,
	nome varchar(100),
	idade integer
);




create table instrumento(
	cod integer,
	nome varchar(100),
	tipo varchar(100),
	cod_musico integer,
	constraint pk_instumento primary key (cod),
	constraint fk_musico foreign key (cod_musico)
		references musico(cod)
);
