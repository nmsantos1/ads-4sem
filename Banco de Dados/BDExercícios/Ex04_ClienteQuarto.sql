create table cliente (
	codigo integer,
	rg varchar(12),
	nome varchar(50),
	endereco varchar(100),
	telefone varchar(15),
	quartoHospedado integer,
	dataHospedagem varchar(10),
	consumoHospedagem varchar(100),
	constraint pk_cliente primary key(codigo),
	constraint fk_quarto foreign key(quartoHospedado)
		references quarto(numero)
);

insert into cliente(codigo, rg, nome, endereco, telefone, quartoHospedado, dataHospedagem,consumoHospedagem)
	values(01, '12.345.678-9', 'Alessandro', 'Rua 3 patinhos, 1234', '12 93456-7890', 101, '27/03/2022', 'Coca-Cola zero');
insert into cliente(codigo, rg, nome, endereco, telefone, quartoHospedado, dataHospedagem,consumoHospedagem)
	values(02, '98.765.432-1', 'Sabrina', 'Rua 6 patinhos, 4321', '09 98765-4321', 202, '26/03/2023', 'Agua com Gás');
select * from cliente;


create table quarto(
	numero integer,
	andar integer,
	qtdLeito integer,
	constraint pk_quarto primary key(numero)
);

insert into quarto(numero, andar, qtdLeito)
	values(101, 05, 02);
insert into quarto(numero, andar, qtdLeito)
	values(202, 10, 01);
select * from quarto;