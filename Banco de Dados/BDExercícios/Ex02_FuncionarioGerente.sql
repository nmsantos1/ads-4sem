create table funcionario(
	codigo_funcionario integer,
	nome varchar(50),
	cpf varchar(14),
	endereco varchar(50),
	codigo_gerente integer,
	constraint pk_funcionario primary key (codigo_funcionario),
	constraint fk_funcionario_gerente foreign key (codigo_gerente)
		references funcionario(codigo_funcionario)
);

insert into funcionario(codigo_funcionario, nome, cpf, endereco, codigo_gerente)
	values(1, 'Pedro', '562.555.444-69', 'Rua 01, Jales - SP', 1);
insert into funcionario(codigo_funcionario, nome, cpf, endereco, codigo_gerente)
	values(2, 'Pâmela', '573.666.555-70', 'Rua 02, Jales - SP', 1);