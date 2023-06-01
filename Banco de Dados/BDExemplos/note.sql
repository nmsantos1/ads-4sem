create table cidade(
	codigo integer primary key,
	nome varchar(20)
);


insert into cidade(codigo, nome)
	values(01, 'Jales'),
		  (02, 'Urania');
insert into cidade(codigo, nome) values(03, 'Uberlandia');
		  
insert into cidade(codigo,estado) values(05,'SP');

select * from cidade;
select * from cidade order by codigo desc; /*desc - decrescente, sem nada é crescente*/

alter table cidade add column estado varchar(2);


update cidade set estado = 'SP';
update cidade set estado = 'MG' where codigo = 03;
update cidade set codigo = 04, nome = 'Volta Redonda', estado = 'RJ' where codigo = 05;