create table atendimentos (
    id          uuid            primary key,
    usuario     varchar(50)     not null,
    pergunta    varchar(500)    not null,
    resposta    varchar(2000)    not null,
    dataHora    timestamp       default current_timestamp
);