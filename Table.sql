use anotacao;

create table per_personagem (
    per_id bigint primary key auto_increment,
    per_nome varchar(100) not null,
    per_classe varchar (30) not null,
    per_data_hora_criacao datetime not null,
    per_intelligence int,
    per_strength int,
    per_health int
);

insert into per_personagem (per_nome, per_classe, per_data_hora_criacao, per_intelligence)
    values ('Razor', 'Warrior', current_timestamp(), 3);
insert into per_personagem (per_nome, per_classe, per_data_hora_criacao, per_strength)
    values ('Barbara', 'Priest', current_timestamp(), 2);