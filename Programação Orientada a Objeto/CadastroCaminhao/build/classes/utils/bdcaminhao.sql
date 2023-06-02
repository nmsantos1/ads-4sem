create table caminhao(
	idcaminhao serial not null,
	marcacaminhao varchar(50),
	modelocaminhao varchar(50),
	numeixocaminhao integer,
	cargamaxtoncaminhao numeric,
	constraint pk_caminhao primary key(idcaminhao)
);