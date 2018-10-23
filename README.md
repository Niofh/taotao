## web.xml文件
 1. DispatcherServlet 子容器 主要存放Controller（taotao-manager-web）
 2. ContextLoaderListener 父容器 主要存放DAO ,Service (taotao-manager)
  
 > 子容器能访问父容器的类，父容器不能访问子容器的类
 
 
## 系统间通信

1. http+json (restful形式) 适合小的系统，与其他客户端（node.js,c#...）的系统调用。

2. dubbo形式 适合java内部之间的系统通信（比较推荐使用）,不能使用其他语言


## 项目技巧

1. keyProperty="id" useGeneratedKeys="true" 要加入到insert里面，使得添加后的数据默认赋值到实体类中