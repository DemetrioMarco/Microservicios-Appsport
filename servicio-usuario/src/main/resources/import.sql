INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('marco','$2a$10$/RUj08Bk/93eWqIwAbNDWuGPCfRkw.cN03FjCH49zSWjBU62pRGfC', 1,'Marco', 'Demetrio','marco.demetrio@gmail.com');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$DXF498xb0Dw4VoQecsN50egqx3Va6.iVpURFafXBbMZ6nWIZ7WU7i', 1, 'Matias', 'Demetrio','admin@gmail.com');

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (1,1);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2,2);
INSERT INTO `usuarios_roles` (usuario_id, role_id) VALUES (2,1);