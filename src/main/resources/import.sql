insert into usuarios(id_usuario, nombre, usuario, contrasena) values (sys_guid(),'Roy','roy','spring');
insert into user(id_usuario, nombre, usuario, contrasena) values (sys_guid(),'Craig','craig','spring');
insert into user(id_usuario, nombre, usuario, contrasena) values (sys_guid(),'Greg','greg','spring');
insert into user(id_usuario, nombre, usuario, contrasena) values (sys_guid(),'Paco','paco','spring');
 
insert into role(id_rol, nombre) values (1,'ROLE_USER');
insert into role(id_rol, nombre) values (2,'ROLE_ADMIN');
insert into role(id_rol, nombre) values (3,'ROLE_GUEST'); 

insert into usuario_role(id_usuario, id_rol) values (1,1);
insert into usuario_role(id_usuario, id_rol) values (1,2);
insert into usuario_role(id_usuario, id_rol) values (2,1);
insert into usuario_role(id_usuario, id_rol) values (3,1);
insert into usuario_role(id_usuario, id_rol) values (4,2);
