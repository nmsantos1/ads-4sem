create table marca(
    codigo integer primary key,
    descricao varchar(50)
);

insert into marca(codigo, descricao)
    values(01, 'Fiat');
insert into marca(codigo, descricao)
    values(02, 'Chevrolet');

create table modelo(
    codigo integer primary key,
    descricao varchar(50),
    codMarca integer,
    constraint fk_marca foreign key(codMarca)
        references marca(codigo)
);

insert into modelo(codigo, descricao, codMarca)
    values(01, 'Corsa', 02);
insert into modelo(codigo, descricao, codMarca)
    values(02, 'Uno', 01);

create table automovel(
    codigo integer primary key,
    numPlaca varchar(8),
    cor varchar(10),
    ano integer,
    tipoCombu varchar(15),
    numPorta integer,
    km numeric,
    renavam varchar(11),
    chassi varchar (25),
    valLocacaoDia numeric,
    codModelo integer,
    constraint fk_modelo foreign key(codModelo)
        references modelo(codigo)
);

insert into automovel(codigo, numPlaca, cor, ano, tipoCombu, numPorta, km, renavam, chassi, valLocacaoDia, codModelo)
    values(01, '65695rdg', 'Prateado', 2019, 'Gasolina', 4, 1500, '12345678910', '564456646465sdf', 150.00, 01);
insert into automovel(codigo, numPlaca, cor, ano, tipoCombu, numPorta, km, renavam, chassi, valLocacaoDia, codModelo)
    values(02, '6556e5rg', 'Vermelho', 2018, 'Etanol', 2, 5000, '98765678910', '56445565445asd5', 100.00, 02);

create table cliente(
    codigo integer primary key,
    nome varchar(50),
    rg varchar(15),
    cpf varchar(15)
);

insert into cliente(codigo, nome, rg, cpf)
    values(01, 'Rafael', '46665654564', '451551513135');
insert into cliente(codigo, nome, rg, cpf)
    values(02, 'Leonardo', '56465456464', '456554665472');

create table automovel_cliente(
    codigo integer primary key,
    dataInicio varchar(10),
    dataDevolucao varchar(10),
    valTotalLocacao numeric,
    codAuto integer,
    codCliente integer,
    constraint fk_automovel foreign key(codAuto)
        references automovel(codigo),
    constraint fk_cliente foreign key(codCliente)
        references cliente(codigo)
);

insert into automovel_cliente(codigo, dataInicio, dataDevolucao, valTotalLocacao, codAuto, codCliente)
    values(01, '06/04/2023', '09/04/2023', 400.00, 02, 01);
insert into automovel_cliente(codigo, dataInicio, dataDevolucao, valTotalLocacao, codAuto, codCliente)
    values(02, '01/05/2023', '10/05/2023', 1500.00, 01, 02);


select * from automovel;

select tipoCombu, cor from automovel;

select * from cliente where nome = 'Rafael';

select * from automovel where cor = 'Prateado' and tipoCombu = 'Gasolina';
select * from automovel where cor = 'Prateado' or tipoCombu = 'Etanol';





















