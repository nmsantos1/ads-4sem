create table aluno(
	ra integer,
	nome varchar,
	constraint pk_aluno primary key (ra)
);

create table telefone_aluno(
	codigo integer,
	numero varchar(15),
	ra_aluno integer,
	constraint pk_telefone_aluno primary key (codigo),
	constraint fk_aluno foreign key (ra_aluno)
		references aluno(ra)
);

create table professor(
	codigo integer,
	nome varchar(50),
	telefone varchar(15),
	constraint pk_professor primary key (codigo)
);

create table disciplina(
	codigo integer,
	num_creditos integer,
	descricao varchar(100),
	codigo_professor integer,
	constraint pk_disciplina primary key (codigo),
	constraint fk_professor foreign key (codigo_professor)
		references professor(codigo)
);

create table itens_aluno_disciplina(
	codigo integer,
	ra_aluno integer,
	codigo_disciplina integer,
	constraint pk_itens_aluno_disciplina primary key (codigo),
	constraint fk_aluno foreign key (ra_alunos)
		references aluno(ra),
	constraint fk_disciplina foreign key (codigo_disciplina)
		references disciplina(codigo)
);

/*Inserindo Aluno*/
insert into aluno(ra, nome)
	values(01, 'Natanael');
insert into aluno(ra, nome)
	values(02, 'Eliane');

/*Inserindo telefone_aluno*/
insert into telefone_aluno(codigo, numero, ra_aluno)
	values(01, '(12)34567-8910',01);
insert into telefone_aluno(codigo, numero, ra_aluno)
	values(02, '(01)98765-4321',01);
insert into telefone_aluno(codigo, numero, ra_aluno)
	values(03, '(12)78910-3456',02);
	
/*Inserindo professor*/
insert into professor(codigo, nome, telefone)
	values(01, 'Fabiana', '(32)91234-5678');
insert into professor(codigo, nome, telefone)
	values(02, 'Jeferson', '(32)91234-8756');

/*Inserindo disciplina*/
insert into disciplina(codigo, num_creditos, descricao, codigo_professor)
	values(01, 010, 'Programação WEB', 02);
insert into disciplina(codigo, num_creditos, descricao, codigo_professor)
	values(02, 101, 'Engenharia de Software III', 01);
	
/*Inserindo itens_aluno_disciplina*/
insert into itens_aluno_disciplina(codigo, ra_aluno, codigo_disciplina)
	values(01, 02, 01);
insert into itens_aluno_disciplina(codigo, ra_aluno, codigo_disciplina)
	values(02, 02, 02);
insert into itens_aluno_disciplina(codigo, ra_aluno, codigo_disciplina)
	values(03, 01, 01);








