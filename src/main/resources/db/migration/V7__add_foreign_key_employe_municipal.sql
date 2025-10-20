-- V7__add_foreign_key_employe_municipal.sql

-- 1. Ajouter la colonne de clé étrangère
ALTER TABLE employe ADD COLUMN ID_MUNICIPAL BIGINT;

-- 2. Ajouter la contrainte de clé étrangère
ALTER TABLE employe ADD CONSTRAINT fk_employe_municipal
FOREIGN KEY (ID_MUNICIPAL)
REFERENCES municipal(ID_MUNICIPAL)
ON DELETE CASCADE
ON UPDATE CASCADE;