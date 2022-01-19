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
     
