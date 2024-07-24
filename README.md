设计模式学习笔记

1.策略模式(strategy patterns)

现在项目开发中，发送消息的方式有很多类型，比如：邮件、短息、站内消息、公众号消息等等。具体代码com.pd.strategy包里面

主要的类有：

ISendMessageStrategy(策略接口)：接口提供发送短息方法

EmailService(邮件发送服务类)：邮件发送接口类需要实现策略接口的发送信息的方法，提供具体发送短信的业务逻辑

SMSService(短信发送服务类)：同实现策略接口发送信息方法，需要提供具体的发送业务逻辑

WebMessageService(站内信信息发送服务类)：同实现策略接口发送信息方法，需要提供具体的发送业务逻辑

WechatMessageService(微信公众号发送服务类)：同实现策略接口发送信息方法，需要提供具体的发送业务逻辑

Context(策略匹配类)：根据对应的服务匹配对应策略

策略模式的特性：高内聚低耦合的特点，还有一个就是扩展性，也就是OCP原则，策略类可以继续增加下去，只要修改Context.java就可以了。

2.代理模式(proxy patterns)
本模型选择的例子是房子、中介和顾客的关系。房主想要卖放一般不直接跟买家沟通。都是通过委托给中介，通过中介代理房子对外进行售卖。
这个时候，买家想要看房和买房都是通过中介。具体代码com.pd.proxy包里面

主要类：

Agent(代理接口类)：该接口是代理接口，卖家授权代理只有带看和交易的方法。

House(房子类)：房子类实现代理接口，提供具体的房屋信息给客户，并且是交易的主体。

LianJia(链家)：声明自己是中介，并且可以带客户看房子，并且能够交易房子。

WoAiWoJia(我爱我家)：声明自己是中介，并且可以带客户看房子，并且能够交易房子。
