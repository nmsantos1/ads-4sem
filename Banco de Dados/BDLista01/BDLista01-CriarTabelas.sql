create table cliente( 
    codigo_cliente integer not null,
    nome_cliente 		varchar(40),
    endereco		varchar(50),
    cidade		varchar(30),
    cep			char(10),
    uf			char(2),
    cgc			char(16),
    ie 			char(20),
    constraint pk_codigo_cliente primary key (codigo_cliente)
);

create table vendedor(
    codigo_vendedor integer not null,
    nome_vendedor varchar(40),
    salario_fixo numeric(10,2),
    faixa_comissao char(1),
    constraint pk_codigo_vendedor primary key(codigo_vendedor)
);

create table pedido(
    num_pedido integer not null,
    prazo_entrega smallint not null,
    codigo_cliente integer not null,
    codigo_vendedor integer not null,
    constraint pk_num_pedido primary key (num_pedido),
    constraint fk_num_pedio foreign key (codigo_cliente) references cliente,
    constraint fk_codigo_vendedor foreign key (codigo_vendedor) 
        references vendedor
);

create table produto(
    codigo_produto integer not null,
    unidade	char(3),
    descricao_produto	varchar(30),
    val_unit		numeric(10,2),
    constraint pk_produto primary key (codigo_produto)
);

create table item_do_pedido(
    num_pedido integer not null,
    codigo_produto integer not null,
    quantidade numeric(10,2),
    constraint pk_item_pedido primary key (num_pedido,codigo_produto),
    constraint fk_num_pedido foreign key (num_pedido) references pedido,
    constraint fk_codigo_produto foreign key (codigo_produto) references produto
);