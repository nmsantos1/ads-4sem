create table funcionario(
	idfuncionario serial not null,
	rmfuncionario integer,
	nomefuncionario varchar(50),
	enderecofuncionario varchar(50),
	telefonefuncionario varchar(15),
	constraint pf_funcionario primary key(idfuncionario)
);