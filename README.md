# JavaOverLoad
Java面向对象重载练习

# 课堂练习

1.写一个数学类，类中有以下几个方法：
public int add(int a,int b); //类型不同的重载
public double add(double a,double b);
public String add(String a,int b); //顺序不同的重载
public String add(int a,String b);
public int max(int a,int b,int c);//个数不同的重载
public int max(int a,int b)

2.榨汁机
1)	定义一个苹果类:Apple,内有公有的字段:name,color,weiDao
2)	定义一个构造函数:为三个字段赋初始值
3)	为三个字段分别添加get方法
4)	定义一个榨汁机类:ZhaFruit
5)	为ZhaFruit类添加一个榨水果汁方法:public string GetFruitZhi(Apple a),返回:
”一杯XX(颜色)的XX(水果名)汁,味道XXX”
6)	再定义一个香蕉类：Banana,内有公有的字段:name,color,weiDao
7)	定义一个构造函数:为三个字段赋初始值
8)	为三个字段分别添加get方法
9)为ZhaFurit类添加一个重载方法public string GetFruitZhi(Apple a,Banana b),返回：
”一杯黄绿(颜色)的香蕉苹果(水果名)汁,味道酸酸的甜甜的”
10)为ZhaFurit类添加一个重载方法public string GetFruitZhi(Apple a,int num),返回：
”num杯绿(颜色)的苹果(水果名)汁,味道酸酸的”

3.创建一个狗类:Dog
为Dog添加yao(咬)方法,实现狗咬的功能
如果是yao(),什么都不传，则是“汪汪叫”
如果是yao(String str),则是“咬骨头，好香啊”
如果是yao(Person p),传入的是人类，如果人的性别为男，则“扑上去撕咬”，如果人的性别是女，则“跑过去舔两口”(还需定义Person类，起码有sex属性)

# 家庭作业

练习一、二、三：
	主要知识点：继承
	目标：理解继承机制

练习一：

1.设计一个学生类Student，其数据成员有name(姓名)、age(年龄)和degree(学位)。Show方法显示信息。 构造函数
由Student类派生出本科类与研究生
2.本科生类Undergraduate和研究生类Graduate，本科生类Undergraduate增加成员specialty(专业)，添加方法UndergraduateShow()显示信息，
3.研究生类Graduate增加成员direction(研究方向)。添加GraduateShow()方法，用于输出数据成员信息
4.科生类Undergraduate和研究生类Graduate定义构造函数初始化属性（要求使用super调用父类的构造函数）


练习二。
1.	创建一个武器类Weapen，具有攻击力Power(public ),速度speed(public )字段，并实现构造方法
2.	创建一个Tank类，从Weapen类继承，具有私有的方向字段dir(上下左右),并用属性封装。定义攻击方法TankAttack(),打印“我是坦克，向**方向运动,速度***,攻击力***”
3.	创建一个子弹类Bullen，从Weapen类继承，具有私有的type字段(表示子弹类型,如:机枪子弹，步枪子弹)，用属性封装。定义攻击方法BullenAttack()，打印”我是子弹***，速度***，攻击力***”
4.	为Tank类和Bullen类定义构造函数初始化属性（要求使用super调用父类的构造函数）
5.	创建一只Tank对象，调用其方法；创建一只Bullen，调用其方法



练习三、
使用继承机制实现动物世界
1、	创建控制台应用程序
2、	创建所有动物的基类Animal类，定义姓名（name）,体重（weight）属性，并创建构造函数初始化属性,定义吃（Eat）的方法，输出“真好吃”。
3、	创建狗类（Dog）,青蛙类（Frog）继承至动物类
4、	为Dog添加咬人的方法，输出“惹我罗，咬死你！”；为Frog添加游泳的方法，输出“洗个澡，真凉快！”。
5、	为狗类和青蛙类定义构造函数初始化属性（要求使用super调用父类的构造函数）
6、	创建一只狗对象，调用其方法；创建一只青蛙，调用其方法


练习四、
--- 创建一个动物类:
Animal:字段:name,sex~~访问修饰符均为public 
Amimal:构造函数:无参，带两个参的分别为name和sex赋值
--- 创建一个鸡类Ji继承于Animal
Ji:私有字段:chiBang,用属性封装
Ji:构造函数:带三个参的分别为name和sex和chiBang赋值,name和sex在父类赋值
Ji :JiToString()方法，用来作自我介绍，返回:我是XXX,我是XXX,我有XXX
--- 创建一个狗类Dog继承于Animal
Dog:私有字段:weiBa,用属性封装
Dog:构造函数:带三个参数分别为name,sex,weiBa赋值,name和sex在父类赋值
Dog: DogToString()方法，用来作自我介绍，返回:我是XXX,我是XXX,我有XXX
--- 在测试类Main方法内:
定义二个鸡对象:
花花,母,一对金黄色的翅膀
草草,公,一对银黄色的翅膀
定义二个狗对象:
小白,公,一条金白色的尾巴
小黄,母,一条银白色的尾巴
生成4个对象，分别调用相应的方法。


1.榨汁机
1)	定义一个苹果类:Apple,内有公有的字段:name,color,weiDao
2)	定义一个构造函数:为三个字段赋初始值
3)	为三个字段分别添加get方法
4)	定义一个榨汁机类:ZhaFruit
5)	为ZhaFruit类添加一个榨水果汁方法:public string GetFruitZhi(Apple a),返回:
”一杯XX(颜色)的XX(水果名)汁,味道XXX”
6)	再定义一个香蕉类：Banana,内有公有的字段:name,color,weiDao
7)	定义一个构造函数:为三个字段赋初始值
8)	为三个字段分别添加get方法
9)为ZhaFurit类添加一个重载方法public string GetFruitZhi(Apple a,Banana b),返回：
”一杯黄绿(颜色)的香蕉苹果(水果名)汁,味道酸酸的甜甜的”
10)为ZhaFurit类添加一个重载方法public string GetFruitZhi(Apple a,int num),返回：
”num杯绿(颜色)的苹果(水果名)汁,味道酸酸的”

2.创建一个狗类:Dog
为Dog添加yao(咬)方法,实现狗咬的功能
如果是yao(),什么都不传，则是“汪汪叫”
如果是yao(String str),则是“咬骨头，好香啊”
如果是yao(Person p),传入的是人类，如果人的性别为男，则“扑上去撕咬”，如果人的性别是女，则“跑过去舔两口”(还需定义Person类，起码有sex属性)


3.学生类  属性  名字  性别 年龄
	提供构造方法  给名字 行别 年龄赋值
	提供构造方法  给名字赋值
	提供构造方法  不做任何赋值操作

测试类测试以上个类

