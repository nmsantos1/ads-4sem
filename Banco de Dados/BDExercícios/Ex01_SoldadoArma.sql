create table soldado(
	rm integer,
	nome varchar(50),
	data_nasc varchar(10),
	constraint pk_soldado primary key (rm)
);

insert into soldado(rm, nome, data_nasc) 
	values(123, 'Bryan', '20/03/2001');
insert into soldado(rm, nome, data_nasc) 
	values(124, 'Breno', '21/04/2000');
insert into soldado(rm, nome, data_nasc) 
	values(125, 'Bruno', '22/07/2003');

create table arma(
	serie integer,
	registro integer,
	calibre integer,
	rm_soldado_dono integer,
	constraint pk_arma primary key (serie),
	constraint fk_soldado_dono foreign key (rm_soldado_dono)
		references soldado(rm)
);

insert into arma(serie, registro, calibre, rm_soldado_dono) 
	values(001, 100, 38, 123);
insert into arma(serie, registro, calibre, rm_soldado_dono) 
	values(002, 200, 45, 124);

create table itens_soldado_arma_limpa(
	codigo integer,
	rm_soldado integer,
	serie_arma integer,
	constraint pk_itens_soldado_arma_limpa primary key (codigo),
	constraint fk_soldado foreign key (rm_soldado)
		references soldado(rm),
	constraint fk_arma foreign key (serie_arma)
		references arma(serie)
);

insert into itens_soldado_arma_limpa(codigo, rm_soldado, serie_arma)
	values(001, 125, 001);
insert into itens_soldado_arma_limpa(codigo, rm_soldado, serie_arma)
	values(002, 125, 002);

select * from itens_soldado_arma_limpa;


