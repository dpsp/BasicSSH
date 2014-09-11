BasicSSH
========

SSH框架，包含了SSH开发所需的全部包，以tmp开头的文件都可以修改，这里只用作测试

Action层是响应请求层，负责接收请求，完成业务调用

Service层是业务实现层，用来实现特定的业务

Dao层是数据持久化层，用来实现数据的增删改查功能

WebContent下的index.jsp文件是访问的主页，可以通过WEB-INF文件夹中的web.xml进行修改

数据库没有提供建表sql，可以根据TmpPojo.hbm.xml手动创建
