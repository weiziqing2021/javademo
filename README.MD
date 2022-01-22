记录学习JAVA	spring boot 历程 大神请绕过

# 第一个月

## 第一周

###第一天 2022-1-16

    学习Controller 访问方式 和方式注册方式
    
      学习要点区分 注解requestbody pathvariable requestparam 区别和作用
      
         requestbody 截取post body内容
         
         pathvariable 截取地址栏里的
         
         requestparam ?问好传参
         
     Date long LocalDate Calendar 之间互转和作用
     
        date  基础变量
        
        LocalDate 系统时间获取
        
        Calendar 日期单位计算 year month day
        
##第二周

###第一天 2022-1-17 pm

    学习mybaties,新建dao实现DDD
    
###第二天 2022-1-18 pm

    学习构思设计dao层基础代码 ，增加生成器mybaties generation，设计思想里增加行乐观锁，方式数据更新并发
    
###第三天 2022-1-19 pm

    mybatis-generator-maven-plugin插件遇，始终无法连接mysql数据库。
    
    虽然不知道是什么原因处理步骤：
    
        idea 打开database 新建连接连接mysql.会自动加载mysql-connector-java驱动和版本。参照一下copy到pom里。统一版本连接成功。
        
        可怜的一小时已过，明天再战。
###第四天 2022-1-22 am

    MYsql连接问题  ：在MySQL登录时出现Access denied for user 'root'@'localhost' (using password: YES) 拒绝访问
        1、将用户的授权IP的Local   变为“%”
        2、修改用户名密码
     修改的过程中忘记了密码操作：
        windows10系统 mysql8.0.18重置密码（忘记密码或者无法登录）
        （1）打开cmd 窗口，执行net stop mysql命令，停止MySQL服务
        （2）执行 mysqld --console --skip-grant-tables --shared-memory 命令开启跳过密码验证登录
        （3）新打开一个cmd窗口，无密码登录MySQL：mysql -u root -p
        （4）重置密码为空
        use mysql
        update user set authentication_string='' where user='root';
        （5）执行exit退出mysql
        （6）关闭使用mysqld --console --skip-grant-tables --shared-memory 命令的cmd窗口，
        （7）cmd重新启动MySQL服务：net start mysql
        （8）此时可以无密码状态登录MySQL，输入登录命令：mysql -u root -p
        （9）ALTER USER 'root'@'localhost' IDENTIFIED BY '新密码';
        但此时会报错ERROR 1290 (HY000): The MySQL server is running with the --skip-grant-tables option so it cannot execute this statement
        在这里插入图片描述
        （10）执行第9步骤之前先执行flush privileges;刷新权限再修改密码
        （11）退出MySQL后重新输入登录命令mysql -u root -p，使用新密码登录即可
      Mybatis rootClass基类注意事项：
        如果在key class或者record class中有root class相同的属性，MBG就不会重新生成这些属性了，包括：
          1，属性名相同，类型相同，有相同的getter/setter方法；  
