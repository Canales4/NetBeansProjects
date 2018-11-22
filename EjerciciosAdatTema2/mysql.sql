/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  Canales-PC
 * Created: 06-nov-2018
 */
create procedure actividad12 (d int, out media Float, out num int)
begin
declare c int;
set media=0;
set num=0;
select count(*) into c from departamentos where dept_no=d;
if c=0 then media=-1;
else select coalesce (avg(salario),0), count(emp_no) into media, num from empleados where dept_no=d;
end if;
end;