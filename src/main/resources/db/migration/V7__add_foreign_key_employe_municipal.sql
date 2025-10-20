ALTER TABLE employe
MODIFY COLUMN id_municipal BIGINT;

ALTER TABLE employe
ADD CONSTRAINT fk_employe_municipal
FOREIGN KEY (id_municipal)
REFERENCES municipal(id_municipal)
ON DELETE CASCADE
ON UPDATE CASCADE;
