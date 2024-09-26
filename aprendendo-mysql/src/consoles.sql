-- Mais estados
INSERT INTO estados
(nome, sigla, regiao, populacao)
VALUES
    ('Bahia', 'BA', 'Nordeste', 15.34),
    ('Ceará', 'CE', 'Nordeste', 9.02),
    ('Distrito Federal', 'DF', 'Centro-Oeste', 3.04),
    ('Espírito Santo', 'ES', 'Sudeste', 4.02),
    ('Goiás', 'GO', 'Centro-Oeste', 6.78),
    ('Maranhao', 'MA', 'Nordeste', 7.00),
    ('Mato Grosso', 'MT', 'Centro-Oeste', 3.34),
    ('Mato Grosso do Sul', 'MS', 'Centro-Oeste', 2.71),
    ('Minas Gerais', 'MG', 'Sudeste', 21.12),
    ('Pará', 'PA', 'Norte', 8.36),
    ('Paraíba', 'PB', 'Nordeste', 4.03),
    ('Parana', 'PR', 'Sul', 11.22),
    ('Pernambuco', 'PE', 'Nordeste', 9.47),
    ('Piauí', 'PI', 'Nordeste', 3.22),
    ('Rio de Janeiro', 'RJ', 'Sudeste', 16.72),
    ('Rio Grande do Norte', 'RN', 'Nordeste', 3.51),
    ('Rio Grande do Sul', 'RS', 'Sul', 11.32),
    ('Rondônia', 'RO', 'Norte', 1.81),
    ('Roraima', 'RR', 'Norte', 0.52),
    ('Santa Catarina', 'SC', 'Sul', 7.01),
    ('São Paulo', 'SP', 'Sudeste', 45.10),
    ('Sergipe', 'SE', 'Nordeste', 2.29),
    ('Tocantins', 'TO', 'Norte', 1.55);

-- Exemplo de Insert 1
INSERT INTO estados (nome, sigla, regiao, populacao)
VALUES ('Acre', 'AC', 'Norte', 0.83);

-- Exemplo de Insert 2
INSERT INTO estados
(nome, sigla, regiao, populacao)
VALUES
    ('Alagoas', 'AL', 'Nordeste', 3.38),
    ('Amapá', 'AP', 'Norte', 0.8),
    ('Amazonas', 'AM', 'Norte', 4.06);

select * from estados;

select nome, estados.sigla from estados
where regiao = 'Sul';

select nome,regiao from estados
where populacao >= 10
order by populacao desc;

select
    estados.nome,
    estados.populacao,
    estados.regiao
from estados
where populacao >= 10
order by populacao desc;

update estados
set nome = 'Maranhão'
where sigla = 'MA';

select nome from estados where sigla = 'MA';

update estados
set nome = 'Paraná',
    populacao = 11.32
where sigla = 'PR';


select nome, sigla, populacao
from estados
where sigla = 'PR';

insert into estados(id,nome,sigla,regiao,populacao)
value (1000, 'Novo', 'NV', 'Sul', 2.54);
select * from estados;

insert into estados(nome,sigla,regiao,populacao)
values ('Mais Novo', 'MN', 'Norte', 2.51);


delete from estados
where sigla = 'MN';

select * from estados;
delete from estados
where id >= 1000;

select
    regiao as 'Região',
    sum(populacao) as Total
from estados
group by regiao;

select
    sum(populacao) as Total
from estados;

CREATE TABLE IF NOT EXISTS cidades
(
    id        INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nome      VARCHAR(255) NOT NULL,
    estado_id int unsigned NOT NULL,
    area      DECIMAL(10, 2),
    PRIMARY KEY (id),
    FOREIGN KEY (estado_id) REFERENCES estados (id)
);

CREATE TABLE IF NOT EXISTS teste
(
    id        INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY
);

DROP TABLE IF EXISTS teste;

select * from estados WHERE  id = 25;
INSERT INTO  cidades(nome,area,estado_id)
VALUES ('Campinas',795,(select id from estados where sigla = 'SP'));

INSERT INTO cidades(nome,area,estado_id)
VALUES ('Niterói', 133.9, (select id from estados where sigla = 'RJ'));

INSERT INTO cidades(nome,area,estado_id)
VALUES ('Juazeiro do norte', 248.2, (select id from estados where sigla = 'CE'));

INSERT INTO cidades(nome,area,estado_id)
VALUES ('Caruaru', 920.6, (select id from estados where sigla = 'PE'));

delete from cidades
where id = 1;

delete from cidades
where id = 2;

select  * from estados e, cidades c
where e.id = c.estado_id;

select  e.nome, c.nome, e.regiao from estados e, cidades c
where e.id = c.estado_id;

select
    c.nome as Cidade,
    e.nome as Estado,
    regiao as Regiao
from estados e
inner join cidades c on e.id = c.estado_id;

CREATE TABLE IF NOT EXISTS prefeitos(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    cidade_id  int UNSIGNED,
    PRIMARY KEY (id),
    UNIQUE KEY (cidade_id),
    FOREIGN KEY (cidade_id) REFERENCES cidades(id)
);

select * from cidades;
INSERT INTO prefeitos
    ( nome, cidade_id)
VALUES
    ('Rodrigo Neves', 4),
    ('Raquel Lyra', 6),
    ('Zenaldo Coutinho', null);


select * from prefeitos;
INSERT INTO prefeitos
    (nome, cidade_id)
VALUES
    ('Rafael Greca', null);

select * from  prefeitos;
select * from cidades;
select * from cidades c inner join prefeitos p on c.id = p.cidade_id;
select * from cidades c left outer join prefeitos p on c.id = p.cidade_id;
select  * from cidades c right join prefeitos p on c.id = p.cidade_id;


select * from cidades c left outer join prefeitos p on c.id = p.cidade_id
union
select  * from cidades c right join prefeitos p on c.id = p.cidade_id;


CREATE TABLE IF NOT EXISTS empresas (
    id INT UNSIGNED NOT NULL  AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    cnpj int UNSIGNED,
    PRIMARY KEY  (id),
    UNIQUE KEY (cnpj)
);

CREATE TABLE IF NOT EXISTS empresas_unidades(
    empresa_id INT UNSIGNED NOT NULL,
    cidade_id INT UNSIGNED NOT NULL,
    sede TINYINT(1) NOT NULL,
    PRIMARY KEY (empresa_id,cidade_id)
);

INSERT INTO empresas
    (nome,cnpj)
VALUES
    ('Bradesco', 0000000000001),
    ('Vale', 0000000000002),
    ('Cielo', 0000000000003);

alter table empresas modify cnpj varchar(14);

desc empresas;
desc prefeitos;

select  * from cidades;
select * from empresas;
INSERT INTO empresas_unidades
    (empresa_id, cidade_id, sede)
values
    (1,1,1),
    (1,2,0),
    (2,1,0),
    (2,2,1);

select  e.nome Empresa, c.nome Cidade
from empresas e, empresas_unidades eu, cidades c
where e.id = eu.cidade_id
and c.id = eu.cidade_id
and sede;



