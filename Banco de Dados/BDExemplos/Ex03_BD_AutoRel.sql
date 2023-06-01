create table aluno(
	ra integer,
	nome varchar(50),
	ra_monitor integer,
	constraint pk_aluno primary key (ra),
	constraint fk_monitor foreign key (ra_monitor)
		references aluno(ra)
);

insert into aluno(ra, nome, ra_monitor) values(1, 'Lucas', 1);
insert into aluno(ra, nome, ra_monitor) values(2, 'Luana', 1);
insert into aluno(ra, nome, ra_monitor) values(3, 'Luara', 1);