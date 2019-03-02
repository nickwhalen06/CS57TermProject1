DROP TABLE IF EXISTS asset;

CREATE TABLE asset (
  asset_id        TEXT PRIMARY KEY NOT NULL,
  organization_id   TEXT NOT NULL,
  asset_type      TEXT NOT NULL,
  asset_name      TEXT NOT NULL,
  comment         TEXT NOT NULL);


INSERT INTO asset (asset_id,  organization_id, asset_type, asset_name, comment)
VALUES ('f3831f8c-c338-4ebe-a82a-e2fc1d1ff78a', '4fa02cfe-d624-4114-b752-8c564d7194fa', 'computers','operating', 'valuable asset');
INSERT INTO asset (asset_id,  organization_id, asset_type, asset_name, comment)
VALUES ('t9876f8c-c338-4abc-zf6a-ttt1', '4fa02cfe-d624-4114-b752-8c564d7194fa', 'furniture','tangible', 'replace partially');