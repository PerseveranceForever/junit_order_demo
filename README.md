 * 我们在写JUnit测试用例时，有时候需要按照定义顺序执行我们的单元测试方法.
 * 比如如在测试数据库相关的用例时候要按照测试插入、查询、删除的顺序测试。
 * 如果不按照这个顺序测试可能会出现问题，比如删除方法在前面执行，后面的方法就都不能通过测试.
 * 因为数据已经被清空了。而JUnit测试默认的顺序是随机的。所以这时就需要有办法要求JUnit在执行测试方法时按照我们指定的顺序来执行。
 * 按照设计原则,JUnit是不指定测试方法调用执行顺序的。
 * 目前为止,这些方法只是简单地按照反射(reflection) API返回的顺序执行。
 * 但是,使用JVM默认提供的排序是很不明智的,因为Java平台没有指定任何有规律的顺序,
 * 而事实上JDK 7可能会返回一个随机的顺序。
 * 当然,精心编写的测试代码之间并不需要假定任何执行顺序,但有时候,但在某些平台上一个可预测的失败总比随机的失败要好。
 * 本例通过Junit的@FixMethodOrder注解来设定单元测试中方法的执行顺序
 * 可以看到，DefaultOrderTest 和 NotSettingOrderTest 执行结果是一样的
 * JVMOrderTest每次返回不同的结果
 * NameAscOrderTest返回的是按照方法名称的字典序执行的结果