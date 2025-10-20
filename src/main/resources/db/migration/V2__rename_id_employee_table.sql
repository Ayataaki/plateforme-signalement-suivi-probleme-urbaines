ALTER TABLE employees CHANGE COLUMN id ID_EMPLOYEE INT NOT NULL;

--j'ai remplacer l'instruction RENAME COLUMN par l'instruction CHANGE COLUMN car base de données est MySQL 5.5, qui est une version plus ancienne qui nécessite la syntaxe CHANGE COLUMN pour renommer une colonne. 
--on veut ajouter une clé étrangère vers le service municipal mais ce n'est pas possible parce qu'on ne dispose pas de cette table, laissons ça à plus tard
