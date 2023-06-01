create table aluno(
	ra integer,
	nome varchar(50),
	constraint pk_aluno primary key(ra)
);

insert into aluno(ra, nome)values(1, 'João');
insert into aluno(ra, nome)values(2, 'Maria');

create table disciplina(
	codigo integer,
	descricao varchar(50),
	constraint pk_disciplina primary key(codigo)
);

insert into disciplina(codigo, descricao)values(1, 'Banco de Dados');
insert into disciplina(codigo, descricao)values(2, 'Lógica de Programação');

create table itens_aluno_disciplina(
	codigo integer,
	ra_aluno integer,
	cod_disci integer,
	nota numeric,
	constraint pk_itens_aluno_disciplina primary key(codigo),
	constraint fk_aluno foreign key (ra_aluno)
		references aluno(ra),
	constraint fk_disci foreign key (cod_disci)
		references disciplina (codigo)
);

insert into itens_aluno_disciplina(codigo, ra_aluno, cod_disci, nota)
	values(1, 1, 1, 8.25);
insert into itens_aluno_disciplina(codigo, ra_aluno, cod_disci, nota)
	values(2, 1, 1, 9.00);

select * from itens_aluno_disciplina;