CREATE TABLE medico(
    codigo INTEGER PRIMARY KEY,
    nome VARCHAR(50),
    crm VARCHAR(15)
);
INSERT INTO medico(codigo, nome, crm)
    VALUES(01, 'Eliane', 'SP - 234567');
INSERT INTO medico(codigo, nome, crm)
    VALUES(02, 'Jake', 'SP - 123456');
/*================================================*/
CREATE TABLE paciente(
    codigo INTEGER PRIMARY KEY,
    nome VARCHAR(50),
    cpf VARCHAR(15),
    sexo VARCHAR(1)
);

INSERT INTO paciente(codigo, nome, cpf, sexo)
    VALUES(01, 'Natanael', '123789456-56', 'M');
INSERT INTO paciente(codigo, nome, cpf, sexo)
    VALUES(02, 'Matheus', '987456123-45', 'M');
/*================================================*/
CREATE TABLE receita(
    codigo INTEGER PRIMARY KEY,
    descricao VARCHAR(100)
);

INSERT INTO receita(codigo, descricao)
    VALUES(01, 'Descrição da receita.');
INSERT INTO receita(codigo, descricao)
    VALUES(02, 'Descrição da receita.');
/*================================================*/
CREATE TABLE remedio(
    codigo INTEGER,
    nome VARCHAR(20),
    CONSTRAINT pk_remedio PRIMARY KEY (codigo)
);

INSERT INTO remedio(codigo, nome)
    VALUES(01, 'Remedio 01');
INSERT INTO remedio(codigo, nome)
    VALUES(02, 'Remedio 02');
/*================================================*/
CREATE TABLE remedio_receita(
    codigo INTEGER PRIMARY KEY,
    cod_receita INTEGER,
    cod_remedio INTEGER,
    CONSTRAINT fk_receita FOREIGN KEY (cod_receita)
        REFERENCES receita(codigo),
    CONSTRAINT fk_remedio FOREIGN KEY (cod_remedio)
        REFERENCES remedio(codigo)
);

INSERT INTO remedio_receita(codigo, cod_receita, cod_remedio)
    VALUES(01, 02, 01);
INSERT INTO remedio_receita(codigo, cod_receita, cod_remedio)
    VALUES(02, 01, 02);
/*================================================*/
CREATE TABLE med_pac_rec(
    codigo INTEGER PRIMARY KEY,
    cod_medico INTEGER NOT NULL REFERENCES medico(codigo),
    cod_paciente INTEGER NOT NULL REFERENCES paciente(codigo),
    cod_receita INTEGER NOT NULL REFERENCES receita(codigo)
);

INSERT INTO med_pac_rec(codigo, cod_medico, cod_paciente, cod_receita)
    VALUES(01, 02, 01, 02);
INSERT INTO med_pac_rec(codigo, cod_medico, cod_paciente, cod_receita)
    VALUES(02, 01, 02, 01);