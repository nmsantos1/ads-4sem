create table funcionario(
    codigo INTEGER PRIMARY KEY,
    nome varchar(50),
    especializacao VARCHAR(50)
);

INSERT INTO funcionario(codigo, nome, especializacao)
    VALUES(01, 'Victor', 'Engenheiro'),
INSERT INTO funcionario(codigo, nome, especializacao)
    VALUES(02, 'Pedro', 'Carpinteiro'),

create table projeto(
    codigo INTEGER PRIMARY KEY,
    descricao varchar(50)
);

INSERT INTO projeto(codigo, descricao)
    VALUES(01, 'Projeto 01');
INSERT INTO projeto(codigo, descricao)
    VALUES(02, 'Projeto 02');

CREATE TABLE maquinas(
    codigo INTEGER PRIMARY KEY,
    tipo VARCHAR(50),
    marca VARCHAR(50)
);

INSERT INTO maquinas(codigo, tipo, marca)
    VALUES(01, 'Martelo', '');
INSERT INTO maquinas(codigo, tipo, marca)
    VALUES(01, 'Escavadeira', 'Ford');

CREATE TABLE func_proj_maq( 
    codigo INTEGER PRIMARY KEY,
    codigo_funcionario INTEGER NOT NULL,
    codigo_projeto INTEGER NOT NULL,
    codigo_maquinas INTEGER,
    horas NUMERIC,
    CONSTRAINT fk_func FOREIGN KEY (codigo_funcionario)
        REFERENCES funcionario(codigo),
    CONSTRAINT fk_proj FOREIGN KEY (codigo_projeto)
        REFERENCES projeto(codigo),
    CONSTRAINT fk_maq FOREIGN KEY (codigo_maquinas)
        REFERENCES maquinas(codigo)
);

INSERT INTO func_proj_maq(codigo, codigo_funcionario, codigo_projeto, codigo_maquinas, horas)
    VALUES(1, 2, 1, null, 5);
INSERT INTO func_proj_maq(codigo, codigo_funcionario, codigo_projeto, codigo_maquinas, horas)
    VALUES(1, 2, 1, null, 4);