create table caminhao(
	codigo integer,
	marca varchar(50),
	modelo varchar(50),
	ano integer,
	capacidade numeric,
	constraint pk_caminhao primary key(codigo)
);

insert into caminhao(codigo, marca, modelo, ano, capacidade)
	values(101, 'Volkswagen', 'D0834LF08', 2021, 14500), 
		  (201, 'Mercedes-Benz', 'Actros EURO6', 2022, 14040);

create table motorista(
	rg varchar(12),
	nome varchar(50),
	idade integer,
	endereco varchar(100),
	constraint pk_motorista primary key(rg)
);

insert into motorista(rg, nome, idade, endereco)
	values('12.345.678-9', 'Alessandro', 30, 'Rua 3 patinhos, 1234'), 
		  ('98.765.432-1', 'Sabrina', 35, 'Rua 6 patinhos, 4321');


create table produto(
	codigo integer,
	nome varchar(100),
	fabricante varchar(50),
	constraint pk_produto primary key(codigo)
);

insert into produto(codigo, nome, fabricante)
	values(100, 'Galaxy Book2 360', 'Samsung'), 
		  (200, 'Notebook Inspiron 15 3000', 'Dell');

create table caminhao_motorista(
	codigo integer,
	data_viagem date,
	cod_caminhao integer,
	rg_motorista varchar(12) references motorista(rg), /*Chave Estrangeira*/
	constraint pk_caminhao_motorista primary key(codigo),
	constraint fk_caminhao foreign key(cod_caminhao)
		references caminhao(codigo)
);

insert into caminhao_motorista(codigo, data_viagem, cod_caminhao, rg_motorista)
	values(111, '2023/02/05', 201, '98.765.432-1'),
		  (222, '2023/03/20', 101, '12.345.678-9');


create table produto_caminhao(
	codigo integer,
	data_transporte date,
	cod_produto integer,
	cod_caminhao integer references caminhao(codigo), /*Chave Estrangeira*/
	constraint pk_produto_caminhao primary key(codigo),
	constraint fk_produto foreign key(cod_produto)
		references produto(codigo)
);

insert into produto_caminhao(codigo, data_transporte, cod_produto, cod_caminhao)
	values(500, '2023/02/05', 100, 201),
		  (550, '2023/03/20', 200, 101);
		  
select * from produto_caminhao;