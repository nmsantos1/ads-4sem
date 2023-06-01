create table pessoa(
	codigo integer primary key,
	nome varchar(50),
	idade integer,
	email varchar(50),
	salario numeric
);

insert into pessoa(codigo, nome, idade, email, salario)
	values(01, 'Natanael', 19, 'natanael.santos2@fatec.sp.gov.br', 1500.5);
	
insert into pessoa(codigo, nome, idade, email, salario)
	values(02, 'Eliane', 35, 'eliane.sevegnago@fatec.sp.gov.br', 1900.0);

insert into pessoa(codigo, nome, idade, email, salario)
	values(03, 'Matheus', 21, 'matheus.ferreira@fatec.sp.gov.br', 2100.5);

/*Todos os Dados*/
select * from pessoa;

/*media de salario*/
select avg(salario) from pessoa;

/*menor valor de salario*/
select min(salario) from pessoa;

/*maior valor de salario ("as Maior_Salario" nomeia a coluna na exibição)*/
select max(salario) as Maior_Salario from pessoa;

/**/
select nome, salario 
	from pessoa 
	where salario < 2200.5 and salario > 1000.5 
	order by salario desc;
	
select nome from pessoa where salario = (select max(salario) from pessoa);

/*encontrar dados entre dois valores (englobando os dois valores)*/
select * from pessoa where salario between 1501 and 3000;


select * from pessoa where nome like 'Eliane';


select * from pessoa where nome = 'Matheus';

/*os select retornam dados do Natanael (%)*/
select * from pessoa where nome like 'N%';
select * from pessoa where nome like '%l';
select * from pessoa where nome like '%ta%';
select * from pessoa where nome like 'Na____e%';

/*seleciona os que possuem o que esta dentro dede "in"*/
select * from pessoa where idade in(35, 19); /* o mesmo que  "select * from pessoa where idade = 35 or idade = 19;"*/
/*Exclui os que possuem o que esta dentro de "not in"*/
select * from pessoa where idade not in(21);