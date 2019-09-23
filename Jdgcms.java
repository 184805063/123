class Operation
{
public:
    virtual int GetResult() =0;
public:
    double m_Num1;
    double m_Num2;
};
//工厂类，用于生产相应的算法子类
class OperationFactry
{
public:
    OperationFactry(void);
    ~OperationFactry(void);
public:
    static Operation* CreateOperate(int n )
    {
        switch(n)
        {
        case 1:
            return new OperationAdd;
            break;
        }
    }
};
//算法子类，由工厂类创建，重写父类中的虚函数
class OperationAdd：Public Operation
{
public:
    int GetResult();
}