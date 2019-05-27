总结：
    spring将事物管理分成两类：
        * 编程式事物管理：
            *手动编写代码进行事物管理（很少使用）
        * 声明式事物管理：
            * 基于TransactionProxyFactoryBean的方式（很少使用）
                * 需要为每个进行事物管理的类，配置一个TransactionProxyFactoryBean进行增强
            * 基于AspectJ的XML方式（经常使用）
                * 一单配置好之后，类上不需要添加任何东西
            * 基于注解方式（经常使用）
                * 配置简单，需要在业务层上添加@Transactional的注解
